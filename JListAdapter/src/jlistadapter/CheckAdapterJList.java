/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlistadapter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Aleph-Icabod
 */
public class CheckAdapterJList extends JList{    
    
    public CheckAdapterJList(){
        super();        
        init();         
        
    }
    public CheckAdapterJList(Object [] elems){
        super(elems);        
        init();
    }

    private void init(){
        this.setCellRenderer(new ItemAdapter());              
    }
    
    
    private class ItemAdapter extends JCheckBox implements ListCellRenderer<Object>{        
    public ItemAdapter(){
        super();
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends Object> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {        ;        
        this.setText(value.toString());
        this.setSelected(isSelected);
        if (isSelected){
            this.setBorder(BorderFactory.createMatteBorder(0,10,1,0, new Color(222, 188, 39, 255)));
            this.setBackground( new Color(22, 188, 39, 255));
            this.setForeground(Color.WHITE);
        }else{
            this.setBorder(BorderFactory.createMatteBorder(0,0,1,0, new Color(200, 10, 10, 50)));
            this.setBackground( Color.WHITE);
            this.setForeground(Color.BLACK);
        }
        return this;
    }

    
}

}
