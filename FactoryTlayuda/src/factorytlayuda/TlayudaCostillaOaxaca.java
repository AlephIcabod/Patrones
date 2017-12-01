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
class TlayudaCostillaOaxaca extends Tlayuda {

   
    public TlayudaCostillaOaxaca() {
        this.nombre="Tlayuda de Costilla Oaxaqueña";
        this.maiz="Amarillo";
        this.frijol="Negro";
        this.base="Aciento";
        this.salsa="Sin salsa";
        this.cubierta.add("Verdura Lechuga");
        this.cubierta.add("Tomate");
        this.cubierta.add("Aguacate");
        this.cubierta.add("Costilla");
    }

    @Override
    public void servir() {
        System.out.println("Sirviendo tlayuda de costilla en canasta");
    }
}
