/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uv.eu.photoeditor.view;

import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Sergio V
 */
public class SelectPanel extends JPanel{
    private LineWidthPanel lwp;
    private ColorPanel cp1,cp2;
    private Border border;
    
    public SelectPanel(){
     
        setLayout(new GridLayout(3,1,5,5));
        setSize(900,700);
        
        lwp = new LineWidthPanel();
        border = BorderFactory.createLineBorder (Color.LIGHT_GRAY,2);
        lwp.setBorder(border);
        
        cp1 = new ColorPanel("Color de línea:", 0);
        cp1.setBorder(border);
        
        cp2 = new ColorPanel("Color de relleno:", 1);
        cp2.setBorder(border);
        
        
        add(lwp);
        add(cp1);
        add(cp2);
    }
    
    public void addMiActionListener(ActionListener al) {
        cp1.addMiActionListener(al);
        cp2.addMiActionListener(al);   
    }
    
    public void addMiChangeListener(ChangeListener cl) {
        lwp.addMiChangeListener(cl);
    }
}
