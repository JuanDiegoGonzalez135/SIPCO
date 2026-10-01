package example.com.server.controller;

import example.com.server.Utils.APIResponse;
import example.com.server.entity.Usuarios;
import example.com.server.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("sicop-api/usuarios")
public class UsuarioController {
    @Autowired
    UsuarioService service;

    @GetMapping("")
    public ResponseEntity<APIResponse>findAll(){
        APIResponse response = service.FindAll();
        return new ResponseEntity<>(response, response.getStatus());
    }

    @GetMapping("/{id}")
    public ResponseEntity<APIResponse>findByID(@PathVariable Long id){
        APIResponse response = service.FindByID(id);
        return new ResponseEntity<>(response, response.getStatus());
    }

    @PostMapping("")
    public ResponseEntity<APIResponse>create(@RequestBody Usuarios payload){
        APIResponse response = service.Create(payload);
        return new ResponseEntity<>(response, response.getStatus());
    }

    @PutMapping("/{id}")
    public ResponseEntity<APIResponse>update(@PathVariable Long id, @RequestBody Usuarios payload){
        APIResponse response = service.Create(payload);
        return new ResponseEntity<>(response, response.getStatus());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<APIResponse>delete(@PathVariable Long id){
        APIResponse response = service.Delete(id);
        return new ResponseEntity<>(response, response.getStatus());
    }

}
