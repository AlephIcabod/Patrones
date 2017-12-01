
import java.awt.Color;
import java.awt.GridLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pumas
 */
public class EstacionDelClima {
    public static void main(String[] args) {
        DatosDelClima ddc= new DatosDelClima();
        JLabel mel=new JLabel();        
        JLabel cal=new JLabel();
        JLabel pcl=new JLabel();
        JLabel stl=new JLabel();
        CondicionesActuales ca = new CondicionesActuales(ddc,cal);
        MuestraEstadisticas me = new MuestraEstadisticas(ddc,mel);
        PronosticoDelClima pc = new PronosticoDelClima(ddc,pcl);
        SensacionTermica st=new SensacionTermica(ddc,stl);
        Grafica g=new Grafica(ddc);
        
        JFrame ventana=new JFrame("Estacion de clima");
        ventana.setLayout(new GridLayout(2,1));
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(500,400);
        ventana.add(g);
        JPanel panelDatos=new JPanel();
        panelDatos.setBackground(new Color(10,190,200));
        panelDatos.setLayout(new GridLayout(4,1));        
        panelDatos.add(mel);
        panelDatos.add(cal);
        panelDatos.add(pcl);
        panelDatos.add(stl);
        ventana.add(panelDatos);
        ventana.setVisible(true);
        while(true){            
            try {
                ddc.cambiaMedidas((float) Math.random()*100,(float) Math.random()*100,(float) Math.random()*100);
                ventana.repaint();
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(EstacionDelClima.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
