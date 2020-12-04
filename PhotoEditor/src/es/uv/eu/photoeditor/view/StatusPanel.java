/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uv.eu.photoeditor.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author danie
 */
public class StatusPanel extends JPanel{
    private JLabel GrPincel, CoPincel, CoRelleno;
    private JLabel GrPincel1, CoPincel1, CoRelleno1;
    private Border border;
    
    public StatusPanel(){
        setLayout(new FlowLayout());
        
        GrPincel = new JLabel("Grosor del pincel: ");
        GrPincel1= new JLabel();
        GrPincel1.setPreferredSize(new Dimension(25,18));
        border = BorderFactory.createLineBorder (Color.LIGHT_GRAY,1);
        GrPincel1.setBorder(border);
        GrPincel1.setVisible(true);
        GrPincel1.setOpaque(true);

        
        CoPincel = new JLabel("Color del pincel: ");
        CoPincel1= new JLabel();
        CoPincel1.setPreferredSize(new Dimension(60,18));
        border = BorderFactory.createLineBorder (Color.LIGHT_GRAY,1);
        CoPincel1.setBorder(border);
        CoPincel1.setBackground(Color.BLACK);
        CoPincel1.setOpaque(true);
        
        
        CoRelleno = new JLabel("Color del relleno: ");
        CoRelleno1= new JLabel();
        CoRelleno1.setPreferredSize(new Dimension(60,18));
        border = BorderFactory.createLineBorder (Color.LIGHT_GRAY,1);
        CoRelleno1.setBorder(border);
        CoRelleno1.setBackground(Color.WHITE);
        CoRelleno1.setOpaque(true);
        
        add(GrPincel);
        add(GrPincel1);
        
        add(CoPincel);
        add(CoPincel1);
        
        add(CoRelleno);
        add(CoRelleno1);
    }
    
    public void setColorLabelPincel(String x){
        Color color;
        Color[] colores={Color.black, Color.cyan, Color.darkGray, Color.gray,
                         Color.lightGray, Color.magenta, Color.orange, Color.pink, 
                         Color.yellow, Color.white, Color.red, Color.blue, Color.green};
        
        int i = Integer.parseInt(x);

        color = colores[i];
        
        CoPincel1.setBackground(color);
    }
    
    public void setColorLabelRelleno(String x){
        Color color;
        Color[] colores={Color.black, Color.cyan, Color.darkGray, Color.gray,
                         Color.lightGray, Color.magenta, Color.orange, Color.pink, 
                         Color.yellow, Color.white, Color.red, Color.blue, Color.green};
        
        int i = Integer.parseInt(x)-13;

        color = colores[i];
        
        CoRelleno1.setBackground(color);
    }
    
    public void setGrosorLabel(String x){
        GrPincel1.setText(x);
    }
}
