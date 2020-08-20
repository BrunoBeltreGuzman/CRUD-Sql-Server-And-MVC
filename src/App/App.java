/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Controlador.CtrlEstudiante;
import Controlador.Eventos;
import Modelo.Consultas;
import Modelo.Estudiante;
import Vista.Ventana;

/**
 *
    * @author BRUNO BELTRE GUZMAN
 */
public class App {
    
    public static void main(String[] args) {
        
        Estudiante est = new Estudiante();
        Consultas conslt = new Consultas();
        Ventana vent = new Ventana();
        Eventos eventos = new Eventos(vent);
        
        CtrlEstudiante ctrlEstudiante = new CtrlEstudiante(est, conslt, vent);
        ctrlEstudiante.IniciarVentana();
        vent.setVisible(true);
        
        
    }
    
}
