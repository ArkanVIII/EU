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
    private MaestroP4 p4=new MaestroP4();
    public MaestroDeColoresView(){
        this.visualizarP1();
        
    }
    
    public void addMiActionListener(ActionListener al){
        p1.addMiActionListener(al);
        p2.addMiActionListener(al);
        p3.addMiActionListener(al);
        p4.addMiActionListener(al);
    }
    
    public void visualizarP1(){
        p1.setVisible(true);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
    }
    
    public void visualizarP2(){
        p1.setVisible(false);
        p2.setVisible(true);
        p3.setVisible(false);
        p4.setVisible(false);
    }
    
    public void visualizarP3(){
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(true);
        p4.setVisible(false);
    }
    
    public void visualizarP4(){
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(true);
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
    
    public void getNumColores(){
        int i = p2.getNumColores();
        //p3.setNumColores(i); 
    }
    
    public void getObjetoCombo(int j){
        int i = p3.getObjetoCombo(j);
        p3.setColorBot(i, j);
    }
    
    public void resetP3(){
        p3.resetP3();
    }

    public void pintar(int contador){
        p4.pintar(contador);
    }
    
    public void resetCombo(){
        p4.resetCombo();
    }
}
