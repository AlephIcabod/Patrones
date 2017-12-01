/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composerejemplo1;

import java.util.ArrayList;

/**
 *
 * @author Aleph-Icabod
 */
public class ProductoAgregado extends Producto{
    private ArrayList<Producto> hijos;
    public ProductoAgregado(){
        this.descripcion="Producto agregado nuevo";
        this.hijos=new ArrayList();
        this.precio=0.0;
    }
    
    public ProductoAgregado(ArrayList<Producto> p){
        this.hijos=p;
        this.descripcion="Producto agregado nuevo";
        this.precio=0.0;
    }
    public ProductoAgregado(String desc,double p){
        this.descripcion=desc;
        this.precio=p;
        this.hijos=new ArrayList();
    }
    public Producto getHijo(int i){
        if (i<hijos.size()){
            return hijos.get(i);
        }else return null;
    }
    
    public void agregar(Producto p){
        this.hijos.add(p);            
    }
    
    public void remove(Producto p){
        this.hijos.remove(p);
    }
}
