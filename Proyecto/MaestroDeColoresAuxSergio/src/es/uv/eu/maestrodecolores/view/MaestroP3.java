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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author danie
 */
public class MaestroP3 extends JFrame{
    private int k = 1;
    private MaestroMenus menu;
    Color Morado = new Color(153,51,255);
    Color MoradoOscuro = new Color(82,7,122);
    Color AzulOscuro = new Color(39,35,166);
    Color GrisFondo = new Color(234,231,231);
    
    private final Color[] colores8 = {Color.YELLOW, Color.BLUE, Color.CYAN, 
        Color.GRAY, Color.ORANGE, Color.BLACK, Color.RED, Color.GREEN};
    
    /*private final Color[] colores12 = {Color.RED, Color.BLUE, Color.GREEN, 
        Color.YELLOW, Color.GRAY, Color.ORANGE, Color.BLACK, Color.CYAN,
        Color.MAGENTA, Color.PINK, Color.WHITE, Color.DARK_GRAY};
    
    private final Color[] colores16 = {Color.RED, Color.BLUE, Color.GREEN, 
        Color.YELLOW, Color.GRAY, Color.ORANGE, Color.BLACK, Color.CYAN,
        Color.MAGENTA, Color.PINK, Color.WHITE, Color.DARK_GRAY, Color.LIGHT_GRAY,
        Morado, AzulOscuro, MoradoOscuro};*/
    
    private final Color[] secuenciaP3 = new Color[4];
    private final JButton[] bcol = new JButton[8];
    private final String[] comandos = {"BcolP3.1", "BcolP3.2", "BcolP3.3", "BcolP3.4",
    "BcolP3.5", "BcolP3.6", "BcolP3.7", "BcolP3.8"};
    private JLabel titulo, eligecol;
    private JPanel p, plabels, pcolores, pbotones, pcoloresbox, pbotonesinf;
    private JButton color1, color2, color3, color4, volver, reset, continuar;
    
    public MaestroP3(){
        this.setLayout(new BorderLayout());
        this.setBounds(650, 350, 600, 475);
        
        menu=new MaestroMenus(1);
        p = new JPanel(new GridLayout(4,1,0,0));
        plabels = new JPanel(new GridLayout(1,1,0,0));
        pcolores = new JPanel(new GridLayout(2,1,10,10));
        pbotones = new JPanel(new FlowLayout(FlowLayout.CENTER,25,0));
        pcoloresbox = new JPanel(new FlowLayout(FlowLayout.CENTER,10,0));
        pbotonesinf = new JPanel(new FlowLayout(FlowLayout.CENTER,10,45));
        
        titulo = new JLabel("Turno de Jugador 1", JLabel.CENTER);
        titulo.setFont(new Font("Serif", Font.PLAIN, 27));
        p.add(titulo);
        
        eligecol = new JLabel("Elige tu combinación colores: ", JLabel.CENTER);
        eligecol.setFont(new Font("Serif", Font.PLAIN, 15));
        plabels.add(eligecol);
        p.add(plabels);
        
        color1 = new JButton();
        color2 = new JButton();
        color3 = new JButton();
        color4 = new JButton();
        color1.setPreferredSize(new Dimension(45,45));
        color2.setPreferredSize(new Dimension(45,45));
        color3.setPreferredSize(new Dimension(45,45));
        color4.setPreferredSize(new Dimension(45,45));
        color1.setBackground(GrisFondo);
        color2.setBackground(GrisFondo);
        color3.setBackground(GrisFondo);
        color4.setBackground(GrisFondo);
        pbotones.add(color1);
        pbotones.add(color2);
        pbotones.add(color3);
        pbotones.add(color4);
        pcolores.add(pbotones);
        
        for(int i=0;i<8;i++){
            bcol[i] = new JButton();
            bcol[i].setPreferredSize(new Dimension(30,30));
            bcol[i].setBackground(colores8[i]);
            bcol[i].setActionCommand(comandos[i]);
            pcoloresbox.add(bcol[i]);
        }
        
        pcolores.add(pcoloresbox);
        
        volver = new JButton("Volver");
        volver.setPreferredSize(new Dimension(125,40));
        volver.setActionCommand("VisualizarP2");
        reset = new JButton("Reset");
        reset.setPreferredSize(new Dimension(125,40));
        reset.setActionCommand("ResetP3");
        continuar = new JButton("Continuar");
        continuar.setPreferredSize(new Dimension(125,40));
        continuar.setActionCommand("VisualizarP4");
        
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
           for(int i=0;i<8;i++){
               bcol[i].addActionListener(al);
           }
    }
    
    public void setNombreJ1(String nombre){
        titulo.setText("Turno de " + nombre);
    }
    
    public void pintarSecuenciaP3(int i){
        bcol[i].setVisible(false);
        if (k == 1)
            color1.setBackground(colores8[i]);
        else if (k == 2)
            color2.setBackground(colores8[i]);
        else if (k == 3)
            color3.setBackground(colores8[i]);
        else
            color4.setBackground(colores8[i]);
        k++;
    }   
    
    /*public String[] setNumColores(int i){
        if (i == 8){
            return colores80;
        }
        else if(i == 12){
            return colores120;
        }
        else{
            return colores160;
        }
    }*/
    
    public void resetP3(){
        k=1;
        color1.setBackground(GrisFondo);
        color2.setBackground(GrisFondo);
        color3.setBackground(GrisFondo);
        color4.setBackground(GrisFondo);
        for(int i=0;i<8;i++){
            bcol[i].setVisible(true);
        }
    }
    
    public Color[] getSecuenciaP3(){
        secuenciaP3[0] = color1.getBackground();
        secuenciaP3[1] = color2.getBackground();
        secuenciaP3[2] = color3.getBackground();
        secuenciaP3[3] = color4.getBackground();
        return secuenciaP3;
    }
}
