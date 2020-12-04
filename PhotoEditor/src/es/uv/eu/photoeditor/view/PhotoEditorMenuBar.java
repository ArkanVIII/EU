/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uv.eu.photoeditor.view;

import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Sergio V
 */
public class PhotoEditorMenuBar extends JMenuBar{
    private JMenu archivo, ayuda;
    private JMenuItem cargar, guardar,salir;
    
    public PhotoEditorMenuBar(){
        archivo = new JMenu("Archivo");
        salir = new JMenuItem("Salir");
        cargar = new JMenuItem("Cargar");
        guardar = new JMenuItem("Guardar");
        
        salir.setActionCommand("ItemSalir");
        cargar.setActionCommand("ItemCargar");
        guardar.setActionCommand("ItemGuardar");
        
        archivo.add(salir);
        archivo.add(cargar);
        archivo.add(guardar);
        
        this.add(archivo);
        
        ayuda = new JMenu("Ayuda");
        
        ayuda.setActionCommand("ItemAyuda");
        
        this.add(ayuda);
    }
    
    public void addMiActionListener (ActionListener al){
        salir.addActionListener(al);
        cargar.addActionListener(al);
        guardar.addActionListener(al);
        ayuda.addActionListener(al);
    }
}
