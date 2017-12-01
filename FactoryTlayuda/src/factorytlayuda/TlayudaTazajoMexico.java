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
class TlayudaTazajoMexico extends Tlayuda {

    public TlayudaTazajoMexico() {
    this.nombre="Tlayuda de tazajo Mexico";
        this.maiz="Negro";
        this.frijol="Bayo";
        this.base="Manteca";
        this.salsa="Roja";
        this.cubierta.add("Col");
        this.cubierta.add("Tomate");
        this.cubierta.add("Aguacate");
        this.cubierta.add("Tazajo");
    }

    @Override
    public void servir() {
        System.out.println("Sirviendo tlayuda de tazajo en plato");
    }
    
    
}
