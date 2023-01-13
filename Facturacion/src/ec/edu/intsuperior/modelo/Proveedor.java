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
public class Proveedor {
    private String idProveedor;
    private TipoProvedor tProvedor;

    public Proveedor() {
    }

    public Proveedor(String idProveedor, TipoProvedor tProvedor) {
        this.idProveedor = idProveedor;
        this.tProvedor = tProvedor;
    }

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public TipoProvedor gettProvedor() {
        return tProvedor;
    }

    public void settProvedor(TipoProvedor tProvedor) {
        this.tProvedor = tProvedor;
    }
    
    
}

