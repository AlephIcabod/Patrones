/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pumas
 */
public class PatoModelo extends Pato{
    
    public PatoModelo(){
        comportamientoGraznar = new Graznido();
        comportamientoVolar = new NoVuelaNada();
    }
    
    @Override
    public void mostrar() {
        System.out.println("Soy un modelo de pato.");
    }
    
}
