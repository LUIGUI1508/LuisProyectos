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
public class Empleado extends Persona {
    private String idEmpleado;
    private Double sueldo;

    public Empleado() {
    }

    public Empleado(String idEmpleado, Double sueldo) {
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
}
