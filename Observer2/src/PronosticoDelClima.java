
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
public class PronosticoDelClima implements Observer,MuestraElemento{
    private Observable obs;
    private float pressure;
    private float pressureAnterior=-1;
    private JLabel label;
    
    public PronosticoDelClima(Observable o,JLabel label){
        this.obs=o;
        obs.addObserver(this);
        this.label=label;
    }
    
    @Override
    public void update(Observable o, Object o1) {
        if (o instanceof DatosDelClima){
            DatosDelClima ddc = (DatosDelClima) o;
            this.pressure = ddc.getPressure();
            mostrar();
        }
    }

    @Override
    public void mostrar() {
        if (pressureAnterior==-1){
            label.setText("Primera Lectura");
        }else if(pressure < pressureAnterior){
            label.setText("Posible lluvia intensa");
        }else if (pressure > pressureAnterior){
            label.setText("Tal vez salga el sol");
        }else if (pressure == pressureAnterior){
            label.setText("El clima permanece igual");
        }
        pressureAnterior=pressure;
    }
    
}
