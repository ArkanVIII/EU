/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uv.eu.photoeditor.view;

import es.uv.eu.photoeditor.model.PhotoEditorModel;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author Sergio V
 */
public class ImagenPanel extends JPanel{
    private JPanel ipanel = new JPanel();
    private PhotoEditorModel modelo;
    
    
    public ImagenPanel(PhotoEditorModel modelo){
        this.modelo=modelo;
        this.add(ipanel);
    }
    
    public void addMiMouseListener(MouseListener ml) {
        ipanel.addMouseListener(ml);
    }
    
    public void paintComponent(Graphics g){
        BufferedImage imagen;
        imagen=modelo.getImagen();
        if(imagen!=null){
            g.drawImage(imagen,0,0,imagen.getWidth(), imagen.getHeight(), this);
        }
    }
}
