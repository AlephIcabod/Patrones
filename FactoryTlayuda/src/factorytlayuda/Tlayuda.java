/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorytlayuda;

import java.util.ArrayList;

/**
 *
 * @author Aleph-Icabod
 */
public abstract class Tlayuda {
    protected String nombre,maiz,base,salsa,frijol;
    protected ArrayList cubierta=new ArrayList();
    
    public void preparar(){
        System.out.println("Preparando "+nombre);
        System.out.println("Agregando base de "+base);
        System.out.println("Agregando frijol "+frijol);
        System.out.println("Agregando salsa "+salsa);
        for(int i=0;i<cubierta.size();i++)
            System.out.println(" "+cubierta.get(i));
        calentar();        
        servir();
    }    
    public void calentar(){
        System.out.println("Calentando en las brazas");
    }
    public abstract void servir();
    
}
