/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uv.eu.maestrodecolores;

import es.uv.es.maestrodecolores.model.MaestroDeColoresModel;
import es.uv.eu.maestrodecolores.controller.MaestroDeColoresController;
import es.uv.eu.maestrodecolores.view.MaestroDeColoresView;

/**
 *
 * @author sergv
 */
public class MaestroDeColores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MaestroDeColoresModel model = new MaestroDeColoresModel();
        MaestroDeColoresView view = new MaestroDeColoresView ();
        MaestroDeColoresController controller = new MaestroDeColoresController();
        
        view.setVisible(true);
    }
    
}
