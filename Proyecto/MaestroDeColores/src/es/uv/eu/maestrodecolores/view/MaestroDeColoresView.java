/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uv.eu.maestrodecolores.view;

import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author sergv
 */
public class MaestroDeColoresView extends JFrame{
    private MaestroP1 p1=new MaestroP1();
    private MaestroP2 p2=new MaestroP2();
    public MaestroDeColoresView(){
        this.visualizarP1();
        
    }
    
    public void addMiActionListener(ActionListener al){
        p1.addMiActionListener(al);
        p2.addMiActionListener(al);
    }
    
    public void visualizarP1(){
        p2.setVisible(false);
        p1.setVisible(true);
        
    }
    public void visualizarP2(){
        p1.setVisible(false);
        p2.setVisible(true);
    }
    
    
}
