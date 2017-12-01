/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componenteseleccion;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Miguel Angel Bautista Cruz 13161086
 */
public class ComponenteSeleccion extends JPanel implements ItemListener{
    
    private String[] Categorias;
    private ArrayList[] Opciones;
    private JComboBox categorias;
    private JList lista; 
    private boolean multiple;
    private JLabel titulo;
    
    public ComponenteSeleccion(){
        super();
        this.categorias=new JComboBox();
        this.lista=new JList();
        this.titulo=new JLabel("Componente seleccion");
        this.Categorias=new String[]{"Categoria 1","Categoria 2"};
        this.Opciones=new ArrayList[this.Categorias.length];
        this.Opciones[0]=new ArrayList();
        this.Opciones[0].add("Subcategoria 1");
        this.Opciones[0].add("Subcategoria 2");
        this.Opciones[1]=new ArrayList();
        this.Opciones[1].add("SubOpcion 1");
        this.Opciones[1].add("SubOpcion 2");        
        DefaultListModel model=new DefaultListModel();
        for(int i=0;i<this.Opciones[0].size();i++)
            model.addElement(this.Opciones[0].get(i));
        DefaultComboBoxModel modelC=new DefaultComboBoxModel(this.Categorias);        
        categorias.setModel(modelC);
        lista.setModel(model);
        this.categorias.addItemListener(this);
        this.multiple=true;
        this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        if (multiple){
            this.lista.setSelectionMode(DefaultListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        }else{
            this.lista.setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION);
        }
        JScrollPane scroll=new JScrollPane(lista);        
        this.add(titulo);
        this.add(categorias);
        this.add(scroll);        
        
    }
    
    public boolean isMultiple(){
        return this.multiple;
    }
    public void setMultiple(boolean b){
        this.multiple=b;
        if(multiple){
            this.lista.setSelectionMode(DefaultListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        }else{
            this.lista.setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION);
        }
    } 
    
    public void setCategorias(String[] c){
        this.Categorias=c;
        this.categorias.setModel(new DefaultComboBoxModel(this.Categorias));
        this.Opciones=null;
        this.lista.setModel(new DefaultListModel());
    }
    public String[] getCategorias(){
        return this.Categorias;
    }
    
    public String getSelectedCategoria(){
        return this.categorias.getSelectedItem().toString();
    }
    
    public void setOpciones(Object[][] opciones){
        if(opciones.length==this.Categorias.length){
            this.Opciones=new ArrayList[this.Categorias.length];
            for(int i=0;i<opciones.length;i++){
                this.Opciones[i]=new ArrayList();
                for(int j=0;j<opciones[i].length;j++)
                    this.Opciones[i].add(opciones[i][j]);
            }
            DefaultListModel model=new DefaultListModel();
            for(int i=0;i<this.Opciones[0].size();i++)
                model.addElement(this.Opciones[0].get(i));
            this.lista.setModel(model);
            this.setMultiple(multiple);
        }else{
            this.Opciones=null;
        }
    }
    
    public void setTitulo(String t){
        this.titulo.setText(t);
    }
    
    public String getTitulo(){
        return this.titulo.getText();
    }
    
    public Object[] getSelecteds(){
        try{
            ArrayList selec=(ArrayList)this.lista.getSelectedValuesList();
            return selec.toArray();
        }
        catch(Exception e){
            return new  Object[0];
        }
        
    }
    
    public void setSelectedCategoria(int index){
        if (index<this.Categorias.length&&index>=0){
            this.categorias.setSelectedIndex(index);
        }
    }
    public Object[] getOptionsSelectedCategoria(int index){
        return this.Opciones[index].toArray();        
    }
       
    
    
    @Override
    public void itemStateChanged(ItemEvent e) {
        int x=this.categorias.getSelectedIndex();
        DefaultListModel model=new DefaultListModel();
        this.lista.removeAll();
        for(int i=0;i<this.Opciones[x].size();i++)
            model.addElement(this.Opciones[x].get(i));
        this.lista.setModel(model);                
        this.repaint();
    }
    
    
    
}
