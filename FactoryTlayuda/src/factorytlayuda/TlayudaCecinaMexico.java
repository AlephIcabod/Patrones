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
class TlayudaCecinaMexico extends Tlayuda {

    public TlayudaCecinaMexico() {
    this.nombre="Tlayuda de Cecina Mexico";
        this.maiz="Negro";
        this.frijol="Bayo";
        this.base="Manteca";
        this.salsa="Salsa verde";
        this.cubierta.add("Col");        
        this.cubierta.add("Tomate");
        this.cubierta.add("Aguacate");        
        this.cubierta.add("Cecina");
    }

    @Override
    public void servir() {
        System.out.println("Sirviendo tlayuda de cecina en plato");
    }

    
}
