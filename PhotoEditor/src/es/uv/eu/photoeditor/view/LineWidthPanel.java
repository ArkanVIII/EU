/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uv.eu.photoeditor.view;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;

/**
 *
 * @author danie
 */

public class LineWidthPanel extends JPanel{
    private JSlider slider;
    private JLabel etiqueta;
    private int min,max,init;
    
    public LineWidthPanel(){
        setLayout(new GridLayout(2,1));
        
        etiqueta = new JLabel("Grosor del pincel:",JLabel.LEFT);
        min = 1;
        max = 10;
        init = 1;
        slider = new JSlider(JSlider.HORIZONTAL,min,max,init);
        slider.setMajorTickSpacing(1);
        slider.setMinorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
       
        add(etiqueta);
        add(slider);
    }
    
    public void addMiChangeListener(ChangeListener cl) {
        slider.addChangeListener(cl);
    }
}
