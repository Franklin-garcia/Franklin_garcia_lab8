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
public class contactos extends usuarios {
    
    private int numero_telefono;
    private int numero_celular;
    private String correo;
    private int postal;
    private String ciudad;
    private String calle;
    
    
    public contactos() {
        super();
    }

    public contactos(int numero_telefono, int numero_celular, String correo, int postal, String ciudad, String calle, String nombre, String apellido, String apodo, String usuario, String contrasena, String direccion) {
        super(nombre, apellido, apodo, usuario, contrasena, direccion);
        this.numero_telefono = numero_telefono;
        this.numero_celular = numero_celular;
        this.correo = correo;
        this.postal = postal;
        this.ciudad = ciudad;
        this.calle = calle;
    }

    public int getNumero_telefono() {
        return numero_telefono;
    }

    public void setNumero_telefono(int numero_telefono) {
        this.numero_telefono = numero_telefono;
    }

    public int getNumero_celular() {
        return numero_celular;
    }

    public void setNumero_celular(int numero_celular) {
        this.numero_celular = numero_celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getPostal() {
        return postal;
    }

    public void setPostal(int postal) {
        this.postal = postal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }
    
}
