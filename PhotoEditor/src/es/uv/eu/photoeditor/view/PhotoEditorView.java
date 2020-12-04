/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uv.eu.photoeditor.view;

import es.uv.eu.photoeditor.model.PhotoEditorModel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Sergio V
 */
public class PhotoEditorView extends JFrame {
    private PhotoEditorMenuBar menu;
    private PhotoEditorModel modelo;
    private SelectPanel slp;
    private ImagenPanel ip;
    private StatusPanel stp;
    private Border border;
    
    public PhotoEditorView(PhotoEditorModel modelo){
        this.modelo=modelo;
        setLayout(new BorderLayout(5,5));
        setSize(900,700);
        
        menu = new PhotoEditorMenuBar();
        slp = new SelectPanel();
        ip = new ImagenPanel(modelo);
        stp = new StatusPanel();
        
        border = BorderFactory.createLineBorder (Color.LIGHT_GRAY,2);
        ip.setBorder(border);
        stp.setBorder(border);
        
        add(menu, BorderLayout.NORTH);
        add(slp, BorderLayout.WEST);
        add(ip, BorderLayout.CENTER);
        add(stp, BorderLayout.SOUTH);
    }

    public void addMiActionListener(ActionListener al) {
        menu.addMiActionListener(al);
        slp.addMiActionListener(al);
    }
    
    public void addMiChangeListener(ChangeListener cl) {
        slp.addMiChangeListener(cl);
    }
    
    public void addMiMouseListener(MouseListener ml) {
        ip.addMiMouseListener(ml);
    }
    
    public void setColorLabelPincel(String x){
        stp.setColorLabelPincel(x);
    }
    
    public void setColorLabelRelleno(String x){
        stp.setColorLabelRelleno(x);
    }
    
    public void setGrosorLabel(String x){
        stp.setGrosorLabel(x);
    }
}

