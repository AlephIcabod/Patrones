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
class TlayudaCostillaMexico extends Tlayuda {

    public TlayudaCostillaMexico() {
    this.nombre="Tlayuda de Costilla Mexico";
        this.maiz="Amarillo oscuro";
        this.frijol="Bayo";
        this.base="Manteca";
        this.salsa="Salsa roja";
        this.cubierta.add("Verdura col");
        this.cubierta.add("Tomate");
        this.cubierta.add("Aguacate");
        this.cubierta.add("Costilla");
    }

    @Override
    public void servir() {
        System.out.println("Sirviendo tlayuda de costilla en plato");
    }
    
}
