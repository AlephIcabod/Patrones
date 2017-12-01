/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pumas
 */
public class Aplicacion {
    public static void main(String[] args) {
        Persona p = new Persona(75.6f,1.69f,23,false);
        
        CaloriasYAlimentos cya = new CaloriasYAlimentos(p);
        Baño b = new Baño(p);
        MedicionPasos mp = new MedicionPasos(p);
        
        p.correr(2000,15,5,75);
        p.bañar(10);
    }
}
