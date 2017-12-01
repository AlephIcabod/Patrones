/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pumas
 */
public class Baño implements Observador,MuestraElemento{
    private int tiempo;
    private float litros;
    private Sujeto suj;

    public Baño(Sujeto s) {
        this.suj=s;
        s.registrarObservador(this);
    }
    
    @Override
    public void actualizar(Persona s, String opcion) {
        switch(opcion){
            case "baño":
                tiempo = s.getTiempo();
                litros = 10*s.getTiempo();
                mostrar();
                break;
        }
    }

    @Override
    public void mostrar() {
        System.out.println("Se ha bañado "+tiempo+" minutos y se han gastado "+litros+" litros de agua");
    }
    
    
}
