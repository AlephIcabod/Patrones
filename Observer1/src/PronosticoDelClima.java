/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pumas
 */
public class PronosticoDelClima implements Observador,MuestraElemento{
    private float pressure;
    private Sujeto datosClima;
    private float pressureAnterior=-1;
    
    public PronosticoDelClima(Sujeto ddc){
        this.datosClima=ddc;
        datosClima.registrarObservador(this);
    }
    
    @Override
    public void actualiza(float temp, float humidity, float pressure) {
        this.pressure=pressure;
        mostrar();
    }

    @Override
    public void mostrar() {
        if (pressureAnterior==-1){
            System.out.println("Comenzamos con esto");
        }else if(pressure < pressureAnterior){
            System.out.println("El clima puede cambiar a una lluvia un poco intensa");
        }else if (pressure > pressureAnterior){
            System.out.println("El clima mejorará; posible salida del Sol");
        }else if (pressure == pressureAnterior){
            System.out.println("Seguimos con el mismo pronóstico");
        }
        pressureAnterior=pressure;
    }
    
}
