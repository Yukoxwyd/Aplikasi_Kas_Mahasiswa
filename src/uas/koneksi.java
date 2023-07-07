/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class koneksi {

    static Connection con;
    static Connection getConnection;
    private Statement stat;
    private ResultSet res;

    /**
     * @param args the command line arguments
     */
        // TODO code application logic here
        private void koneksi (){
        try {
         Class.forName("com.mysql.jdbc.Driver");
         con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/uas", "root", "");
         stat=con.createStatement();
         } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);}   
    }
    }
    
