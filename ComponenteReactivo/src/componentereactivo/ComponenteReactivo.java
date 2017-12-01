/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentereactivo;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Aleph-Icabod
 */
public class ComponenteReactivo extends JPanel{
    private JRadioButton[] opciones;
    private JLabel  descripcion;
    private int respuesta,ponderacion;    

    public ComponenteReactivo(){
        super();
        this.opciones=new JRadioButton[3];
        this.opciones[0]=new JRadioButton("Opcion 1");
        this.opciones[1]=new JRadioButton("Opcion 2");
        this.opciones[2]=new JRadioButton("Opcion 3");
        this.descripcion=new JLabel("Reactivo");
        this.respuesta=-1;
        this.ponderacion=0;
        repintar();
    }
    
    public String[] getOpciones() {
        String[] aux=new String[opciones.length];
        for(int i=0;i<opciones.length;i++)
            aux[i]=opciones[i].getText();
        return aux;
    }

    public void setOpciones(String[] opciones) {
        this.opciones = new JRadioButton[opciones.length];
        for(int i=0;i<opciones.length;i++){
            this.opciones[i]=new JRadioButton();
            this.opciones[i].setText(opciones[i]);
            this.opciones[i].setActionCommand(opciones[i]);
        
        }
        repintar();
    }

    public String getDescripcion() {
        return this.descripcion.getText();
    }

    public void setDescripcion(String descripcion) {
        this.descripcion.setText(descripcion);
    }

    public int getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(int respuesta) {
        if(respuesta<=this.opciones.length&&respuesta>0)
            this.respuesta = respuesta-1;                    
    }

    public int getPonderacion() {
        if (this.isCorrect())
        return ponderacion;
        else
            return 0;
    }

    public void setPonderacion(int ponderacion) {
        this.ponderacion = ponderacion;
    }
    
    private void repintar(){        
        this.removeAll();
        this.repaint();        
        this.add(this.descripcion);
        ButtonGroup grupo=new ButtonGroup();
        for(int i=0;i<this.opciones.length;i++){
            grupo.add(this.opciones[i]);
            this.add(this.opciones[i]);
        }
        this.setSize(this.getWidth()+10,this.getHeight());
    }

    public boolean isCorrect(){
        int checked=-1;
        for(int i=0;i<this.opciones.length;i++){
           if(opciones[i].isSelected())
               checked=i;
        }
        if(checked>=0){
            return checked==this.respuesta;
        }
        else return false;
    }
    
  
      
}
