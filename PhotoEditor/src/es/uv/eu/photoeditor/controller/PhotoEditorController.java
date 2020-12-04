/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uv.eu.photoeditor.controller;

import es.uv.eu.photoeditor.model.PhotoEditorModel;
import es.uv.eu.photoeditor.view.LoadImage;
import es.uv.eu.photoeditor.view.PhotoEditorView;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Sergio V
 */
public class PhotoEditorController {
    private PhotoEditorView vista;
    private PhotoEditorModel modelo;
    
    public PhotoEditorController(PhotoEditorModel m, PhotoEditorView v){
        vista=v;
        modelo=m;
        
        vista.addMiActionListener(new MiActionListener());
        vista.addMiChangeListener(new MiChangeListener());
        vista.addMiMouseListener(new MiMouseListener());
    }
    
    class MiActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e)
        {
            String command = e.getActionCommand();
            switch (command) {
                case "ItemSalir":
                    System.exit(0);
                    break;
                    
                case "ItemCargar":
                    LoadImage file = new LoadImage();
                    File f=file.getFile();
                    modelo.loadImagen(f);
                    //modelo.pintaPoligono(poly, 0, Color.yellow, Color.yellow);
                    //vista.
                    break;
                
                case "ItemGuardar":
                    
                    break;
                
                case "ItemAyuda":
                    
                    break;
                
                case "0"://Negro
                case "1"://Cyan  
                case "2"://Gris Oscuro
                case "3"://Gris
                case "4"://Gris Claro
                case "5"://Magenta
                case "6"://Naranja
                case "7"://Rosa
                case "8"://Amarillo
                case "9"://Blanco
                case "10"://Rojo
                case "11"://Azul
                case "12"://Verde
                    vista.setColorLabelPincel(command);
                    break;

                case "13"://Negro
                case "14"://Cyan  
                case "15"://Gris Oscuro
                case "16"://Gris
                case "17"://Gris Claro
                case "18"://Magenta
                case "19"://Naranja
                case "20"://Rosa
                case "21"://Amarillo
                case "22"://Blanco
                case "23"://Rojo
                case "24"://Azul
                case "25"://Verde
                    vista.setColorLabelRelleno(command);
                    break;    
            }
        }
    }
    
    class MiChangeListener implements ChangeListener{
        @Override
        public void stateChanged(ChangeEvent e) {
            String grosor;
            int x;
            JSlider slider = (JSlider)e.getSource();
            x = slider.getValue();
            grosor = String.valueOf(x);
            vista.setGrosorLabel(grosor);
        }
    }
    
    class MiMouseListener extends MouseAdapter{
        @Override
        public void mouseClicked(MouseEvent e) {
            
        }
        
        @Override
        public void mousePressed(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}