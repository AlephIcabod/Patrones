/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorytlayuda;

/**
 *
 * @author Aleph-Icabod
 */
public class TlayuderiaOaxaca extends Tlayuderia{

    @Override
    protected Tlayuda creaTlayuda(String nombre) {        
        switch(nombre){
            case "Tazajo":return new TlayudaTazajoOaxaca();
            case "Cecina":return new TlayudaCecinaOaxaca();
            case "Costilla":return new TlayudaCostillaOaxaca();
            default:return new TlayudaTazajoOaxaca();
        }        
    }
    
}
