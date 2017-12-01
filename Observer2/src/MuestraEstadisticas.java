
import java.util.ArrayList;
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
public class MuestraEstadisticas implements Observer,MuestraElemento {  
    private ArrayList<Float> historia;
    private DatosDelClima datos;
    private JLabel label;
    
    public MuestraEstadisticas(DatosDelClima o,JLabel label ){
        historia = new ArrayList<>();
        this.datos = o;
        datos.addObserver(this);
        this.label=label;
    }
    
    @Override
    public void update(Observable o, Object o1) {
        if (o instanceof DatosDelClima){
            historia.add(((DatosDelClima) o).getTemperature());
            mostrar();
        }
    }

    @Override
    public void mostrar() {
        float prom=0;
        float min = (historia.size()>0) ? historia.get(0) : 0;
        float max = min;
        for (Float historia1 : historia) {
            if(historia1 <min)
                min = historia1;
            if(historia1 > max)
                max = historia1;
            prom+=historia1;
        }
        prom/=historia.size();
        label.setText("Temperatura Promedio: "+prom+"  Maxima:  "+max+"  Minima: "+min);
        //System.out.println("Promedio/Maxima/Minima = "+prom+"/"+max+"/"+min);
    }
    
}
