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
public class SingletonCarrito {
    private static SingletonCarrito instance=null;
    private ArrayList<String> items;
    static int numIns=0;
    private SingletonCarrito(){
        this.items=new ArrayList<>();
        numIns++;
    }
    
    public static SingletonCarrito getInstance(){
        if(instance==null){
            synchronized(SingletonCarrito.class){
                if(instance==null)
                    instance=new SingletonCarrito();
            }            
           }        
        return instance;
    }
    
    public void addItem(String item) throws NullPointerException{
      if(instance!=null)
          instance.items.add(item);
      else
          throw new NullPointerException();
    }
    
    public ArrayList<String> getItems(){
        return items;
    }
    
    public int numIns(){
        return numIns;
    }
}
