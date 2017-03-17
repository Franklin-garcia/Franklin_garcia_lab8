/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package franklin_garcia_lab8;

/**
 *
 * @author Franklin Garcia
 */
public class usuarios {
    private String nombre;
    private String apellido;
    private String apodo;
    private String usuario;
    private String contrasena;
    private String direccion;

    public usuarios() {
    }

    public usuarios(String nombre, String apellido, String apodo, String usuario, String contrasena, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.apodo = apodo;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
