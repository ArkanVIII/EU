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
    private int k = 0;
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
    
    private final Color[] colores12 = {GrisFondo, Color.RED, Color.BLUE, Color.GREEN, 
        Color.YELLOW, Color.GRAY, Color.ORANGE, Color.BLACK, Color.CYAN,
        Color.MAGENTA, Color.PINK, Color.WHITE, Color.DARK_GRAY};
    
    private final String[] colores120 = {"Sin color", "Rojo", "Azul", "Verde", "Amarillo",
    "Gris", "Naranja", "Negro", "Cyan", "Magenta", "Rosa", "Blanco", "Gris Ocuro"};
    
    private final Color[] colores16 = {GrisFondo, Color.RED, Color.BLUE, Color.GREEN, 
        Color.YELLOW, Color.GRAY, Color.ORANGE, Color.BLACK, Color.CYAN,
        Color.MAGENTA, Color.PINK, Color.WHITE, Color.DARK_GRAY, Color.LIGHT_GRAY,
        Morado, AzulOscuro, MoradoOscuro};
    
    private final String[] colores160 = {"Sin color", "Rojo", "Azul", "Verde", "Amarillo",
    "Gris", "Naranja", "Negro", "Cyan", "Magenta", "Rosa", "Blanco", "Gris Ocuro",
    "Gris Claro", "Morado", "Azul Oscuro", "Morado Oscuro"};
    
    private JLabel titulo, eligecol, aviso;
    private JPanel p, plabels, pcolores, pbotones, pcoloresbox, pbotonesinf, rigid;
    private JComboBox col1, col2, col3, col4, colaux=new JComboBox(colores80);
    private JButton color1, color2, color3, color4, volver, reset, continuar;
    
    public MaestroP3(){
        this.setLayout(new BorderLayout());
        this.setBounds(650, 350, 600, 450);
        
        menu=new MaestroMenus(1);
        p = new JPanel(new GridLayout(4,1,0,0));
        plabels = new JPanel(new GridLayout(2,1,0,0));
        pcolores = new JPanel(new GridLayout(2,1,10,0));
        pbotones = new JPanel(new FlowLayout(FlowLayout.CENTER,25,0));
        pcoloresbox = new JPanel(new FlowLayout(FlowLayout.CENTER,10,15));
        pbotonesinf = new JPanel(new FlowLayout(FlowLayout.CENTER,10,45));
        
        titulo = new JLabel("Turno de Jugador 1", JLabel.CENTER);
        titulo.setFont(new Font("Serif", Font.PLAIN, 27));
        p.add(titulo);
        
        eligecol = new JLabel("Elige tu combinación colores: ", JLabel.CENTER);
        eligecol.setFont(new Font("Serif", Font.PLAIN, 15));
        plabels.add(eligecol);
        
        aviso = new JLabel("AVISO: Elige de izquierda a derecha, en caso de algun inconveniente pulse reset.", JLabel.CENTER);
        aviso.setFont(new Font("Serif", Font.PLAIN, 15));
        plabels.add(aviso);
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
        
        col1 = new JComboBox(colores80);
        col1.setActionCommand("ComboBox1");
        col2 = new JComboBox(colores80);
        col2.setActionCommand("ComboBox2");
        col3 = new JComboBox(colores80);
        col3.setActionCommand("ComboBox3");
        col4 = new JComboBox(colores80);
        col4.setActionCommand("ComboBox4");
        pcoloresbox.add(col1);
        pcoloresbox.add(col2);
        pcoloresbox.add(col3);
        pcoloresbox.add(col4);
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
           col1.addActionListener(al);
           col2.addActionListener(al);
           col3.addActionListener(al);
           col4.addActionListener(al);
    }
    
    public void setNombreJ1(String nombre){
        titulo.setText("Turno de " + nombre);
    }
    
    public void setColorBot(int i, int j){
        System.out.println("SCB/ i: "+i+" j: "+j+" k: "+k);
        if (j == 1){
            if(k==1)
                color1.setBackground(colores8[i]);
            else if(k==2)
                color1.setBackground(colores7[i]);
            else if(k==3)
                color1.setBackground(colores6[i]);
            else
                color1.setBackground(colores5[i]);
        }
            
        else if (j == 2){
            if(k==1)
                color2.setBackground(colores8[i]);
            else if(k==2)
                color2.setBackground(colores7[i]);
            else if(k==3)
                color2.setBackground(colores6[i]);
            else
                color2.setBackground(colores5[i]);
        }
        else if (j == 3){
            if(k==1)
                color3.setBackground(colores8[i]);
            else if(k==2)
                color3.setBackground(colores7[i]);
            else if(k==3)
                color3.setBackground(colores6[i]);
            else
                color3.setBackground(colores5[i]);
        }
        else
            if(k==1)
                color4.setBackground(colores8[i]);
            else if(k==2)
                color4.setBackground(colores7[i]);
            else if(k==3)
                color4.setBackground(colores6[i]);
            else
                color4.setBackground(colores5[i]); 
    }
    
    public int getObjetoCombo(int j){
        System.out.println("k: "+k);
        int i = 0;
        switch(j){
            case 1:
                i = col1.getSelectedIndex();
                col2.removeItemAt(i);
                col3.removeItemAt(i);
                col4.removeItemAt(i);
                
                break;
            case 2:
                i = col2.getSelectedIndex();
                //col1.removeItemAt(i);
                col3.removeItemAt(i);
                col4.removeItemAt(i);
                break;
            case 3:
                i = col3.getSelectedIndex();
                //col1.removeItemAt(i);
                //col2.removeItemAt(i);
                col4.removeItemAt(i);
                break;
            case 4:
                i = col4.getSelectedIndex();
                //col1.removeItemAt(i);
                //col2.removeItemAt(i);
                //col3.removeItemAt(i);
        }
        this.refreshColores8(i);
        //this.refreshColores80(i);
        System.out.println("i: "+i);
        
        k++;
        return i;
    }
    
    public void refreshColores8(int i){
        switch(k){
            case 0:
                for(int j=0;j<9;j++){
                if(j!=i){
                    if(j<i)
                        colores7[j]=colores8[j];
                    else
                        colores7[j-1]=colores8[j];
                    }
                }
                break;
                    
            case 1:
                for(int j=0;j<8;j++){
                    if(j!=i){
                        if(j<i)
                            colores6[j]=colores7[j];
                        else
                            colores6[j-1]=colores7[j];
                    }
                }
                break;
                
            case 2:
                for(int j=0;j<7;j++){
                    if(j!=i){
                        if(j<i)
                            colores5[j]=colores6[j];
                        else
                            colores5[j-1]=colores6[j];
                    }
                }
                break;
        }
    }        
    
    public String[] setNumColores(int i){
        if (i == 8){
            return colores80;
        }
        else if(i == 12){
            return colores120;
        }
        else{
            return colores160;
        }
     
    }
    
    public void resetP3(){
        k=0;
        color1.setBackground(colores8[0]);
        color2.setBackground(colores8[0]);
        color3.setBackground(colores8[0]);
        color4.setBackground(colores8[0]);
        
        col1.removeAllItems();
        col2.removeAll();
        col3.removeAllItems();
        col4.removeAll();
        
        
        
        /*for(int i=0;i<9;i++){
            col1.addItem(colores80[i]);
            col2.addItem(colores80[i]);
            col3.addItem(colores80[i]);
            col4.addItem(colores80[i]);
        }*/
        
        /*col1=new JComboBox(colores80);
        col2=new JComboBox(colores80);
        col3=new JComboBox(colores80);
        col4=new JComboBox(colores80);*/
        
        //col4=colaux;
        //col1.setSelectedIndex(0);
        /*col1.setSelectedItem("Sin color");
        col2=colaux;
        col2.setSelectedIndex(0);
        col3=colaux;
        col3.setSelectedIndex(0);
        col4=colaux;
        col4.setSelectedIndex(0);*/
    }
}
