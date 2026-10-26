package example.com.server.DTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class UsuarioRequestDTO {
    @NotBlank(message = "El nombre del usuario es obligatorio")
    @Size(min = 3, max = 100, message = "El nombre debe ser de 3-100 caracteres")
    private String nombre;
    @NotBlank(message = "El usuario es obligatorio")
    @Size(min = 3, max = 30, message = "El Usuario debe ser de 3-30 caracteres")
    @Pattern(regexp = "^[a-zA-Z0-9._-]+$", message = "El usuario solo puede contener letras sin acentos, números, puntos, guiones y guiones bajos")
    private String usuario;
    @NotBlank(message = "La contraseña es obigatoria")
    @Size(min = 8, max = 30, message = "El Usuario debe ser de 8-30 caracteres")
    private String password;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
