
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
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
 * @author Aleph-Icabod
 */
public class Grafica extends JPanel implements Observer,MuestraElemento{
    private Observable obs;
    private ArrayList<Float> temperature;
    private ArrayList<Float> humidity;

    public Grafica(Observable o){
        super();
        this.obs=o;
        this.temperature=new ArrayList();
        this.humidity=new ArrayList();
        obs.addObserver(this);        
    }
    
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof DatosDelClima){
            DatosDelClima ddc = (DatosDelClima)o;
            this.temperature.add(ddc.getTemperature());
            this.humidity.add(ddc.getHumidity());
            mostrar();
        }
    }

    @Override
    public void mostrar() {
        this.removeAll();
        this.repaint();
    }

    @Override
    public void paint(Graphics g) {                    
        g.setColor(Color.BLACK);        
        g.drawLine(10,20,10,this.getHeight()-10);
        g.drawLine(10,this.getHeight()-10,this.getWidth()/2-10,this.getHeight()-10);
        g.drawString("Temperatura",this.getWidth()/4-"Temperatura".length(),20);
        g.setColor(Color.ORANGE);        
        for(int i=0;i<temperature.size();i++){                       
            g.fillRect(i*(this.getWidth()/2-11)/temperature.size()+11
                    ,this.getHeight()-10-(temperature.get(i).intValue()),
                    (this.getWidth()/2-11)/temperature.size(),
                    temperature.get(i).intValue());
        }
        
        g.setColor(Color.BLACK);        
        g.drawLine(this.getWidth()/2+10,20,this.getWidth()/2+10,this.getHeight()-10);
        g.drawLine(this.getWidth()/2+10,this.getHeight()-10,this.getWidth()-10,this.getHeight()-10);
        g.drawString("Humedad",3*this.getWidth()/4-"Humedad".length(),20);
        g.setColor(Color.BLUE);        
        for(int i=0;i<humidity.size();i++){                       
            g.fillRect(i*(this.getWidth()/2-11)/humidity.size()+11+this.getWidth()/2
                    ,this.getHeight()-10-(humidity.get(i).intValue()),
                    (this.getWidth()/2-11)/humidity.size(),
                    humidity.get(i).intValue());
        }
        
    }
    
    
    
}
