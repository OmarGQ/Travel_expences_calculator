/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db2;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Informatica
 */
public class Modificar extends JFrame{
    private JLabel exit, ay;
    private JRadioButton a1, a2, a3, b1, b2, b3, c1, c2;
    public JTextField des, com, cen, hos;
    private JLabel n1, n2, n3, n4;
    public ayudita y;
    private JButton ex, sa;
    private int a, b, c;
    public Connection con;
    
    public Modificar(){
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
        a1=new JRadioButton ("America");
        a2=new JRadioButton ("Europa, Asia, Oceania o Africa");
        a3=new JRadioButton ("<html>Estado e interior de<br>la republica mexicana<html>");
        b1=new JRadioButton ("Secretario y/o Homologo");
        b2=new JRadioButton ("Subsecretario, Director o equivalente");
        b3=new JRadioButton ("<html>Director, Jefe de departamento<br>y resto de categorias<html>");
        c1=new JRadioButton ("Vida cara");
        c2=new JRadioButton ("Vida media");
        des=new JTextField();
        com=new JTextField();
        cen=new JTextField();
        hos=new JTextField();
        n1=new JLabel("Desayuno");
        n2=new JLabel("Comida");
        n3=new JLabel("Cena");
        n4=new JLabel("Hospedaje");
        ex=new JButton("Examinar");
        sa=new JButton("Guardar");
        ay=new JLabel(new ImageIcon(getClass().getResource("/imagenes/menu/ayuda.png")));
        ay.setLocation(1600, 10);
        ay.setSize(80, 80);
        exit.setLocation(1700, 10);
        exit.setSize(200, 200);
        a1.setLocation(10, 150);
        a1.setSize(600, 40);
        a2.setLocation(10, 200);
        a2.setSize(600, 40);
        a3.setLocation(10, 250);
        a3.setSize(600, 75);
        b1.setLocation(650, 150);
        b1.setSize(600, 40);
        b2.setLocation(650, 200);
        b2.setSize(600, 40);
        b3.setLocation(650, 250);
        b3.setSize(600, 80);
        c1.setLocation(1300, 150);
        c1.setSize(350, 40);
        c2.setLocation(1300, 210);
        c2.setSize(350, 40);
        des.setSize(280, 50);
        des.setLocation(250, 600);
        com.setSize(280, 50);
        com.setLocation(630, 600);
        cen.setSize(280, 50);
        cen.setLocation(1010, 600);
        hos.setSize(280, 50);
        hos.setLocation(1390, 600);
        n1.setLocation(250, 540);
        n1.setSize(280, 50);
        n2.setLocation(630, 540);
        n2.setSize(280, 50);
        n3.setLocation(1010, 540);
        n3.setSize(280, 50);
        n4.setLocation(1390, 540);
        n4.setSize(280, 50);
        ex.setLocation(1300, 350);
        ex.setSize(200, 50);
        sa.setLocation(860, 700);
        sa.setSize(200, 50);
        
        a1.setOpaque(false);
        a2.setOpaque(false);
        a3.setOpaque(false);
        b1.setOpaque(false);
        b2.setOpaque(false);
        b3.setOpaque(false);
        c1.setOpaque(false);
        c2.setOpaque(false);
        c1.setVisible(false);
        c2.setVisible(false);
        sa.setEnabled(false);
        des.setEnabled(false);
        com.setEnabled(false);
        cen.setEnabled(false);
        hos.setEnabled(false);
        
        a1.setFont(new Font("Arial",Font.PLAIN,35));
        a2.setFont(new Font("Arial",Font.PLAIN,35));
        a3.setFont(new Font("Arial",Font.PLAIN,35));
        b1.setFont(new Font("Arial",Font.PLAIN,35));
        b2.setFont(new Font("Arial",Font.PLAIN,35));
        b3.setFont(new Font("Arial",Font.PLAIN,35));
        c1.setFont(new Font("Arial",Font.PLAIN,35));
        c2.setFont(new Font("Arial",Font.PLAIN,35));
        des.setFont(new Font("Arial",Font.PLAIN,40));
        com.setFont(new Font("Arial",Font.PLAIN,40));
        cen.setFont(new Font("Arial",Font.PLAIN,40));
        hos.setFont(new Font("Arial",Font.PLAIN,40));
        n1.setFont(new Font("Arial",Font.PLAIN,40));
        n2.setFont(new Font("Arial",Font.PLAIN,40));
        n3.setFont(new Font("Arial",Font.PLAIN,40));
        n4.setFont(new Font("Arial",Font.PLAIN,40));
        
        setLayout(null);
        
        ButtonGroup grupo1 = new ButtonGroup();
        grupo1.add(a1);
        grupo1.add(a2);
        grupo1.add(a3);
        ButtonGroup grupo2 = new ButtonGroup();
        grupo2.add(b1);
        grupo2.add(b2);
        grupo2.add(b3);
        final ButtonGroup grupo3 = new ButtonGroup();
        grupo3.add(c1);
        grupo3.add(c2);
        
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
        ex.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                examinar();
                sa.setEnabled(true);
                des.setEnabled(true);
                com.setEnabled(true);
                cen.setEnabled(true);
                hos.setEnabled(true);
            }  
        });
        sa.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                modificar();
            }
        });
        a1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                    c1.setVisible(false);
                    c2.setVisible(false);
                    a=1;
                    c=0;
            }           
        });
        a2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                    c1.setVisible(false);
                    c2.setVisible(false);
                    a=2;
                    c=0;
            } 
        });
        a3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                    c1.setVisible(true);
                    c2.setVisible(true);
                    grupo3.clearSelection();
                    a=3;
                    
            }
        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                    b=1;
            }           
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                    b=2;
            } 
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                    b=3;
                    
            }
        });
        c1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                    c=1;
            }           
        });
        c2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                    c=2;
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
                r.setText("<html>Para modificar primero ingrese los datos de la seccion de viaticos a modificar y oprima buscar, despues apareceran los datos actuales los cuales modificara y posteriormente oprima guardar<html>");
                r.setFont(new Font("Arial",Font.PLAIN,35));
                y.add(r);
            }
        });
        
        this.add(a1);
        this.add(a2);
        this.add(a3);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(c1);
        this.add(c2);
        this.add(des);
        this.add(com);
        this.add(cen);
        this.add(hos);
        this.add(n1);
        this.add(n2);
        this.add(n3);
        this.add(n4);
        this.add(ex);
        this.add(sa);
        this.add(exit);
        this.add(ay);
        this.setUndecorated(true);
        this.setSize(1920,1080);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
    private Modificar getMe()
    {
        return this;
    }
    
    private void examinar(){
        int desa = 0, comi=0, cena=0, hosp=0, tday=0;
        String sql="select * from cantidades where destino_general = '"+a+"'and rango = '"+b+"'and clase = '"+c+"'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                desa=rs.getInt("desayuno");
                comi=rs.getInt("comida");
                cena=rs.getInt("cena");
                hosp=rs.getInt("hospedaje");
                tday=rs.getInt("total_dia");
            }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        des.setText(+desa+"");
        com.setText(+comi+"");
        cen.setText(+cena+"");
        hos.setText(+hosp+"");
    }
    private void modificar(){
        int v1, v2, v3, v4, v5;
        v1=parseInt(des.getText());
        v2=parseInt(com.getText());
        v3=parseInt(cen.getText());
        v4=parseInt(hos.getText());
        v5=(v1+v2+v3+v4);
        String sql="update cantidades set desayuno='"+v1+"', comida='"+v2+"', cena='"+v3+"', hospedaje='"+v4+"', total_dia='"+v5+"' where destino_general='"+a+"' and rango='"+b+"' and clase='"+c+"'";
        try {
            Statement st = con.createStatement();
            st.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
