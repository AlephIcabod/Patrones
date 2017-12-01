/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aleph-Icabod
 */
public class PatitoHule extends Pato{
    
    public PatitoHule(){
        comportamientoGraznar = new Chirrio();
        comportamientoVolar = new NoVuelaNada();
    }
    
    @Override
    public void mostrar() {
        System.out.println("Soy un patito de hule");
    }   
}
