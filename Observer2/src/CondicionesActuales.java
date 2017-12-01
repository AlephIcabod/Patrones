
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
 * @author pumas
 */
public class CondicionesActuales implements Observer,MuestraElemento{
    private Observable obs;
    private float temperature;
    private float humidity;
    private JLabel label;

    public CondicionesActuales(Observable o,JLabel label) {
        this.obs = o;
        obs.addObserver(this);
        this.label=label;
    }
    
    @Override
    public void update(Observable o, Object o1) {
        if(o instanceof DatosDelClima){
            DatosDelClima ddc = (DatosDelClima)o;
            this.temperature=ddc.getTemperature();
            this.humidity = ddc.getHumidity();
            mostrar();
        }
    }

    @Override
    public void mostrar() {
        label.setText("Condiciones Actuales: "+temperature+"°F y "+humidity+"% de humedad.");
    }
    
}
