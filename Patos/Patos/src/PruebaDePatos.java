/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pumas
 */
public class PruebaDePatos {
    public static void main(String[] args) {
        Pato mallard = new PatoMallard();
        mallard.mostrar();
        mallard.hazGraznar();
        mallard.hazVolar();
        
        Pato modelo = new PatoModelo();
        modelo.mostrar();
        modelo.hazVolar();
        modelo.cambiaVueloAlVuelo(new VuelaConCohete());
        modelo.hazVolar();
        
        Pato hule =new PatitoHule();
        hule.mostrar();
        hule.hazVolar();
        hule.hazGraznar();
    }
}
