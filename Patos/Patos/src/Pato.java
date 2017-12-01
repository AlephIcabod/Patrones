/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pumas
 */
public abstract class Pato {
    ComportamientoGraznar comportamientoGraznar;
    ComportamientoVolar comportamientoVolar;
    
    public abstract void mostrar();
    
    public void hazVolar(){
        comportamientoVolar.volar();
    }
    
    public void hazGraznar(){
        comportamientoGraznar.graznar();
    }
    
    public void nada(){
        System.out.println("Nada, como el pato.");
    }
    
    public void cambiaVueloAlVuelo(ComportamientoVolar cv){
        this.comportamientoVolar=cv;
    }
    
    public void cambiaGraznidoAlVuelo(ComportamientoGraznar cg){
        this.comportamientoGraznar = cg;
    }
    
}
