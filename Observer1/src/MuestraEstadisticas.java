
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
public class MuestraEstadisticas implements Observador,MuestraElemento{
    private ArrayList<Float> historia;
    private DatosDelClima datos;
    
    public MuestraEstadisticas(DatosDelClima d) {
        historia = new ArrayList<>();
        this.datos=d;
        datos.registrarObservador(this);
    }

    @Override
    public void actualiza(float temp, float humidity, float pressure) {
        historia.add(temp);
        mostrar();
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
        
        System.out.println("Promedio/Maxima/Minima = "+prom+"/"+max+"/"+min);
    }
    
}
