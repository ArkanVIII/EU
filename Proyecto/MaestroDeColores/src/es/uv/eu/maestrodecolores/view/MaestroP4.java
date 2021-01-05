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
    
    private final Color[] colores8 = {GrisFondo, Color.YELLOW, Color.BLUE, Color.CYAN, 
        Color.GRAY, Color.ORANGE, Color.BLACK, Color.RED, Color.GREEN};
    
    private final Color[] colores7 = new Color[8];
    private final Color[] colores6 = new Color[7];
    private final Color[] colores5 = new Color[6];
    
    private final String[] colores80 = {"Sin color", "Amarillo", "Azul", "Cyan", "Gris",
    "Naranja", "Negro", "Rojo", "Verde"};
    
    private JPanel p, pizq, pcentro, pder, pinf;
    private JComboBox col1, col2, col3, col4;
    private JButton comprobar;
    private JButton[] botGrandes = new JButton[20];
    private JButton[] botPequenyos = new JButton[20];
    
    public MaestroP4(){
        this.setLayout(new BorderLayout());
        this.setBounds(650, 350, 600, 450);
        
        menu=new MaestroMenus(1);
        p = new JPanel(new BorderLayout(25,25)); 
        pizq = new JPanel(new GridLayout(4,1,5,5));
        pcentro = new JPanel(new GridLayout(5,4,10,10));
        pder = new JPanel(new GridLayout(5,4,15,37));
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
        
        for(int i = 0; i<20; i++){
            botGrandes[i] = new JButton();
            pcentro.add(botGrandes[i]);
        }
        
        for(int i = 0; i<20; i++){
            botPequenyos[i] = new JButton();
            pder.add(botPequenyos[i]);
        }
        
        comprobar = new JButton("Comprobar");
        comprobar.setPreferredSize(new Dimension(175,40));
        pinf.add(comprobar);
        
        p.add(pizq, BorderLayout.WEST);
        p.add(pcentro, BorderLayout.CENTER);
        p.add(pder, BorderLayout.EAST);
        p.add(pinf, BorderLayout.SOUTH);
        
        this.add(p);
        
        this.add(menu, BorderLayout.NORTH);
    }

    public void addMiActionListener(ActionListener al){
           menu.addMiActionListener(al);
           comprobar.addActionListener(al);
    }
    
    public void pintar(int cont){
        if (cont == 1){
            botGrandes[16].setBackground(colores8[col1.getSelectedIndex()]);
            botGrandes[17].setBackground(colores8[col2.getSelectedIndex()]);
            botGrandes[18].setBackground(colores8[col3.getSelectedIndex()]);
            botGrandes[19].setBackground(colores8[col4.getSelectedIndex()]);
        }
        else if (cont == 2){
            botGrandes[12].setBackground(colores8[col1.getSelectedIndex()]);
            botGrandes[13].setBackground(colores8[col2.getSelectedIndex()]);
            botGrandes[14].setBackground(colores8[col3.getSelectedIndex()]);
            botGrandes[15].setBackground(colores8[col4.getSelectedIndex()]);
        }
        else if (cont == 3){
            botGrandes[8].setBackground(colores8[col1.getSelectedIndex()]);
            botGrandes[9].setBackground(colores8[col2.getSelectedIndex()]);
            botGrandes[10].setBackground(colores8[col3.getSelectedIndex()]);
            botGrandes[11].setBackground(colores8[col4.getSelectedIndex()]);
        }
        else if (cont == 4){
            botGrandes[4].setBackground(colores8[col1.getSelectedIndex()]);
            botGrandes[5].setBackground(colores8[col2.getSelectedIndex()]);
            botGrandes[6].setBackground(colores8[col3.getSelectedIndex()]);
            botGrandes[7].setBackground(colores8[col4.getSelectedIndex()]);
        }
        else{
            botGrandes[0].setBackground(colores8[col1.getSelectedIndex()]);
            botGrandes[1].setBackground(colores8[col2.getSelectedIndex()]);
            botGrandes[2].setBackground(colores8[col3.getSelectedIndex()]);
            botGrandes[3].setBackground(colores8[col4.getSelectedIndex()]);
        }
    }
    
    public void resetCombo(){
        col1.setSelectedIndex(0);
        col2.setSelectedIndex(0);
        col3.setSelectedIndex(0);
        col4.setSelectedIndex(0);
    }
}
