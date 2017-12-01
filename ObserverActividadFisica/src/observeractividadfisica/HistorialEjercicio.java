/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observeractividadfisica;

import java.util.Hashtable;
import java.util.Set;

/**
 *
 * @author Aleph-Icabod
 */
public class HistorialEjercicio extends Observador implements Mostrar{
    private Observable sujeto;
    
    private Hashtable<String,Integer> historial;
        
    public HistorialEjercicio(Observable suj){
        this.sujeto=suj;
        this.eventosAObservar=new String[]{"correr","caminar"};
        this.sujeto.registrarObservador(this);
        this.historial=new Hashtable<String,Integer>();
    }
    
    @Override
    public void actualizar(Observable o, String accion) {
        System.out.println("\n");
        System.out.println("Observador Historial recibe notificacion: "+accion);
        try{
        Persona p=(Persona)o;
            this.historial.put(accion,p.getTiempo());
        }
        catch(ClassCastException e){
            System.err.println("Error el sujeto no es compatible");
        }
        mostrar();
    }

    @Override
    public void mostrar() {        
        System.out.println("Su historial de ejercicios es el siguiente: ");        
        Set<String> ejerci=this.historial.keySet();
        for(String e:ejerci){
            System.out.println(e+"\t\t"+historial.get(e)+" minutos");
        }                       
    }
    
}
