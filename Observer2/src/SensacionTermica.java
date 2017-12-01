
import java.util.Observable;
import java.util.Observer;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aleph-Icabod
 */
public class SensacionTermica implements Observer,MuestraElemento{
    private Observable obs;
    private float temperature;
    private float humidity;
    private JLabel label;
    public SensacionTermica(Observable o,JLabel label){
        this.obs=o;
        this.obs.addObserver(this);
        this.label=label;
    }
    
    
     private float calcularIndice(float t, float rh) {
        float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
            (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
            (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
            (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *  
            (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
            (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +     
            0.000000000843296 * (t * t * rh * rh * rh)) -
            (0.0000000000481975 * (t * t * t * rh * rh * rh)));
        return index;
    }

    @Override
    public void mostrar() {
        label.setText("La sensacion termica es: "+this.calcularIndice(temperature, humidity));
        //System.out.println("La sensacion termica es: "+this.calcularIndice(temperature, humidity));
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof DatosDelClima){
            DatosDelClima ddc = (DatosDelClima)o;
            this.temperature=ddc.getTemperature();
            this.humidity = ddc.getHumidity();
            mostrar();
        }
    }
}
