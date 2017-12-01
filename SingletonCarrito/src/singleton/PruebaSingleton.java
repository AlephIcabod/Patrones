/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.util.ArrayList;

/**
 *
 * @author Aleph-Icabod
 */
public class PruebaSingleton {
    public static void main(String[]ar){
        SingletonCarrito c1=SingletonCarrito.getInstance();
        c1.addItem("Chocolate");
        System.out.println("Numero de carritos: "+c1.numIns()+" Contiene "+c1.getItems().size()+" productos");
        SingletonCarrito c2=SingletonCarrito.getInstance();
        c2.addItem("Refresco");
        System.out.println("Numero de carritos: "+c2.numIns()+" Contiene "+c2.getItems().size()+" productos");
        SingletonCarrito c3=SingletonCarrito.getInstance();
        c3.addItem("Agua");
        c3.addItem("Aceite");
        System.out.println("Numero de carritos: "+c3.numIns()+" Contiene "+c3.getItems().size()+" productos");
        
        SingletonCarrito c4=SingletonCarrito.getInstance();
        ArrayList<String> products=c4.getItems();
        System.err.println("Los productos en el carrito son "+products.size());
        for(int i=0;i<products.size();i++)
            System.err.println(products.get(i));
    }
}
