/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pumas
 */
public class CondicionesActuales implements Observador,MuestraElemento{
    private float temperature;
    private float humidity;
    private Sujeto datosClima;

    public CondicionesActuales(Sujeto datosClima) {
        this.datosClima = datosClima;
        datosClima.registrarObservador(this);
    }
    
    @Override
    public void actualiza(float temp, float humidity, float pressure) {
        this.temperature=temp;
        this.humidity = humidity;
        mostrar();
    }

    @Override
    public void mostrar() {
        System.out.println("Condiciones Actuales: "+temperature+"°F y "+humidity+"% de humedad.");
    }
}
