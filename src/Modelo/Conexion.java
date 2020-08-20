/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author diosl
 */
public class Conexion {

    private Connection connection;
    private String user;
    private String passWord;
    private String url;

    public Conexion() {
        url = "jdbc:sqlserver://localhost:1433;database=EstudiantesDev;";
        user = "user=sa;";
        passWord = "password=root2020;";
    }

    public Connection getConexion() {
        try {
            connection = DriverManager.getConnection(url+user+passWord);
            return connection;
            
        } catch (Exception e) {
            System.out.println(e);
            System.err.println(e);
            return null;
        }
        
    }
}
