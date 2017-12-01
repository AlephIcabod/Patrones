/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlistadapter;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.basic.BasicListUI;

/**
 *
 * @author Aleph-Icabod
 */
public class JListAdapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame ventana=new JFrame("JList adapter");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                
        ventana.setLayout(new GridLayout(0,1));
        String elems[]={"Uno","Dos","Tres","Cuatro","Cinco","Seis","Siete"};
        ArrayList seleccionados=new ArrayList();
        JPanel cont=new JPanel();
        JList lista=new CheckAdapterJList(elems);
        JScrollPane desp=new JScrollPane(lista); 
        lista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        ventana.add(desp);
        ventana.add(cont);
        ventana.setVisible(true);       
        ventana.setSize(500,500);
    }
        
}
