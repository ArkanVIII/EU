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
                // CAMBIOS DE PANTALLA CON LOS BOTONES    
                case "VisualizarP2":
                    vista.visualizarP2();
                    break;
                    
                case "VisualizarP2desdeP3":
                    vista.visualizarP2desdeP3();
                    break;
                    
                case "VisualizarP3":
                    vista.visualizarP3();
                    vista.getNombreJ1();
                    break;
                    
                case "VisualizarP1":
                    vista.visualizarP1();
                    break;
                   
                //CASOS PARA PINTAR DE ROJO LOS BOTONES SELECCIONADOS EN LOS AJUSTES DE LA PARTIDA
                case "8":
                    vista.boton8select();
                    break;
                case "12":
                    vista.boton12select();
                    break;
                case "16":
                    vista.boton16select();
                    break;
                case "5":
                    vista.boton5select();
                    break;
                case "8.1":
                    vista.boton8selectint();
                    break;
                case "10":
                    vista.boton10select();
                    break;
                    
                
            }
        }
    }
}
