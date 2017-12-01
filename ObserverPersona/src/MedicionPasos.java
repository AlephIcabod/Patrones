/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pumas
 */
public class MedicionPasos implements Observador,MuestraElemento{
    private float pasos;
    private int distancia;
    private Sujeto suj;
    
    public MedicionPasos(Sujeto s) {
        this.suj=s;
        s.registrarObservador(this);
    }
    
    @Override
    public void actualizar(Persona s, String opcion) {
        switch(opcion){
            case "correr":
            case "caminar":
                distancia = s.getDistancia();
                pasos = (s.getDistancia()/s.getZancada())*100;
                mostrar();
                break;
        }
    }

    @Override
    public void mostrar() {
        System.out.println("Recorrió "+distancia+" metros en "+pasos+ " pasos");
    }
    
}
