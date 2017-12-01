
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pumas
 */
public class Persona implements Sujeto{
    
    private float peso;
    private float altura;
    private int edad;
    private boolean sexo;
    private int distancia;
    private int tiempo;
    private int velocidad;
    private int zancada;
    private ArrayList observadores;

       
    
    public Persona(float peso, float altura, int edad, boolean sexo) {
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        this.sexo = sexo;
        observadores=new ArrayList();
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
            ((Observador)item).actualizar(this,g);
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
    
    public boolean getSexo(){
        return sexo;
    }
    
    public int getDistancia(){
        return distancia;
    }
    
    public int getTiempo(){
        return tiempo;
    }
    
    public int getVelocidad(){
        return velocidad;
    }
    
    public int getZancada(){
        return zancada;
    }
    
    public void correr(int distancia,int tiempo,int velocidad,int zancada){
        this.distancia=distancia;
        this.tiempo=tiempo;
        this.velocidad=velocidad;
        this.zancada=zancada;
        notificaObservadores("correr");
    }
    public void caminar(int distancia,int tiempo,int velocidad,int zancada){
        this.distancia=distancia;
        this.tiempo=tiempo;
        this.velocidad=velocidad;
        this.zancada=zancada;
        notificaObservadores("caminar");
    }
    public void bañar(int tiempo){
        this.tiempo = tiempo;
        notificaObservadores("baño");
    }
}
