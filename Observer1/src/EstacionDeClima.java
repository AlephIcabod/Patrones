/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pumas
 */
public class EstacionDeClima {
    public static void main(String[] args) {
        DatosDelClima ddc = new DatosDelClima();
        
        CondicionesActuales ca = new CondicionesActuales(ddc);
        MuestraEstadisticas me = new MuestraEstadisticas(ddc);
        PronosticoDelClima pc = new PronosticoDelClima(ddc);
        
        ddc.colocaValores(80, 65, 30.4f);
        ddc.colocaValores(82, 70, 29.2f);
        ddc.colocaValores(78, 90, 29.2f);
    }
}
