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
public class TlayuderiaMexico extends Tlayuderia{

    @Override
    protected Tlayuda creaTlayuda(String nombre) {
        switch(nombre){
            case "Tazajo":return new TlayudaTazajoMexico();
            case "Cecina":return new TlayudaCecinaMexico();
            case "Costilla":return new TlayudaCostillaMexico();
            default:return null;
        }
    }
    
}
