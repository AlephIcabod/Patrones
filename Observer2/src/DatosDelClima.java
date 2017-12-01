
import java.util.Observable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pumas
 */
public class DatosDelClima extends Observable{
    private float temperature;
    private float humidity;
    private float pressure;

    public DatosDelClima() {
    }
    
    public void medidasCambian(){
        setChanged();
        notifyObservers();
    }
    
    public void cambiaMedidas(float temp,float humidity,float pressure){
        this.humidity=humidity;
        this.temperature=temp;
        this.pressure=pressure;
        medidasCambian();
    }
    
      public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
    
}
