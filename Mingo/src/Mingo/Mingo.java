/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mingo;

import Frames.MenuPrincipal;
import JDBC.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Semantic UI
 */
public class Mingo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
       
      
        MenuPrincipal mp= new MenuPrincipal();
        mp.setVisible(true);
    }
    
}
