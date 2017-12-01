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
public class RecomendadorEjercicio extends Observador implements Mostrar{
    private Observable sujeto;
    private String alimento;
    private int caloriasConsumidas;
    private float peso;    
    
    public RecomendadorEjercicio(Observable o){
        this.sujeto=o;
        this.sujeto.registrarObservador(this);
        this.eventosAObservar=new String[]{"comer"};
    }
    
    @Override
    public void actualizar(Observable o, String accion) {
        System.out.println("\n");
        System.out.println("Observador Recomendador recibe notificacion: "+accion);
        Persona p=(Persona)o;
        this.alimento=p.getComida();
        this.peso=p.getPeso();
        this.caloriasConsumidas=Alimentos.getAlimentos().get(alimento);        
        mostrar();               
    }

    public float calcularTiempo(String ejer,int v){        
        float tiempo=0;
        if(ejer=="caminar"){
            tiempo=v<=5?caloriasConsumidas/((.029f)*(peso*2.2f)):    
            caloriasConsumidas/((.048f)*(peso*2.2f));
        }else{
            tiempo=(v<=8)?caloriasConsumidas/((.06f)*(peso*2.2f)):
                                     ((v<=11)?caloriasConsumidas/((.092f)*(peso*2.2f)):
                                     ((v<=13)?caloriasConsumidas/((.104f)*(peso*2.2f)):
                                       caloriasConsumidas/((.129f)*(peso*2.2f))));   
        }
        return tiempo;            
    }
    @Override
    public void mostrar() {        
        System.out.println("Has consumido "+caloriasConsumidas+" calorias te recomendamos hacer lo siguiente");
        System.out.println("Caminar lento durante "+calcularTiempo( "caminar", 5)+" minutos");
        System.out.println("Caminar rapido durante "+calcularTiempo( "caminar", 6)+" minutos");
        System.out.println("Correr lento  durante "+calcularTiempo( "correr", 5)+" minutos");
        System.out.println("Correr moderadamente  durante "+calcularTiempo( "correr", 10)+" minutos");
        System.out.println("Correr rapido  durante "+calcularTiempo( "correr", 15)+" minutos");
        
    }
    
}
