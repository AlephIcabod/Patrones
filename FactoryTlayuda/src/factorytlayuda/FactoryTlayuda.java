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
public class FactoryTlayuda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Tlayuderia oaxaca=new TlayuderiaOaxaca();
       Tlayuderia mexico=new TlayuderiaMexico();
       Tlayuda tazajoOaxaca=oaxaca.ordenarTlayuda("Tazajo");
       Tlayuda tazajoMexico=mexico.ordenarTlayuda("Tazajo");
    }
    
}
