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
class TlayudaCecinaOaxaca extends Tlayuda {

    public TlayudaCecinaOaxaca() {
      this.nombre="Tlayuda de Cecina Oaxaqueña";
        this.maiz="Amarillo";
        this.frijol="Bayo";
        this.base="Asiento";
        this.salsa="Salsa verde";
        this.cubierta.add("Lechuga");        
        this.cubierta.add("Aguacate");        
        this.cubierta.add("Cecina");
    }

    @Override
    public void servir() {
        System.out.println("Sirviendo tlayuda de cecina en canasta");
    }

    
}
