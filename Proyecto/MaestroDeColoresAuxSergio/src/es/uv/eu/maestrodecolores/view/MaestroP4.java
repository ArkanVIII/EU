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
    private int k=1, cont=1;
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
    
    private JPanel p, pizq, pcentro, pder, pinf, pnort;
    private JLabel intentos;
    private JButton comprobar, reset;
    private JButton[] bcol = new JButton[8];
    private final String[] comandos = {"BcolP4.1", "BcolP4.2", "BcolP4.3", "BcolP4.4",
    "BcolP4.5", "BcolP4.6", "BcolP4.7", "BcolP4.8"};
    private JButton[] botGrandes = new JButton[20];
    private JButton[] botPequenyos = new JButton[20];
    private boolean [] aciertos = new boolean[4];
    
    public MaestroP4(){
        this.setLayout(new BorderLayout());
        this.setBounds(650, 350, 600, 475);
        
        menu=new MaestroMenus(1);
        p = new JPanel(new BorderLayout(25,25)); 
        pnort = new JPanel(new FlowLayout());
        pizq = new JPanel(new GridLayout(8,2,5,5));
        pcentro = new JPanel(new GridLayout(5,4,10,10));
        pder = new JPanel(new GridLayout(5,4,15,37));
        pinf = new JPanel(new FlowLayout());
        
        intentos = new JLabel("Intento Nº "+cont, JLabel.CENTER);
        intentos.setFont(new Font("Serif", Font.PLAIN, 15));
        pnort.add(intentos);
        
        for(int i=0;i<8;i++){
            bcol[i] = new JButton();
            bcol[i].setBackground(colores8[i]);
            bcol[i].setActionCommand(comandos[i]);
            pizq.add(bcol[i]);
        }
        
        for(int i = 0; i<20; i++){
            botGrandes[i] = new JButton();
            pcentro.add(botGrandes[i]);
        }
        
        for(int i = 0; i<20; i++){
            botPequenyos[i] = new JButton();
            pder.add(botPequenyos[i]);
        }
        
        reset = new JButton("Reset");
        reset.setPreferredSize(new Dimension(125,40));
        reset.setActionCommand("ResetP4");
        pinf.add(reset);
        comprobar = new JButton("Comprobar");
        comprobar.setPreferredSize(new Dimension(175,40));
        comprobar.setActionCommand("ComprobarP4");
        pinf.add(comprobar);
        
        p.add(pnort, BorderLayout.NORTH);
        p.add(pizq, BorderLayout.WEST);
        p.add(pcentro, BorderLayout.CENTER);
        p.add(pder, BorderLayout.EAST);
        p.add(pinf, BorderLayout.SOUTH);
        
        this.add(p);
        this.add(menu, BorderLayout.NORTH);
        
        for(int i=0;i<4;i++){
            aciertos[i]=false;
        }
        
    }
    
    public void addMiActionListener(ActionListener al){
           menu.addMiActionListener(al);
           reset.addActionListener(al);
           comprobar.addActionListener(al);
           for(int i=0;i<8;i++){
               bcol[i].addActionListener(al);
           }
    }
    
    public void pintarSecuenciaP4(int i){
        bcol[i].setVisible(false);
        switch(cont){
            case 1:
                if (k == 1)
                    botGrandes[0].setBackground(colores8[i]);
                else if (k == 2)
                    botGrandes[1].setBackground(colores8[i]);
                else if (k == 3)
                    botGrandes[2].setBackground(colores8[i]);
                else
                    botGrandes[3].setBackground(colores8[i]);
                break;
            case 2:
                if (k == 1)
                    botGrandes[4].setBackground(colores8[i]);
                else if (k == 2)
                    botGrandes[5].setBackground(colores8[i]);
                else if (k == 3)
                    botGrandes[6].setBackground(colores8[i]);
                else
                    botGrandes[7].setBackground(colores8[i]);
                break;
            case 3:
                if (k == 1)
                    botGrandes[8].setBackground(colores8[i]);
                else if (k == 2)
                    botGrandes[9].setBackground(colores8[i]);
                else if (k == 3)
                    botGrandes[10].setBackground(colores8[i]);
                else
                    botGrandes[11].setBackground(colores8[i]);
                break;    
            case 4:
                if (k == 1)
                    botGrandes[12].setBackground(colores8[i]);
                else if (k == 2)
                    botGrandes[13].setBackground(colores8[i]);
                else if (k == 3)
                    botGrandes[14].setBackground(colores8[i]);
                else
                    botGrandes[15].setBackground(colores8[i]);
                break;
            case 5:
                if (k == 1)
                    botGrandes[16].setBackground(colores8[i]);
                else if (k == 2)
                    botGrandes[17].setBackground(colores8[i]);
                else if (k == 3)
                    botGrandes[18].setBackground(colores8[i]);
                else
                    botGrandes[19].setBackground(colores8[i]);
                break;
        }
        k++;
    }
    public void resetP4(){
        k=1;
        switch(cont){
            case 1:
                botGrandes[0].setBackground(GrisFondo);
                botGrandes[1].setBackground(GrisFondo);
                botGrandes[2].setBackground(GrisFondo);
                botGrandes[3].setBackground(GrisFondo);
                break;
            
            case 2:
                botGrandes[4].setBackground(GrisFondo);
                botGrandes[5].setBackground(GrisFondo);
                botGrandes[6].setBackground(GrisFondo);
                botGrandes[7].setBackground(GrisFondo);
                break;
            
            case 3:
                botGrandes[8].setBackground(GrisFondo);
                botGrandes[9].setBackground(GrisFondo);
                botGrandes[10].setBackground(GrisFondo);
                botGrandes[11].setBackground(GrisFondo);
                break;
            
            case 4:
                botGrandes[12].setBackground(GrisFondo);
                botGrandes[13].setBackground(GrisFondo);
                botGrandes[14].setBackground(GrisFondo);
                botGrandes[15].setBackground(GrisFondo);
                break;    
            
            case 5:
                botGrandes[16].setBackground(GrisFondo);
                botGrandes[17].setBackground(GrisFondo);
                botGrandes[18].setBackground(GrisFondo);
                botGrandes[19].setBackground(GrisFondo);
                break;    
        }
        
        for(int i=0;i<8;i++){
            bcol[i].setVisible(true);
        }
    }
    
    public boolean comporobarSecuenciaP4(Color[] secuenciaP3){
        boolean ganador=false;
        k=1;
        switch(cont){
            case 1:
                for(int i=0;i<4;i++){
                    if(i==0){
                        if(secuenciaP3[i]==botGrandes[0].getBackground()){
                            botPequenyos[i].setBackground(Color.BLACK);
                            aciertos[0]=true;
                        }
                        else if(secuenciaP3[i]==botGrandes[1].getBackground())
                            botPequenyos[i].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[2].getBackground())
                            botPequenyos[i].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[3].getBackground())
                            botPequenyos[i].setBackground(Color.RED);
                        else
                            botPequenyos[i].setBackground(GrisFondo);
                    }
                    else if(i==1){
                        if(secuenciaP3[i]==botGrandes[0].getBackground())
                            botPequenyos[i].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[1].getBackground()){
                            botPequenyos[i].setBackground(Color.BLACK);
                            aciertos[1]=true;
                        }
                        else if(secuenciaP3[i]==botGrandes[2].getBackground())
                            botPequenyos[i].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[3].getBackground())
                            botPequenyos[i].setBackground(Color.RED);
                        else
                            botPequenyos[i].setBackground(GrisFondo);
                    }
                    else if(i==2){
                        if(secuenciaP3[i]==botGrandes[0].getBackground())
                            botPequenyos[i].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[1].getBackground())
                            botPequenyos[i].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[2].getBackground()){
                            botPequenyos[i].setBackground(Color.BLACK);
                            aciertos[2]=true;
                        }   
                        else if(secuenciaP3[i]==botGrandes[3].getBackground())
                            botPequenyos[i].setBackground(Color.RED);
                        else
                            botPequenyos[i].setBackground(GrisFondo);
                    }
                    else if(i==3){
                        if(secuenciaP3[i]==botGrandes[0].getBackground())
                            botPequenyos[i].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[1].getBackground())
                            botPequenyos[i].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[2].getBackground())
                            botPequenyos[i].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[3].getBackground()){
                            botPequenyos[i].setBackground(Color.BLACK);
                            aciertos[3]=true;
                        }
                        else
                            botPequenyos[i].setBackground(GrisFondo);
                    }  
                }
                if(botPequenyos[0].getBackground()==Color.BLACK&&botPequenyos[1].getBackground()==Color.BLACK&&botPequenyos[2].getBackground()==Color.BLACK&&botPequenyos[3].getBackground()==Color.BLACK)
                    ganador=true;
                break;
            
            case 2:
                for(int i=0;i<4;i++){
                    if(i==0){
                        if(secuenciaP3[i]==botGrandes[4].getBackground()){
                            botPequenyos[i+4].setBackground(Color.BLACK);
                            aciertos[i]=true;
                        }
                        else if(secuenciaP3[i]==botGrandes[5].getBackground())
                            botPequenyos[i+4].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[6].getBackground())
                            botPequenyos[i+4].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[7].getBackground())
                            botPequenyos[i+4].setBackground(Color.RED);
                        else
                            botPequenyos[i+4].setBackground(GrisFondo);
                    }
                    else if(i==1){
                        if(secuenciaP3[i]==botGrandes[4].getBackground())
                            botPequenyos[i+4].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[5].getBackground()){
                            botPequenyos[i+4].setBackground(Color.BLACK);
                            aciertos[i]=true;
                        }
                        else if(secuenciaP3[i]==botGrandes[6].getBackground())
                            botPequenyos[i+4].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[7].getBackground())
                            botPequenyos[i+4].setBackground(Color.RED);
                        else
                            botPequenyos[i+4].setBackground(GrisFondo);
                    }
                    else if(i==2){
                        if(secuenciaP3[i]==botGrandes[4].getBackground())
                            botPequenyos[i+4].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[5].getBackground())
                            botPequenyos[i+4].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[6].getBackground()){
                            botPequenyos[i+4].setBackground(Color.BLACK);
                            aciertos[i]=true;
                        }
                        else if(secuenciaP3[i]==botGrandes[7].getBackground())
                            botPequenyos[i+4].setBackground(Color.RED);
                        else
                            botPequenyos[i+4].setBackground(GrisFondo);
                    }
                    else if(i==3){
                        if(secuenciaP3[i]==botGrandes[4].getBackground())
                            botPequenyos[i+4].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[5].getBackground())
                            botPequenyos[i+4].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[6].getBackground())
                            botPequenyos[i+4].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[7].getBackground()){
                            botPequenyos[i+4].setBackground(Color.BLACK);
                            aciertos[i]=true;
                        }
                        else
                            botPequenyos[i+4].setBackground(GrisFondo);
                    }
                }
                if(botPequenyos[4].getBackground()==Color.BLACK&&botPequenyos[5].getBackground()==Color.BLACK&&botPequenyos[6].getBackground()==Color.BLACK&&botPequenyos[7].getBackground()==Color.BLACK)
                    ganador=true;
                break;
                
            case 3:
                for(int i=0;i<4;i++){
                    if(i==0){
                        if(secuenciaP3[i]==botGrandes[8].getBackground()){
                            botPequenyos[i+8].setBackground(Color.BLACK);
                            aciertos[i]=true;
                        }
                        else if(secuenciaP3[i]==botGrandes[9].getBackground())
                            botPequenyos[i+8].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[10].getBackground())
                            botPequenyos[i+8].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[11].getBackground())
                            botPequenyos[i+8].setBackground(Color.RED);
                        else
                            botPequenyos[i+8].setBackground(GrisFondo);
                    }
                    else if(i==1){
                        if(secuenciaP3[i]==botGrandes[8].getBackground())
                            botPequenyos[i+8].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[9].getBackground()){
                            botPequenyos[i+8].setBackground(Color.BLACK);
                            aciertos[i]=true;
                        }
                        else if(secuenciaP3[i]==botGrandes[10].getBackground())
                            botPequenyos[i+8].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[11].getBackground())
                            botPequenyos[i+8].setBackground(Color.RED);
                        else
                            botPequenyos[i+8].setBackground(GrisFondo);
                    }
                    else if(i==2){
                        if(secuenciaP3[i]==botGrandes[8].getBackground())
                            botPequenyos[i+8].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[9].getBackground())
                            botPequenyos[i+8].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[10].getBackground()){
                            botPequenyos[i+8].setBackground(Color.BLACK);
                            aciertos[i]=true;
                        }
                        else if(secuenciaP3[i]==botGrandes[11].getBackground())
                            botPequenyos[i+8].setBackground(Color.RED);
                        else
                            botPequenyos[i+8].setBackground(GrisFondo);
                    }
                    else if(i==3){
                        if(secuenciaP3[i]==botGrandes[8].getBackground())
                            botPequenyos[i+8].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[9].getBackground())
                            botPequenyos[i+8].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[10].getBackground())
                            botPequenyos[i+8].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[11].getBackground()){
                            botPequenyos[i+8].setBackground(Color.BLACK);
                            aciertos[i]=true;
                        }
                        else
                            botPequenyos[i+8].setBackground(GrisFondo);
                    }
                }
                if(botPequenyos[8].getBackground()==Color.BLACK&&botPequenyos[9].getBackground()==Color.BLACK&&botPequenyos[10].getBackground()==Color.BLACK&&botPequenyos[11].getBackground()==Color.BLACK)
                    ganador=true;
                break;
            
            case 4:
                for(int i=0;i<4;i++){
                    if(i==0){
                        if(secuenciaP3[i]==botGrandes[12].getBackground()){
                            botPequenyos[i+12].setBackground(Color.BLACK);
                            aciertos[i]=true;
                        }
                        else if(secuenciaP3[i]==botGrandes[13].getBackground())
                            botPequenyos[i+12].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[14].getBackground())
                            botPequenyos[i+12].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[15].getBackground())
                            botPequenyos[i+12].setBackground(Color.RED);
                        else
                            botPequenyos[i+12].setBackground(GrisFondo);
                    }
                    else if(i==1){
                        if(secuenciaP3[i]==botGrandes[12].getBackground())
                            botPequenyos[i+12].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[13].getBackground()){
                            botPequenyos[i+12].setBackground(Color.BLACK);
                            aciertos[i]=true;
                        }
                        else if(secuenciaP3[i]==botGrandes[14].getBackground())
                            botPequenyos[i+12].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[15].getBackground())
                            botPequenyos[i+12].setBackground(Color.RED);
                        else
                            botPequenyos[i+12].setBackground(GrisFondo);
                    }
                    else if(i==2){
                        if(secuenciaP3[i]==botGrandes[12].getBackground())
                            botPequenyos[i+12].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[13].getBackground())
                            botPequenyos[i+12].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[14].getBackground()){
                            botPequenyos[i+12].setBackground(Color.BLACK);
                            aciertos[i]=true;
                        }
                        else if(secuenciaP3[i]==botGrandes[15].getBackground())
                            botPequenyos[i+12].setBackground(Color.RED);
                        else
                            botPequenyos[i+12].setBackground(GrisFondo);
                    }
                    else if(i==3){
                        if(secuenciaP3[i]==botGrandes[12].getBackground())
                            botPequenyos[i+12].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[13].getBackground())
                            botPequenyos[i+12].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[14].getBackground())
                            botPequenyos[i+12].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[15].getBackground()){
                            botPequenyos[i+12].setBackground(Color.BLACK);
                            aciertos[i]=true;
                        }
                        else
                            botPequenyos[i+12].setBackground(GrisFondo);
                    }
                }  
                if(botPequenyos[12].getBackground()==Color.BLACK&&botPequenyos[13].getBackground()==Color.BLACK&&botPequenyos[14].getBackground()==Color.BLACK&&botPequenyos[15].getBackground()==Color.BLACK)
                    ganador=true;
                break;
                
            case 5:
                for(int i=0;i<4;i++){
                    if(i==0){
                        if(secuenciaP3[i]==botGrandes[16].getBackground()){
                            botPequenyos[i+16].setBackground(Color.BLACK);
                            aciertos[i]=true;
                        }
                        else if(secuenciaP3[i]==botGrandes[17].getBackground())
                            botPequenyos[i+16].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[18].getBackground())
                            botPequenyos[i+16].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[19].getBackground())
                            botPequenyos[i+16].setBackground(Color.RED);
                        else
                            botPequenyos[i+16].setBackground(GrisFondo);
                    }
                    else if(i==1){
                        if(secuenciaP3[i]==botGrandes[16].getBackground())
                            botPequenyos[i+16].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[17].getBackground()){
                            botPequenyos[i+16].setBackground(Color.BLACK);
                            aciertos[i]=true;
                        }
                        else if(secuenciaP3[i]==botGrandes[18].getBackground())
                            botPequenyos[i+16].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[19].getBackground())
                            botPequenyos[i+16].setBackground(Color.RED);
                        else
                            botPequenyos[i+16].setBackground(GrisFondo);
                    }
                    else if(i==2){
                        if(secuenciaP3[i]==botGrandes[16].getBackground())
                            botPequenyos[i+16].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[17].getBackground())
                            botPequenyos[i+16].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[18].getBackground()){
                            botPequenyos[i+16].setBackground(Color.BLACK);
                            aciertos[i]=true;
                        }
                        else if(secuenciaP3[i]==botGrandes[19].getBackground())
                            botPequenyos[i+16].setBackground(Color.RED);
                        else
                            botPequenyos[i+16].setBackground(GrisFondo);
                    }
                    else if(i==3){
                        if(secuenciaP3[i]==botGrandes[16].getBackground())
                            botPequenyos[i+16].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[17].getBackground())
                            botPequenyos[i+16].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[18].getBackground())
                            botPequenyos[i+16].setBackground(Color.RED);
                        else if(secuenciaP3[i]==botGrandes[19].getBackground()){
                            botPequenyos[i+16].setBackground(Color.BLACK);
                            aciertos[i]=true;
                        }
                        else
                            botPequenyos[i+16].setBackground(GrisFondo);
                    }
                }     
                if(botPequenyos[16].getBackground()==Color.BLACK&&botPequenyos[17].getBackground()==Color.BLACK&&botPequenyos[18].getBackground()==Color.BLACK&&botPequenyos[19].getBackground()==Color.BLACK)
                    ganador=true;
                break;
        }
        for(int i=0;i<8;i++){
            bcol[i].setVisible(true);
        }
        cont++;
        System.out.print(ganador+"\n");
        return ganador;
    }
}
