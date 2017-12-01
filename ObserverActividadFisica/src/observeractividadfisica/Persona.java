/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observeractividadfisica;

import java.util.ArrayList;
import java.util.Arrays;


/**
 *
 * @author Aleph-Icabod
 */
public class Persona implements Observable{
    
    private float peso;
    private float altura;
    private int edad;
    private char sexo;
    private int distancia;
    private int tiempo;
    private String comida;
    private ArrayList<Observador> observadores;

          
    public Persona(float peso, float altura, int edad, char sexo) {
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        this.sexo = sexo;        
        observadores=new ArrayList<Observador>();
    }
    
    public float getVelocidad(){
        return this.distancia/this.tiempo;
    }
    @Override
    public void registrarObservador(Observador o) {
        if(observadores.indexOf(o)<0){
            observadores.add(o);
        }
    }

    @Override
    public void quitaObservador(Observador o) {
        if(observadores.indexOf(o)>=0){
            observadores.remove(o);
        }
    }

    @Override
    public void notificaObservadores(String g) {
        observadores.forEach(item->{
           String[] eventos=item.getEventos();            
           if(Arrays.asList(eventos).contains(g))
               item.actualizar(this,g);
        });                
    }
    
    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public int getEdad() {
        return edad;
    }
    
    public char getSexo(){
        return sexo;
    }
    
    public int getDistancia(){
        return distancia;
    }
    
    public int getTiempo(){
        return tiempo;
    }
        
    public void correr(int distancia,int tiempo){
        this.distancia=distancia;
        this.tiempo=tiempo;    
        notificaObservadores("correr");
    }
    public void caminar(int distancia,int tiempo){
        this.distancia=distancia;
        this.tiempo=tiempo;        
        notificaObservadores("caminar");
    }
    
    public void comer(String comida){        
        this.comida = comida;
        notificaObservadores("comer");
    } 
    
    public String getComida(){
        return this.comida;
    }
}
