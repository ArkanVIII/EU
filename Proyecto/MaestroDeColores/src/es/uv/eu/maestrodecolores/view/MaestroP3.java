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
public class MaestroP3 extends JFrame{
    private MaestroMenus menu;
    private MaestroDeColoresView vista;
    Color Morado = new Color(153,51,255);
    Color MoradoOscuro = new Color(82,7,122);
    Color AzulOscuro = new Color(39,35,166);
    
    private final Color[] colores8 = {Color.RED, Color.BLUE, Color.GREEN, 
        Color.YELLOW, Color.GRAY, Color.ORANGE, Color.BLACK, Color.CYAN};
    
    private final String[] colores80 = {"Sin color", "Rojo", "Azul", "Verde", "Amarillo",
    "Gris", "Naranja", "Negro", "Cyan"};
    
    private final Color[] colores12 = {Color.RED, Color.BLUE, Color.GREEN, 
        Color.YELLOW, Color.GRAY, Color.ORANGE, Color.BLACK, Color.CYAN,
        Color.MAGENTA, Color.PINK, Color.WHITE, Color.DARK_GRAY};
    
    private final Color[] colores16 = {Color.RED, Color.BLUE, Color.GREEN, 
        Color.YELLOW, Color.GRAY, Color.ORANGE, Color.BLACK, Color.CYAN,
        Color.MAGENTA, Color.PINK, Color.WHITE, Color.DARK_GRAY, Color.LIGHT_GRAY,
        Morado, AzulOscuro, MoradoOscuro};
    
    private JLabel titulo, eligecol;
    private JPanel p, ptitulo, pcolores, pbotones, pcoloresbox, pbotonesinf, rigid;
    private JComboBox col1, col2, col3, col4;
    private JButton color1, color2, color3, color4, volver, reset, continuar;
    
    public MaestroP3(){
        this.setLayout(new BorderLayout());
        this.setBounds(650, 350, 600, 400);
        
        menu=new MaestroMenus(1);
        p = new JPanel(new GridLayout(3,1,0,0));
        pcolores = new JPanel(new GridLayout(3,1,10,0));
        pbotones = new JPanel(new FlowLayout(FlowLayout.CENTER,25,0));
        pcoloresbox = new JPanel(new FlowLayout(FlowLayout.CENTER,10,15));
        pbotonesinf = new JPanel(new FlowLayout(FlowLayout.CENTER,10,45));
        
        titulo = new JLabel("Turno de Jugador 1", JLabel.CENTER);
        titulo.setFont(new Font("Serif", Font.PLAIN, 27));
        p.add(titulo);
        
        eligecol = new JLabel("Elige tu combinación colores: ", JLabel.CENTER);
        eligecol.setFont(new Font("Serif", Font.PLAIN, 15));
        pcolores.add(eligecol);
        
        color1 = new JButton();
        color2 = new JButton();
        color3 = new JButton();
        color4 = new JButton();
        color1.setPreferredSize(new Dimension(45,45));
        color2.setPreferredSize(new Dimension(45,45));
        color3.setPreferredSize(new Dimension(45,45));
        color4.setPreferredSize(new Dimension(45,45));
        pbotones.add(color1);
        pbotones.add(color2);
        pbotones.add(color3);
        pbotones.add(color4);
        pcolores.add(pbotones);
        
        col1 = new JComboBox(colores80); 
        col2 = new JComboBox(colores80);
        col3 = new JComboBox(colores80);
        col4 = new JComboBox(colores80);
        pcoloresbox.add(col1);
        pcoloresbox.add(col2);
        pcoloresbox.add(col3);
        pcoloresbox.add(col4);
        pcolores.add(pcoloresbox);
        
        volver = new JButton("Volver");
        volver.setPreferredSize(new Dimension(125,40));
        volver.setActionCommand("VisualizarP2desdeP3");
        reset = new JButton("Reset");
        reset.setPreferredSize(new Dimension(125,40));
        continuar = new JButton("Continuar");
        continuar.setPreferredSize(new Dimension(125,40));
        continuar.setActionCommand("VisualizarP3");
        
        pbotonesinf.add(volver);
        pbotonesinf.add(reset);
        pbotonesinf.add(continuar);       
        
        p.add(pcolores);
        p.add(pbotonesinf);
        
        this.add(p, BorderLayout.CENTER);
        
        this.add(menu, BorderLayout.NORTH);
    }
    public void addMiActionListener(ActionListener al){
           continuar.addActionListener(al);
           reset.addActionListener(al);
           volver.addActionListener(al);
           menu.addMiActionListener(al);
    }
    
    public void setNombreJ1(String nombre){
        titulo.setText("Turno de " + nombre);
    }
    
}
