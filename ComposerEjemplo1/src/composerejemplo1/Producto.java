/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composerejemplo1;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 *
 * @author Aleph-Icabod
 */
public abstract class Producto {
    protected String descripcion;
    protected double precio;
    
    public String getDescripcion(){
        return this.descripcion;
    }
    public double getPrecio(){
        return this.precio;
    }
    
    public Producto getHijo(int i){
        throw new NotImplementedException();
    }
    public void agregar(Producto p){
        throw new NotImplementedException();
    }
    public void remove(Producto p){
        throw new NotImplementedException();
    }
}
