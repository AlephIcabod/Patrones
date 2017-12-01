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
public class ObserverActividadFisica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p=new Persona(75.6f,1.69f,23,'H');
        HistorialEjercicio historial=new HistorialEjercicio(p);
        CaloriasGastadas calorias=new CaloriasGastadas(p);       
        RecomendadorEjercicio recomendador=new RecomendadorEjercicio(p);                
        p.caminar(120, 15);         
        p.correr(300,3);
        p.comer("1 pieza de Tortilla de maíz");
        calorias.cambiarAccionesObservar(new String[]{"correr"});
        p.caminar(200,18);
    }
    
}
