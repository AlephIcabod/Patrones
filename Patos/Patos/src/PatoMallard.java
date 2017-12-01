/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pumas
 */
public class PatoMallard extends Pato{
    
    public PatoMallard(){
        comportamientoGraznar = new Graznido();
        comportamientoVolar = new VuelaConAlas();
    }
    
    @Override
    public void mostrar() {
        System.out.println("Soy un pato mallar.");
    }
    
}
