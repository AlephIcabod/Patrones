/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composerejemplo1;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 *
 * @author Aleph-Icabod
 */
public class ComposerEjemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto computadora=new ProductoAgregado("Computadora de escritorio",4500.00);
        Producto monitor=new ProductoSimple("Monitor LCD",800.00);
        Producto gabinete=new ProductoAgregado("Gabinete horizontal",700.00);
        Producto portatil=new ProductoSimple("Computadora portatil",8000.00);
        Producto lectora=new ProductoSimple("Lectora de CD y DVD",500.00);
        try{
        computadora.agregar(monitor);
        computadora.agregar(gabinete);
        gabinete.agregar(lectora);
        lectora.agregar(monitor);
        }catch(NotImplementedException e){
            System.out.println("No se puede agregar un hijo a un producto simple");
        }
    }
    
}
