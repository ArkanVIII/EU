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
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author sergv
 */
public class MaestroP2 extends JFrame{
    private MaestroMenus menu;
    private final String[] colores = {"8", "12", "16"}; 
    private JButton[] botonescol= new JButton[3];
    private final String[] intentos = {"5", "8", "10"}; 
    private JButton[] botonesint= new JButton[3];
    private JLabel dif, col, inten, jug, nombrej1, nombrej2;
    private JTextField nombre1, nombre2;
    private JButton volver, continuar1;
    private JPanel p, pdif, pdifcol, pdifint, pjug, pjugadores, pjugador1, pjugador2, pbotones;

    public MaestroP2(){
        this.setLayout(new BorderLayout());
        this.setBounds(650, 350, 600, 400);
        
        menu=new MaestroMenus(1);
        // CREACION DE LOS PANELES DONDE SE DISTRIBUYEN LOS COMPONENTES
        p = new JPanel(new GridLayout(3,1,10,10));
        pdif = new JPanel(new GridLayout(3,1,4,4));
        pdifcol = new JPanel(new FlowLayout());
        pdifint = new JPanel(new FlowLayout());
        pbotones = new JPanel(new FlowLayout(FlowLayout.CENTER,150,40));
        
        //JLABELS DE DIFICULTAD Y COLORES
        dif = new JLabel("Dificultad:");
        dif.setFont(new Font("Serif", Font.PLAIN, 25));
        dif.setHorizontalTextPosition(FlowLayout.LEFT);
        col = new JLabel("Colores:");
        col.setFont(new Font("Serif", Font.PLAIN, 15));
        
        //CREACION DE LOS BOTONES DE COLORES Y INTENTOS
        pdifcol.add(col);
        for(int i=0;i<3;i++){
            botonescol[i] = new JButton(colores[i]);
         
            botonescol[i].setBackground(Color.LIGHT_GRAY);
            botonescol[i].setForeground(Color.BLACK);
            botonescol[i].setFont(new Font("Sans", Font.BOLD, 15));
            
            botonescol[i].setActionCommand(colores[i]);
            
            pdifcol.add(botonescol[i]);     
        }
        
        inten = new JLabel("Intentos:");
        inten.setFont(new Font("Serif", Font.PLAIN, 15)); 
        
        pdifint.add(inten);
        for(int i=0;i<3;i++){
            botonesint[i] = new JButton(intentos[i]);
         
            botonesint[i].setBackground(Color.LIGHT_GRAY);
            botonesint[i].setForeground(Color.BLACK);
            botonesint[i].setFont(new Font("Sans", Font.BOLD, 15));
            if (i == 1)
                botonesint[i].setActionCommand("8.1");
            else
                botonesint[i].setActionCommand(intentos[i]);
            
            pdifint.add(botonesint[i]);
        }

        //PANELES PARA LOS COMPONENTES QUE RECOJEN LA INFORMACION DE LOS JUGADORES
        pjug = new JPanel(new GridLayout(2,1,4,4));
        pjugadores = new JPanel(new FlowLayout(FlowLayout.CENTER,100,10));
        pjugador1 = new JPanel(new GridLayout(2,1,4,4));
        pjugador2 = new JPanel(new GridLayout(2,1,4,4));
        
        // 
        jug = new JLabel("Jugadores: ");
        jug.setFont(new Font("Serif", Font.PLAIN, 25));

        nombrej1 = new JLabel ("Nombre 1");
        nombre1 = new JTextField(10);
        nombre1.setOpaque(true);
        nombre1.setVisible(true);
        nombrej2 = new JLabel ("Nombre 2");
        nombre2 = new JTextField(10);
        nombre2.setVisible(true);
        nombre2.setOpaque(true);
        
        volver = new JButton("Volver");
        volver.setPreferredSize(new Dimension(125,40));
        volver.setActionCommand("VisualizarP1");
        continuar1 = new JButton("Continuar");
        continuar1.setPreferredSize(new Dimension(125,40));
        continuar1.setActionCommand("VisualizarP3"); 
        
        //SE AÑADEN TODOS LOS COMPNENTES Y PANELES CREADOS AL PANEL PRINCIPAL P
        
        pdif.add(dif);   
        pdif.add(pdifcol);
        pdif.add(pdifint);
        p.add(pdif);
        
        pjug.add(jug);
        
        pjugador1.add(nombrej1);
        pjugador1.add(nombre1);
        pjugadores.add(pjugador1);
        
        pjugador2.add(nombrej2);
        pjugador2.add(nombre2);
        pjugadores.add(pjugador2);
        
        pjug.add(pjugadores);
        p.add(pjug); 
        
        pbotones.add(volver);
        pbotones.add(continuar1);
        
        p.add(pbotones);    
       
        this.add(p, BorderLayout.CENTER);
        
        this.add(menu, BorderLayout.NORTH);
    }
    public void addMiActionListener(ActionListener al){ 
           continuar1.addActionListener(al);
           volver.addActionListener(al);
           menu.addMiActionListener(al);
           for(int i=0;i<3;i++){
               botonescol[i].addActionListener(al);
               botonesint[i].addActionListener(al);
           }
    }    
    
    public void boton8select(){
        botonescol[0].setBackground(Color.red);
        botonescol[1].setBackground(Color.LIGHT_GRAY);
        botonescol[2].setBackground(Color.LIGHT_GRAY);
    }
    
    public void boton12select(){
        botonescol[1].setBackground(Color.red);
        botonescol[0].setBackground(Color.LIGHT_GRAY);
        botonescol[2].setBackground(Color.LIGHT_GRAY);
    }
    
    public void boton16select(){
        botonescol[2].setBackground(Color.red);
        botonescol[1].setBackground(Color.LIGHT_GRAY);
        botonescol[0].setBackground(Color.LIGHT_GRAY);
    }
    
    public void boton5select(){
        botonesint[0].setBackground(Color.red);
        botonesint[1].setBackground(Color.LIGHT_GRAY);
        botonesint[2].setBackground(Color.LIGHT_GRAY);
    }
    
    public void boton8selectint(){
        botonesint[1].setBackground(Color.red);
        botonesint[0].setBackground(Color.LIGHT_GRAY);
        botonesint[2].setBackground(Color.LIGHT_GRAY);
    }
    
    public void boton10select(){
        botonesint[2].setBackground(Color.red);
        botonesint[1].setBackground(Color.LIGHT_GRAY);
        botonesint[0].setBackground(Color.LIGHT_GRAY);
    }
    
    public String getNombreJ1(){
        String nombre;
        nombre = nombre1.getText();
        return nombre;
    }
}
