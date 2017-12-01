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
public class CaloriasGastadas extends Observador implements Mostrar{
    private Observable sujeto;
    private float calorias;
    

    public CaloriasGastadas(Observable sujeto){
        this.sujeto=sujeto;
        this.eventosAObservar=new String[]{"correr","caminar"};
        this.sujeto.registrarObservador(this);
    }

    @Override
    public void actualizar(Observable o,String accion) {
        System.out.println("\n");
        System.out.println("Observador CaloriasGastadas recibe notificacion: "+accion);
        Persona p=(Persona)o;
        switch(accion){
            case "correr":calcularCaloriasCorrer(p);break;
            case "caminar":calcularCaloriasCaminar(p);break;
        }
        mostrar(); 
    }

    private void calcularCaloriasCorrer(Persona p) {
      calorias = (p.getVelocidad()<=8)?((.06f)*(p.getPeso()*2.2f)*p.getTiempo()):
                                     ((p.getVelocidad()<=11)?((.092f)*(p.getPeso()*2.2f)*p.getTiempo()):
                                     ((p.getVelocidad()<=13)?((.104f)*(p.getPeso()*2.2f)*p.getTiempo()):((.129f)*(p.getPeso()*2.2f)*p.getTiempo())));   
    }

    private void calcularCaloriasCaminar(Persona p) {
        calorias= (p.getVelocidad()<=5)?((.029f)*(p.getPeso()*2.2f)*p.getTiempo()):
                ((.048f)*(p.getPeso()*2.2f)*p.getTiempo());
    }

    public void mostrar() {        
        System.out.println("Ha consumido "+calorias+" para recuperarlas consuma: ");
        Hashtable <String,Integer> alims=Alimentos.getAlimentos();
        Set<String>keys= alims.keySet();
        for(String g:keys){
            if(alims.get(g)<=calorias){
                System.out.println(g);
            }
        }
    }

}
