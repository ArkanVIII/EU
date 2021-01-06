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
public class MaestroP6 extends JFrame{
    private MaestroDeColoresView vista;
    private JLabel tit, rank, pos, jug1, jug2, fecha, tupos;
    private JPanel p, ptitulo, pranking, ptabla, ptablaup, ptabladown, pboton, psur;
    private JLabel[] tabla = new JLabel[40];
    private JButton principal;  
    
    public MaestroP6(){
        this.setLayout(new BorderLayout());
        this.setBounds(650, 350, 600, 450);
        
        p = new JPanel(new BorderLayout(10,10));
        ptitulo = new JPanel(new FlowLayout());
        pranking = new JPanel(new BorderLayout(50,10));
        ptabla = new JPanel(new BorderLayout(0,10));
        ptablaup = new JPanel(new FlowLayout(FlowLayout.CENTER,95,0)); 
        ptabladown = new JPanel(new GridLayout(10,4,5,5));  
        pboton = new JPanel(new FlowLayout());
        psur = new JPanel(new BorderLayout(50,10));
        
        tit = new JLabel("Has perdido. ¡Más suerte la proxima vez!");
        tit.setFont(new Font("Serif", Font.PLAIN, 30));
        ptitulo.add(tit);
        
        rank = new JLabel("Ranking:");
        rank.setFont(new Font("Serif", Font.PLAIN, 25));
        
        pos = new JLabel("Posicion");
        pos.setFont(new Font("Serif", Font.PLAIN, 15));
        jug1 = new JLabel("Jugador 1");
        jug1.setFont(new Font("Serif", Font.PLAIN, 15));
        jug2 = new JLabel("Jugador 2");
        jug2.setFont(new Font("Serif", Font.PLAIN, 15));
        fecha = new JLabel("Fecha");
        fecha.setFont(new Font("Serif", Font.PLAIN, 15));
        
        ptablaup.add(pos);
        ptablaup.add(jug1);
        ptablaup.add(jug2);
        ptablaup.add(fecha);
        
        for(int i=0; i<40; i++){
            tabla[i] = new JLabel();
            tabla[i].setBackground(Color.WHITE);
            tabla[i].setFont(new Font("Sans", Font.BOLD, 10));
            tabla[i].setOpaque(true);
            ptabladown.add(tabla[i]);
        }
        
        pranking.add(rank, BorderLayout.NORTH);
        ptabla.add(ptablaup, BorderLayout.NORTH);
        ptabla.add(ptabladown, BorderLayout.CENTER);
        pranking.add(ptabla, BorderLayout.CENTER);
 
        
        principal = new JButton("P. Principal");
        principal.setPreferredSize(new Dimension(175,40));
        principal.setActionCommand("VolverPrincipal");
        pboton.add(principal);

        
        psur.add(pboton, BorderLayout.CENTER);
        
        p.add(ptitulo, BorderLayout.NORTH);
        p.add(pranking, BorderLayout.CENTER);
        p.add(psur, BorderLayout.SOUTH);
        
        this.add(p);
    }
    
    
}