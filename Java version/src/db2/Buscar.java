/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db2;

import com.toedter.calendar.JDateChooser;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
public class Buscar extends JFrame{
    private JLabel exit, datos, dt1, dt2, dt3, ay;
    public ayudita y;
    public JTextField cod_v, cod;
    private JLabel n1, n2, n3;
    String nom, des; 
    public reporte r;
    public JLabel l1, l2, l3, l4, l5, l6, l7, l8;
    private JButton b, reporte;
    java.util.Date d;
    private JDateChooser reg;
    String codigo_v="", re="", codi="", pais="", ciu="", nomb="", ap="", am="", desg="", clase="", mon="", fecha1="", fecha2=""; 
    Date fr, fs;
    int de, com, cen, hos, lv, co, t, dg, c, cande, cancom, cancen, canhos, confi, hs, hr;
    public Connection con;
    
    public Buscar(){
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
        
        setContentPane(new JLabel(new ImageIcon(getClass().getResource("/imagenes/menu/ver.png"))));
        exit=new JLabel(new ImageIcon(getClass().getResource("/imagenes/menu/sal.png")));
        exit.setLocation(1700, 10);
        exit.setSize(150, 150);
        datos=new JLabel();
        dt1=new JLabel();
        dt2=new JLabel();
        dt3=new JLabel();
        l1=new JLabel();
        l2=new JLabel();
        l3=new JLabel();
        l4=new JLabel();
        l5=new JLabel();
        l6=new JLabel();
        l7=new JLabel();
        l8=new JLabel();
        datos.setLocation(10, 10);
        datos.setSize(200, 200);
        cod_v=new JTextField();
        cod=new JTextField();
        reg=new JDateChooser();
        n1=new JLabel("<html>Nombre del<br>representatnte<html>");
        n2=new JLabel("<html>Pais<br>destino<html>");
        n3=new JLabel("<html>Fecha<br>del viaje<html>");
        b=new JButton("buscar");
        reporte=new JButton("reporte");
        ay=new JLabel(new ImageIcon(getClass().getResource("/imagenes/menu/ayuda.png")));
        ay.setLocation(1600, 10);
        ay.setSize(80, 80);
        cod_v.setLocation(260, 300);
        cod_v.setSize(300, 50);
        cod.setLocation(810, 300);
        cod.setSize(300, 50);
        reg.setLocation(1360, 300);
        reg.setSize(300, 50);
        n1.setLocation(260, 200);
        n1.setSize(350, 100);
        n2.setLocation(810, 200);
        n2.setSize(300, 100);
        n3.setLocation(1360, 200);
        n3.setSize(400, 100);
        datos.setLocation(250, 550);
        datos.setSize(700, 190);
        dt1.setLocation(950, 550);
        dt1.setSize(220, 400);
        dt2.setLocation(1200, 550);
        dt2.setSize(160, 400);
        dt3.setLocation(1400, 550);
        dt3.setSize(150, 400);
        b.setLocation(810, 450);
        b.setSize(300, 50);
        reporte.setLocation(600, 750);
        reporte.setSize(300, 50);
        cod_v.setFont(new Font("Arial",Font.PLAIN,40));
        cod.setFont(new Font("Arial",Font.PLAIN,40));
        reg.setFont(new Font("Arial",Font.PLAIN, 40));
        datos.setFont(new Font("Arial",Font.PLAIN, 40));
        dt1.setFont(new Font("Arial",Font.PLAIN, 40));
        dt2.setFont(new Font("Arial",Font.PLAIN, 40));
        dt3.setFont(new Font("Arial",Font.PLAIN, 40));
        n1.setFont(new Font("Arial",Font.PLAIN,40));
        n2.setFont(new Font("Arial",Font.PLAIN,40));
        n3.setFont(new Font("Arial",Font.PLAIN,40));
        b.setFont(new Font("Arial",Font.PLAIN,40));
        reporte.setFont(new Font("Arial",Font.PLAIN,40));
        
        reporte.setVisible(false);
        
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
        b.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                nom=cod_v.getText();
                des=cod.getText();
                d = new java.sql.Date(reg.getDate().getTime());
                search();
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
                r.setText("<html>Para obtener un resultado primero debe llenar los campos vacios con la informacion que se pide y oprimir el boton de buscar para finalizar<html>");
                r.setFont(new Font("Arial",Font.PLAIN,35));
                y.add(r);
            }
        });
        reporte.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                int h, m, d1, d2, d3, d4;
                h=hs;
                d1=h%10;
                h=h/10;
                d2=h%10;
                h=h/10;
                d2=(d2*10)+d1;
                m=hr;
                d3=m%10;
                m=m/10;
                d4=m%10;
                m=m/10;
                d4=(d4*10)+d3;
                
                r=new reporte();
                r.setVisible(true);
                l1.setSize(182,22);
                l1.setLocation(187, 65);
                l1.setText(codigo_v);
                l1.setFont(new Font("Arial",Font.PLAIN,20));
                l2.setSize(182,22);
                l2.setLocation(187, 97);
                l2.setText(fecha1);
                l2.setFont(new Font("Arial",Font.PLAIN,20));
                l3.setSize(500,22);
                l3.setLocation(187, 127);
                l3.setText(""+nomb+""+ap+""+am+"");
                l3.setFont(new Font("Arial",Font.PLAIN,20));
                l4.setSize(610,22);
                l4.setLocation(84, 338);
                l4.setText(""+ciu+" "+pais+"");
                l4.setFont(new Font("Arial",Font.PLAIN,20));
                l5.setSize(110,22);
                l5.setLocation(300, 386);
                l5.setText(fecha1);
                l5.setFont(new Font("Arial",Font.PLAIN,15));
                l6.setSize(80,22);
                l6.setLocation(476, 386);
                l6.setText(""+h+":"+d2+"");
                l6.setFont(new Font("Arial",Font.PLAIN,15));
                l7.setSize(110,22);
                l7.setLocation(300, 410);
                l7.setText(fecha2);
                l7.setFont(new Font("Arial",Font.PLAIN,15));
                l8.setSize(80,22);
                l8.setLocation(476, 410);
                l8.setText(""+m+":"+d4+"");
                l8.setFont(new Font("Arial",Font.PLAIN,15));
                r.add(l1);
                r.add(l2);
                r.add(l3);
                r.add(l4);
                r.add(l5);
                r.add(l6);
                r.add(l7);
                r.add(l8);
            }
        });
        
        this.add(cod_v);
        this.add(cod);
        this.add(reg);
        this.add(exit);
        this.add(n1);
        this.add(n2);
        this.add(n3);
        this.add(datos);
        this.add(dt1);
        this.add(dt2);
        this.add(dt3);
        this.add(b);
        this.add(exit);
        this.add(ay);
        this.add(reporte);
        this.setUndecorated(true);
        this.setSize(1920,1080);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
    private Buscar getMe()
    {
        return this;
    }
    private void search(){
        String sql="select * from viaticos inner join viaje on viaje.Codigo = viaticos.Codigo inner join representante on viaje.Registro = representante.Registro where viaje.Pais='"+des+"' and viaje.Fecha_S='"+d+"'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                codi=rs.getString("Codigo");
                codigo_v=rs.getString("Codigo_V");
                re=rs.getString("viaje.Registro");
                pais=rs.getString("viaje.Pais");
                ciu=rs.getString("viaje.Ciudad");
                dg=rs.getInt("viaje.destino_general");
                c=rs.getInt("viaje.Clase");
                de=rs.getInt("Desayunos");
                com=rs.getInt("Comidas");
                cen=rs.getInt("Cenas");
                hos=rs.getInt("Hospedaje");
                lv=rs.getInt("Lavanderia");
                co=rs.getInt("Combustible");
                t=rs.getInt("Total_P");
                fr=rs.getDate("viaje.Fecha_R");
                fs=rs.getDate("viaje.Fecha_S");
                hs=rs.getInt("viaje.Hora_S");
                hr=rs.getInt("viaje.Hora_R");
                nomb=rs.getString("representante.Nombre");
                ap=rs.getString("representante.Apellido_P");
                am=rs.getString("representante.Apellido_M");
                confi=rs.getInt("Confirmacion");
            }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd"); 
        fecha1 = dateFormat.format(fs); //te devuelve la fecha en string con el formato dd/MM/yyyy 
        fecha2 = dateFormat.format(fr); //te devuelve la fecha en string con el formato dd/MM/yyyy
        switch(dg){
            case 1:
                desg="America";
                break;
            case 2:
                desg="Europa, Asia, Oceania o Africa";
                break;
            case 3:
                desg="Mexico";
                switch(c){
                    case 1:
                        clase="Vida cara";
                        break;
                    case 2:
                        clase="Vida media";
                        break;
                }
            break;
        } 
        String sqlc="select * from contador where Codigo_V='"+codigo_v+"'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sqlc);
            while(rs.next()){
                cande=rs.getInt("des");
                cancom=rs.getInt("com");
                cancen=rs.getInt("cen");
                canhos=rs.getInt("hos");
            }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        datos.setText("<html>"+nomb+"    "+ap+"    "+am+"    "+re+"<br>"+desg+"      "+clase+"<br>"+pais+"     "+ciu+"     "+codi+"<br>"+fs+"<-->"+fr+"<html>");
        dt1.setText("<html>Parametro<br>Desalluno<br>Comida<br>Cena<br>Hospedage<br>Lavanderia<br>Combustible<br>Total<html>");
        dt2.setText
        ("<html>Cantidad<br>  "+cande+"<br>  "+cancom+"<br>  "+cancen+"<br>  "+canhos+"  <br>---<br>---<br>---<html>");
        dt3.setText("<html>Total<br>"+de+"$<br>"+com+"$<br>"+cen+"$<br>"+hos+"$<br>"+lv+"$<br>"+co+"$<br>"+t+"$<html>");
        if(confi==1){
            reporte.setVisible(true);
        }
        else if(confi==0){
            reporte.setVisible(false);////////////////////////////////////////
        }
    } 
}
