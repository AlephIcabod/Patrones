/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composerejemplo1;

/**
 *
 * @author Aleph-Icabod
 */
public class ProductoSimple extends Producto{
    
    public ProductoSimple(){
        this.descripcion="Nuevo producto simple";
        this.precio=0.0;
    }
    
    public ProductoSimple(String d,double p){
        this.descripcion=d;
        this.precio=p;
    }
}
