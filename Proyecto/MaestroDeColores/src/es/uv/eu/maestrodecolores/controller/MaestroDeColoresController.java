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
                case "BcolP3.1":
                    vista.pintarSecuenciaP3(0);
                    break;
                case "BcolP3.2":
                    vista.pintarSecuenciaP3(1);
                    break;
                case "BcolP3.3":
                    vista.pintarSecuenciaP3(2);
                    break;
                case "BcolP3.4":
                    vista.pintarSecuenciaP3(3);
                    break;
                case "BcolP3.5":
                    vista.pintarSecuenciaP3(4);
                    break;
                case "BcolP3.6":
                    vista.pintarSecuenciaP3(5);
                    break;
                case "BcolP3.7":
                    vista.pintarSecuenciaP3(6);
                    break;
                case "BcolP3.8":
                    vista.pintarSecuenciaP3(7);
                    break;
                    
                case "ResetP3":
                    vista.resetP3();
                    break;
                    
                case "BcolP4.1":
                    vista.pintarSecuenciaP4(0);
                    break;
                case "BcolP4.2":
                    vista.pintarSecuenciaP4(1);
                    break;
                case "BcolP4.3":
                    vista.pintarSecuenciaP4(2);
                    break;
                case "BcolP4.4":
                    vista.pintarSecuenciaP4(3);
                    break;
                case "BcolP4.5":
                    vista.pintarSecuenciaP4(4);
                    break;
                case "BcolP4.6":
                    vista.pintarSecuenciaP4(5);
                    break;
                case "BcolP4.7":
                    vista.pintarSecuenciaP4(6);
                    break;
                case "BcolP4.8":
                    vista.pintarSecuenciaP4(7);
                    break;
                
                case "ResetP4":
                    vista.resetP4();
                    break;
                
                case "ComprobarP4":
                    if(vista.comporbarSecuenciaP4()){
                        System.out.print("Has ganado\n");
                    }
                    break;
                
                
            }
        }
    }
}
