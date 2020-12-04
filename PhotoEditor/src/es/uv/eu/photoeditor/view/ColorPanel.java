/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uv.eu.photoeditor.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Sergio V
 */
public class ColorPanel extends JPanel{
    
    private JButton[] botones = new JButton[13];
    private JLabel titulo=new JLabel();
    private String[] bcolores={"Negro","Cyan","Gris Oscuro","Gris","Gris Claro","Magenta",
                               "Naranja","Rosa","Amarillo","Blanco","Rojo","Azul","Verde"};
    public static final Color[] colores={Color.black, Color.cyan, Color.darkGray, Color.gray,
                                         Color.lightGray, Color.magenta, Color.orange, Color.pink, 
                                         Color.yellow, Color.white, Color.red, Color.blue, Color.green};
    public static final String[] comando1={"0","1","2","3","4","5","6","7","8","9","10","11","12"};
    public static final String[] comando2={"13","14","15","16","17","18","19","20","21","22","23","24","25"};
    
    public ColorPanel(String labtit, int sel){
        setLayout(new GridLayout(7,2,8,8));
        titulo.setText(labtit);
        this.add(titulo);
        for(int i=0;i<13;i++){
            botones[i] = new JButton(bcolores[i]);
            botones[i].setBackground(colores[i]);
            botones[i].setFont(new Font("Sans", Font.BOLD, 10));
            
            if(bcolores[i]=="Negro"||bcolores[i]=="Gris Oscuro"||bcolores[i]=="Azul")
                botones[i].setForeground(Color.white);
            else
                botones[i].setForeground(Color.black);

            if(sel==0)
                botones[i].setActionCommand(comando1[i]);
            else
                botones[i].setActionCommand(comando2[i]);
            
            this.add(botones[i]);
            
        }
    }
    
    public void addMiActionListener(ActionListener al){
        for(int i=0;i<13;i++)
        {
           botones[i].addActionListener(al);
        }
    }    
}
