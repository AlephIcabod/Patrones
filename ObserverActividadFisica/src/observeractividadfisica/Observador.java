/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observeractividadfisica;

/**
 *
 * @author Aleph-Icabod
 */
public abstract class Observador {
    protected String[] eventosAObservar; 
    public abstract void actualizar(Observable o,String accion);
    
    public void cambiarAccionesObservar(String [] nuevas){
        this.eventosAObservar=nuevas;
    }
    
    public String[] getEventos(){
        return eventosAObservar;                
    }
}
