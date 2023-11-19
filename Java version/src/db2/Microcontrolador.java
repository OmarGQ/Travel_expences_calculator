/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Omar xv
 */
public class Microcontrolador {
   private Connection con;//coneccion con la base de datos local
    public Microcontrolador (){//intento de conexion
        try{
            Class.forName(".com.mysql.jdbc.Driver").newInstance();//direccion de la base de datos
            System.out.println("Registro Exitoso");//mensage de salida
        }
        catch (Exception ex){//evita la especificacion de todo problema que peda ocurrir
              JOptionPane.showMessageDialog(null, "Error al conecctaar");
              System.exit(1);
        }
    }
    public void conectar (){
        con=null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/jal","root","");//falta nombre de base de datos
        }
        catch(SQLException ex){
            System.out.println("Error al conectar base de datos");
            JOptionPane.showMessageDialog(null, "Error al conecctaar");
            System.exit(1);
        }
    }
    public void desconectar (){
        try{
            con.close();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    public void ingresar(String sql){
            try {
                Statement cmd= con.createStatement();
                cmd.executeUpdate(sql);
            } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(null, "Error");
            }
        }
        
        public ResultSet resultado(String sql){
            try {
                Statement cmd= con.createStatement();
                ResultSet rs =cmd.executeQuery(sql);
                return rs;
            } catch (SQLException ex) {
                return null;
            }
        }
}
