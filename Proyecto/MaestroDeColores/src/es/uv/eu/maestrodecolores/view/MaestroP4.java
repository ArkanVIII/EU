/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uv.eu.maestrodecolores.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/**
 *
 * @author danie
 */
public class MaestroP4 extends JFrame{
    private MaestroMenus menu;
    private MaestroDeColoresView vista;
    
    Color Morado = new Color(153,51,255);
    Color MoradoOscuro = new Color(82,7,122);
    Color AzulOscuro = new Color(39,35,166);
    Color GrisFondo = new Color(234,231,231);
    private final Color[] colores8 = {GrisFondo, Color.RED, Color.BLUE, Color.GREEN, 
        Color.YELLOW, Color.GRAY, Color.ORANGE, Color.BLACK, Color.CYAN};
    
    private final String[] colores80 = {"Sin color", "Rojo", "Azul", "Verde", "Amarillo",
    "Gris", "Naranja", "Negro", "Cyan"};
    
    private JPanel p, pizq, pinf;
    private JComboBox col1, col2, col3, col4;
    private JButton comprobar;
    
    public MaestroP4(){
        this.setLayout(new BorderLayout());
        this.setBounds(650, 350, 600, 400);
        
        menu=new MaestroMenus(1);
        p = new JPanel(new BorderLayout()); 
        pizq = new JPanel(new GridLayout(4,1,5,5));
        pinf = new JPanel(new FlowLayout());
        
        col1 = new JComboBox(colores80);
        col1.setActionCommand("ComboBoxP4.1");
        col2 = new JComboBox(colores80);
        col2.setActionCommand("ComboBoxP4.2");
        col3 = new JComboBox(colores80);
        col3.setActionCommand("ComboBoxP4.3");
        col4 = new JComboBox(colores80);
        col4.setActionCommand("ComboBoxP4.4");
        
        pizq.add(col1);
        pizq.add(col2);
        pizq.add(col3);
        pizq.add(col4);
        
        comprobar = new JButton("Comprobar");
        comprobar.setPreferredSize(new Dimension(175,40));
        pinf.add(comprobar);
        
        p.add(pizq, BorderLayout.WEST);
        p.add(new PanelCirculosGrandes());
        p.add(new PanelCirculosGrandes());
        p.add(pinf, BorderLayout.SOUTH);
        
        this.add(p);
        
        this.add(menu, BorderLayout.NORTH);
    }
    
    public class PanelCirculosGrandes extends JPanel{
        @Override
        public void paintComponent(Graphics g){
            
            int y = 20;
            for (int i = 0; i < 5; i++){
                int x = 120;
                for (int j = 0; j < 4; j++){
                    g.drawOval(x, y, 40, 40);
                    x = x + 50;  
                }
                y = y + 50;
            }
            
            y = 35;
            for (int i = 0; i < 5; i++){
                int x = 360;
                for (int j = 0; j < 4; j++){
                    g.drawOval(x, y, 10, 10);
                    x = x + 20;  
                }
                y = y + 50;
            }
        }
    }
    /*
    public class PanelCirculosPequeños extends JPanel{
        @Override
        public void paintComponent(Graphics g){
            
            int y = 40;
            for (int i = 0; i < 5; i++){
                int x = 200;
                for (int j = 0; j < 4; j++){
                    g.drawOval(x, y, 5, 5);
                    x = x + 30;  
                }
                y = y + 30;
            }
        }
    }
    */
    public void addMiActionListener(ActionListener al){
           
           menu.addMiActionListener(al);
           col1.addActionListener(al);
           col2.addActionListener(al);
           col3.addActionListener(al);
           col4.addActionListener(al);
    }
}
