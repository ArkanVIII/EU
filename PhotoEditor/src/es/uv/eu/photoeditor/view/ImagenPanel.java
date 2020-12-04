/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uv.eu.photoeditor.view;

import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author Sergio V
 */
public class ImagenPanel extends JPanel{
    private JPanel ipanel = new JPanel();
    
    public ImagenPanel(){
        
        this.add(ipanel);
    }
    
    public void addMiMouseListener(MouseListener ml) {
        ipanel.addMouseListener(ml);
    }
    
    public void mostrarImagen(BufferedImage imagen){
        
    }
}
