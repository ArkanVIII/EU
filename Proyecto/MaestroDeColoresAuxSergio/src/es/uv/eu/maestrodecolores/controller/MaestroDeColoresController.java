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
    private int contador = 1;
    
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
                case "VisualizarP1":
                    vista.visualizarP1();
                    break;
                
                case "VisualizarP2":
                    vista.visualizarP2();
                    break;
                   
                case "VisualizarP3":
                    vista.visualizarP3();
                    vista.getNombreJ1();
                    vista.getNumColores();
                    break;
                    
                case "VisualizarP4":
                    vista.visualizarP4();
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
                
                //ASIGNACION DE COLORES DE LA PANTALLA 3    
                case "ComboBoxP3.1":
                    vista.getObjetoCombo(1);
                    //vista.getColores(1);
                    break;
                case "ComboBoxP3.2":
                    vista.getObjetoCombo(2);
                    //vista.getColores(2);
                    break;
                case "ComboBoxP3.3":
                    vista.getObjetoCombo(3);
                    //vista.getColores(3);
                    break;
                case "ComboBoxP3.4":
                    vista.getObjetoCombo(4);
                    //vista.getColores(4);
                    break;
                    
                case "ResetP3":
                    vista.resetP3();
                    break;
                
                case "ComboBoxP4.1":
                    vista.getObjetoCombo(1);
                    //vista.getColores(1);
                    break;
                case "ComboBoxP4.2":
                    vista.getObjetoCombo(2);
                    //vista.getColores(2);
                    break;
                case "ComboBoxP4.3":
                    vista.getObjetoCombo(3);
                    //vista.getColores(3);
                    break;
                case "ComboBoxP4.4":
                    vista.getObjetoCombo(4);
                    //vista.getColores(4);
                    break;
                    
                case "Comprobar":
                    vista.pintar(contador);
                    vista.resetCombo();
                    contador++;
                    break;
                    
            }
        }
    }
}
