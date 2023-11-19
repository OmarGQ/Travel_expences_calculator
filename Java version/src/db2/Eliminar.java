/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db2;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Informatica
 */
public class Eliminar extends JFrame{
    private JLabel exit, ay;
    public ayudita y;
    public JTextField cod_v, cod, id, reg;
    private JLabel n1, n2, n3, n4;
    private JButton b1, b2, b3, b4;
    public Connection con;
    
    public Eliminar(){
        super();
        try{
        System.out.println("Creando conexion");
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/jal", "root" , "");
        System.out.println("Conexion exitosa");
        }
        catch(SQLException e){
        System.out.println("Error en MySQL");
        System.out.println("Se ha encontrado el siguiente error " + e.getMessage());
        }
        catch(ClassNotFoundException e){
        e.printStackTrace();
        }
        catch (Exception e){
        System.out.println("Se ha encontrado el siguiente error " + e.getMessage());
        }
        
        setContentPane(new JLabel(new ImageIcon(getClass().getResource("/imagenes/menu/ro.png"))));
        exit=new JLabel(new ImageIcon(getClass().getResource("/imagenes/menu/sal.png")));
        exit.setLocation(1700, 10);
        exit.setSize(200, 200);
        ay=new JLabel(new ImageIcon(getClass().getResource("/imagenes/menu/ayuda.png")));
        ay.setLocation(1600, 10);
        ay.setSize(80, 80);
        cod_v=new JTextField();
        cod=new JTextField();
        id=new JTextField();
        reg=new JTextField();
        n1=new JLabel("Eliminar viaje");
        n2=new JLabel("Eliminar viaticos");
        n3=new JLabel("Eliminar usuario");
        n4=new JLabel("Eliminar representante");
        b1=new JButton("eliminar");
        b2=new JButton("eliminar");
        b3=new JButton("eliminar");
        b4=new JButton("eliminar");
        cod_v.setLocation(750, 500);
        cod_v.setSize(280, 50);
        cod.setLocation(750, 300);
        cod.setSize(280, 50);
        id.setLocation(750, 700);
        id.setSize(280, 50);
        reg.setLocation(750, 900);
        reg.setSize(280, 50);
        n1.setLocation(750, 250);
        n1.setSize(300, 50);
        n2.setLocation(750, 450);
        n2.setSize(300, 50);
        n3.setLocation(750, 650);
        n3.setSize(300, 50);
        n4.setLocation(750, 850);
        n4.setSize(400, 50);
        b1.setLocation(1080, 300);
        b1.setSize(150, 50);
        b2.setLocation(1080, 500);
        b2.setSize(150, 50);
        b3.setLocation(1080, 700);
        b3.setSize(150, 50);
        b4.setLocation(1080, 900);
        b4.setSize(150, 50);
        cod_v.setFont(new Font("Arial",Font.PLAIN,40));
        cod.setFont(new Font("Arial",Font.PLAIN,40));
        id.setFont(new Font("Arial",Font.PLAIN,40));
        reg.setFont(new Font("Arial",Font.PLAIN,40));
        n1.setFont(new Font("Arial",Font.PLAIN,40));
        n2.setFont(new Font("Arial",Font.PLAIN,40));
        n3.setFont(new Font("Arial",Font.PLAIN,40));
        n4.setFont(new Font("Arial",Font.PLAIN,40));
        b1.setFont(new Font("Arial",Font.PLAIN,40));
        b2.setFont(new Font("Arial",Font.PLAIN,40));
        b3.setFont(new Font("Arial",Font.PLAIN,40));
        b4.setFont(new Font("Arial",Font.PLAIN,40));
        
        setLayout(null);
        
        exit.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                getMe().dispose();
                try{
                    con.close();
                } catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        b1.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                deletev();
            }
        });
        b2.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                deletevi();
            }
        });
        b3.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                deleteu();
            }
        });
        b4.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                deleter();
            }
        });
        ay.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                y=new ayudita();
                y.setVisible(true);
                JLabel r = new JLabel();
                r.setSize(600,400);
                r.setLocation(0, 0);
                r.setText("<html>Para eliminar un viaje tiene que ingresar el codigo correspondiente en la parte que dice viaje<br>Para eliminar un calculo de viaticos tiene que ingresar el codigo correspondiente en la parte que dice viaticos<br>Para eliminar un usuario tiene que ingresar el ID correspondiente en la parte que dice usuario<br>Para eliminar un representante tiene que ingresar el registro correspondiente en la parte que dice representante<br> y para finalizar oprimir el boton correspondiente a la opcion a eliminar<html>");
                r.setFont(new Font("Arial",Font.PLAIN,25));
                y.add(r);
            }
        });
        this.add(cod_v);
        this.add(cod);
        this.add(id);
        this.add(reg);
        this.add(n1);
        this.add(n2);
        this.add(n3);
        this.add(n4);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(ay);
        this.add(exit);
        this.setUndecorated(true);
        this.setSize(1920,1080);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
    private Eliminar getMe()
    {
        return this;
    }
    private void deletev (){
        String r=cod.getText();
        String sql="delete from viaje where Codigo='"+r+"'";
        try {
            Statement st = con.createStatement();
             st.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void deletevi (){
        String r=cod_v.getText();
        String sql="delete from viaticos where Codigo_V='"+r+"'";
        try {
            Statement st = con.createStatement();
             st.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void deleteu (){
        String r=id.getText();
        String sql="delete from usuarios where ID='"+r+"'";
        try {
            Statement st = con.createStatement();
             st.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void deleter (){
        String r=reg.getText();
        String sql="delete from representante where Registro='"+r+"'";
        try {
            Statement st = con.createStatement();
             st.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
