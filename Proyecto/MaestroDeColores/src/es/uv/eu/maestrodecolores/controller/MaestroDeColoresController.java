/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uv.eu.maestrodecolores.controller;

import es.uv.es.maestrodecolores.model.MaestroDeColoresModel;
import es.uv.eu.maestrodecolores.view.MaestroDeColoresView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author sergv
 */
public class MaestroDeColoresController {
    private MaestroDeColoresView vista;
    private MaestroDeColoresModel modelo;
    
    public MaestroDeColoresController(MaestroDeColoresView v, MaestroDeColoresModel m){
        vista=v;
        modelo=m;
        
        vista.addMiActionListener(new MiActionListener());
    }
    
    class MiActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String command = e.getActionCommand();
            switch (command) {
                case "Salir":
                    System.exit(0);
                    break;
                    
                case "VisualizarP2":
                    vista.visualizarP2();
                    break;
                    
                case "VisualizarP3":
                    vista.visualizarP3();
                    break;
                    
                case "VisualizarP1":
                    vista.visualizarP1();
                    break;
            }
        }
    }
}
