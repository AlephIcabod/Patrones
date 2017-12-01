/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorytlayuda;

/**
 *
 * @author Aleph-Icabod
 */
public abstract class Tlayuderia {
    protected abstract Tlayuda creaTlayuda(String nombre);
    public Tlayuda ordenarTlayuda(String nom){
        Tlayuda t=creaTlayuda(nom);
        t.preparar();        
        return t;
    }
}
