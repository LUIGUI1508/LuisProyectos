/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;
import ec.edu.intsuperior.modelo.Cliente;
import ec.edu.intsuperior.modelo.Persona;
import ec.edu.intsuperior.modelo.Producto;
import ec.edu.intsuperior.modelo.TipoProducto;
/**
 *
 * @author invitad
 */
public class Aplicacion {
    public static void main(String[] args) {
        TipoProducto tp1=  new TipoProducto("TP001", "PERIFERICO", "ACTIVO");
        Producto pr1= new Producto("p001", "Teclado", tp1, 10.50, 50, "Genius", "Advance", "SE001", null);
        System.out.println("Nombre del Producto 1: "+ pr1.getNombre());
        System.out.println("Tipo del Producto 1: "+ pr1.getTipoProducto().getDetalleTipo());
    }
    
}
