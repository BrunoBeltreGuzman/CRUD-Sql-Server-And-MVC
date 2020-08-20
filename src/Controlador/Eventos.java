/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Consultas;
import Modelo.Estudiante;
import Vista.Ventana;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

/**
 *
 * @author diosl
 */
public class Eventos extends JFrame implements MouseListener, KeyListener {

    private Ventana ventana;
    private Estudiante estudiante;

    public Eventos(Ventana v) {

        this.ventana = v;

        ventana.getBtnBruscar().addMouseListener(this);
        ventana.getJtEstudiantes().addMouseListener(this);
        ventana.getTexId().addKeyListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == ventana.getJtEstudiantes()) {
            Consultas consultas = new Consultas();
            consultas.MouseClickedTabla(ventana);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

        if (e.getSource() == ventana.getBtnBruscar()) {
            ventana.getBtnBruscar().setBackground(new Color(51+50,0+50,199+50));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == ventana.getBtnBruscar()) {
            ventana.getBtnBruscar().setBackground(new Color(51,0,199));
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == ventana.getTexId()) {
            Consultas consultas = new Consultas();
            consultas.CargarTabla(ventana);
            ventana.getTexResultado().setText("Registros encontrados: " + consultas.getCantidadDeRegistros());
        }
        
    }

}
