/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uv.eu.maestrodecolores.view;

import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author sergv
 */
public class MaestroMenus extends JMenuBar{
    private JMenu ayuda;
    private JMenuItem descripcion, autores, salir;
    
    public MaestroMenus(int m){
        switch(m){
            case 1: //Menu P1
                ayuda=new JMenu("Ayuda");
                descripcion=new JMenuItem("Descripcion");
                autores=new JMenuItem("Autores");
                salir=new JMenuItem("Salir");

                descripcion.setActionCommand("ItemDescripcion");
                autores.setActionCommand("ItemAutores");
                salir.setActionCommand("Salir");

                ayuda.add(descripcion);
                ayuda.add(autores);
                ayuda.add(salir);
                
                this.add(ayuda);
                break;
                
            case 2: //Menu P2
                
                break;
        }
    }
    
    public void addMiActionListener (ActionListener al){
        descripcion.addActionListener(al);
        autores.addActionListener(al);
        salir.addActionListener(al);
        
    }
}
