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
class TlayudaTazajoOaxaca extends Tlayuda {

    public TlayudaTazajoOaxaca() {
        this.nombre="Tlayuda de tazajo Oaxaqueña";
        this.maiz="Amarillo";
        this.frijol="Negro";
        this.base="Aciento";
        this.salsa="Roja";
        this.cubierta.add("Verdura");
        this.cubierta.add("Tomate");
        this.cubierta.add("Aguacate");
        this.cubierta.add("Tazajo");
    }

    @Override
    public void servir() {
        System.out.println("Sirviendo tlayuda de tazajo en canasta");
    }
    
}
