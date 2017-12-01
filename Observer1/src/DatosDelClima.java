
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pumas
 */
public class DatosDelClima implements Sujeto{
    private float temperature;
    private float humidity;
    private float pressure;
    private ArrayList observadores;

    public DatosDelClima() {
        observadores = new ArrayList();
    }
           
    @Override
    public void registrarObservador(Observador o) {
        int index = observadores.indexOf(o);
        if (index<0)
            observadores.add(o);
    }

    @Override
    public void quitaObservador(Observador o) {
        int index = observadores.indexOf(o);
        if(index >= 0){
            observadores.remove(o);
        }
    }

    @Override
    public void notificaObservadores() {
        observadores.forEach(item->{
            Observador obs = (Observador)item;
            obs.actualiza(temperature, humidity, pressure);
        });
    }
    
    public void valoresCambian(){
        notificaObservadores();
    }
    
    public void colocaValores(float temp,float humidity,float pressure){
        this.temperature=temp;
        this.humidity=humidity;
        this.pressure=pressure;
        valoresCambian();
    }
}
