/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author invitad
 */
public abstract class Persona {
    private string cedula;
    private string nombre1;
    private string nombre2;
    private string apellido1;
    private string apellido2;
    private string direccion;
    private string telefono;
    private string email;

    public Persona() {
    }

    public Persona(string cedula, string nombre1, string nombre2, string apellido1, string apellido2, string direccion, string telefono, string email) {
        this.cedula = cedula;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public void setCedula(string cedula) {
        this.cedula = cedula;
    }

    public string getCedula() {
        return cedula;
    }

    public string getNombre1() {
        return nombre1;
    }

    public void setNombre1(string nombre1) {
        this.nombre1 = nombre1;
    }

    public string getNombre2() {
        return nombre2;
    }

    public void setNombre2(string nombre2) {
        this.nombre2 = nombre2;
    }

    public string getApellido1() {
        return apellido1;
    }

    public void setApellido1(string apellido1) {
        this.apellido1 = apellido1;
    }

    public string getApellido2() {
        return apellido2;
    }

    public void setApellido2(string apellido2) {
        this.apellido2 = apellido2;
    }

    public string getDireccion() {
        return direccion;
    }

    public void setDireccion(string direccion) {
        this.direccion = direccion;
    }

    public string getTelefono() {
        return telefono;
    }

    public void setTelefono(string telefono) {
        this.telefono = telefono;
    }

    public string getEmail() {
        return email;
    }

    public void setEmail(string email) {
        this.email = email;
    }

    private static class string {

        public string() {
        }
    }
    
    
}
