
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pumas
 */
public class CaloriasYAlimentos implements Observador,MuestraElemento{
    private Sujeto suje;
    private float caloriasConsumidas;
    private Hashtable<String,Integer> alimentos = new Hashtable<>();
    
    public CaloriasYAlimentos(Sujeto sujeto) {
        this.suje = sujeto;
        sujeto.registrarObservador(this);
        alimentos.put("Media taza de Arroz blanco cocido",70);
        alimentos.put("1 pieza de Tortilla de maíz", 70);
        alimentos.put("1/2 pieza de Bolillo sin migajon", 70);
        alimentos.put("1 pieza de Pan dulce", 115);
        alimentos.put("1 pieza de Jitomate", 25);
        alimentos.put("1/2 taza de cebolla blanca", 25);
        alimentos.put("1/2 chayote hervido", 25);
        alimentos.put("1 taza de leche entera", 150);
        alimentos.put("1 taza de yogurth natural", 150);
        alimentos.put("1/2 taza de frijol", 120);
        alimentos.put("1/2 taza de garbanzo", 120);
        alimentos.put("1/2 taza de lenjetas", 120);
    }   
    
    @Override
    public void actualizar(Persona s,String opcion) {
        switch(opcion){
            case "correr":
                caloriasConsumidas = (s.getVelocidad()<=8)?((.06f)*(s.getPeso()*2.2f)*s.getTiempo()):
                                     ((s.getVelocidad()<=11)?((.092f)*(s.getPeso()*2.2f)*s.getTiempo()):
                                     ((s.getVelocidad()<=13)?((.104f)*(s.getPeso()*2.2f)*s.getTiempo()):((.129f)*(s.getPeso()*2.2f)*s.getTiempo())));
                mostrar();
                break;
            case "caminar":
                caloriasConsumidas = (s.getVelocidad()<=5)?((.029f)*(s.getPeso()*2.2f)*s.getTiempo()):((.048f)*(s.getPeso()*2.2f)*s.getTiempo());
                mostrar();
                break;
        }
        
    }

    @Override
    public void mostrar() {
        System.out.println("Se han quemado "+caloriasConsumidas+" y algunos de los alimentos recomendados son:");
        Set<String> alim = alimentos.keySet();
        for(String g:alim){
            if(alimentos.get(g)<=caloriasConsumidas){
                System.out.println(g);
            }
        }
    }
    
}