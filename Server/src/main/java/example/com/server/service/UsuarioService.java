package example.com.server.service;

import example.com.server.DTOs.UsuarioRequestDTO;
import example.com.server.Utils.APIResponse;
import example.com.server.entity.Usuarios;
import example.com.server.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
    public APIResponse FindAll (){
        try {
            List<Usuarios> listUsuarios = usuarioRepository.findAll();
            return new APIResponse( listUsuarios, false, "Operacion Exitosa", HttpStatus.OK);
        }catch (Exception ex) {
            ex.printStackTrace();
            return new APIResponse(true, "Ha ocurrido un error", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public APIResponse FindByID(Long id){
        try {
            Optional <Usuarios> encontrado = usuarioRepository.findById(id);
            if (encontrado.isPresent()) {
                return new APIResponse( encontrado, false, "Operacion exitosa", HttpStatus.OK);
            }
            return new APIResponse(true, "Usuario no encontrado ", HttpStatus.NOT_FOUND);
        }catch (Exception ex) {
            ex.printStackTrace();
            return new APIResponse(true, "Ha ocurrido un error", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public APIResponse Create(UsuarioRequestDTO usuario){
        try {
            Usuarios u = new Usuarios();
            u.setNombre(usuario.getNombre());
            u.setUsuario(usuario.getUsuario());
            u.setPassword(usuario.getPassword());
            usuarioRepository.save(u);
            return new APIResponse( false, "Operacion exitosa", HttpStatus.CREATED);
        }catch (Exception ex) {
            ex.printStackTrace();
            return new APIResponse(true, "Ha ocurrido un error", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public APIResponse Update (Usuarios actualizado, Long id){
        try {
            Optional<Usuarios> encontrado = usuarioRepository.findById(id);
            if (encontrado.isPresent()){
                encontrado.get().setNombre(actualizado.getNombre());
                usuarioRepository.save(encontrado.get());
                return new APIResponse(false, "Operacion exitosa", HttpStatus.OK);
            }
            return new APIResponse(true, "Usuario no encontrado ", HttpStatus.NOT_FOUND);
        }catch (Exception ex) {
            ex.printStackTrace();
            return new APIResponse(true, "Ha ocurrido un error", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public APIResponse Delete (Long id){
        try {
            usuarioRepository.deleteById(id);
            return new APIResponse( false,"Operacion exitosa", HttpStatus.OK);
        }catch (Exception ex) {
            ex.printStackTrace();
            return new APIResponse(true, "Ha ocurrido un error", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
