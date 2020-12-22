/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uv.eu.maestrodecolores.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author sergv
 */
public class MaestroP1 extends JFrame{
    private MaestroMenus menu;
    private JPanel p, p1, p2, p3, ps1;
    private JLabel t;
    private JButton jj, jr, js;
    public MaestroP1(){
        this.setLayout(new BorderLayout());
        this.setBounds(650, 350, 600, 400);
        
        menu=new MaestroMenus(1);
        
        p=new JPanel();
        //p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        p.setLayout(new GridLayout(4,1,4,4));
        p1=new JPanel(new FlowLayout());
        p2=new JPanel(new FlowLayout());
        p3=new JPanel(new FlowLayout());
        ps1=new JPanel();
        
        t=new JLabel("¡Maestro de los colores!");
        t.setFont(new Font("Serif", Font.PLAIN, 35));
        jj=new JButton("Jugar");
        jj.setActionCommand("VisualizarP2");
        jj.setPreferredSize(new Dimension(350,75));
        jr=new JButton("Ranking");
        jr.setActionCommand("VisualizarP7");
        jr.setPreferredSize(new Dimension(173,40));
        js=new JButton("Salir");
        js.setActionCommand("Salir");
        js.setPreferredSize(new Dimension(173,40));
        
        p1.add(t);
        p2.add(jj);
        p3.add(jr);
        p3.add(js);
        p.add(ps1);
        p.add(p1);
        p.add(p2);
        p.add(p3);
        
        this.add(menu, BorderLayout.NORTH);
        this.add(p, BorderLayout.CENTER);
    }
    public void addMiActionListener(ActionListener al){
           jj.addActionListener(al);
           jr.addActionListener(al);
           js.addActionListener(al);
           menu.addMiActionListener(al);
    }    
}
