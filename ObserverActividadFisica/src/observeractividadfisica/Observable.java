/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observeractividadfisica;

/**
 *
 * @author Aleph-Icabod
 */
public interface Observable {
    
    public void registrarObservador(Observador o);
    public void quitaObservador(Observador o);
    public void notificaObservadores(String g);
}
