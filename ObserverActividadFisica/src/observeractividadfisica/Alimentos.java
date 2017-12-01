/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observeractividadfisica;

import java.util.Hashtable;

/**
 *
 * @author Aleph-Icabod
 */
public final class Alimentos {        
    private static Alimentos instance;
    private Hashtable<String,Integer> alimentos;
    
    private Alimentos(){  
        alimentos=new Hashtable<>();
            alimentos.put("Media taza de Arroz blanco cocido",70);
            alimentos.put("1 pieza de Tortilla de maíz", 70);
            alimentos.put("1/2 pieza de Bolillo sin migajon", 70);
            alimentos.put("1 pieza de Pan dulce", 115);
            alimentos.put("1 pieza de Jitomate", 25);
            alimentos.put("1/2 taza de cebolla blanca", 25);
            alimentos.put("1/2 chayote hervido", 25);
            alimentos.put("1 taza de leche entera", 150);
            alimentos.put("1 taza de yogurth natural", 150);
            alimentos.put("1/2 taza de frijol", 120);
            alimentos.put("1/2 taza de garbanzo", 120);
            alimentos.put("1/2 taza de lenjetas", 120);
    }
    public static Hashtable<String,Integer> getAlimentos(){
        if(instance==null){
            synchronized(Alimentos.class){
            if(instance==null)    
                instance=new Alimentos();
            } 
        }
        return instance.alimentos;        
    }
        
}
