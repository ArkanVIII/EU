/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uv.eu.maestrodecolores.view;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author sergv
 */
public class MaestroDeColoresView extends JFrame{
    private MaestroP1 p1=new MaestroP1();
    private MaestroP2 p2=new MaestroP2();
    private MaestroP3 p3=new MaestroP3();
    public MaestroDeColoresView(){
        this.visualizarP1();
        
    }
    
    public void addMiActionListener(ActionListener al){
        p1.addMiActionListener(al);
        p2.addMiActionListener(al);
        p3.addMiActionListener(al);
    }
    
    public void visualizarP1(){
        p2.setVisible(false);
        p1.setVisible(true);    
    }
    
    public void visualizarP2(){
        p1.setVisible(false);
        p2.setVisible(true);
    }
    
    public void visualizarP3(){
        p2.setVisible(false);
        p3.setVisible(true);
    }
    
    public void visualizarP2desdeP3(){
        p3.setVisible(false);
        p2.setVisible(true);
    }
    
    public void boton8select(){
        p2.boton8select();
    }
    
    public void boton12select(){
        p2.boton12select();
    }
    
    public void boton16select(){
        p2.boton16select();
    }
    
    public void boton5select(){
        p2.boton5select();
    }
    
    public void boton8selectint(){
        p2.boton8selectint();
    }
    
    public void boton10select(){
        p2.boton10select();
    }
    
    public void getNombreJ1(){
        String nombre;
        nombre=p2.getNombreJ1();
        p3.setNombreJ1(nombre);
    }
    
    
}
