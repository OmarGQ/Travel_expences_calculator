/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db2;

import Atxy2k.CustomTextField.RestrictedTextField;
import com.toedter.calendar.JDateChooser;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.Format;
import java.text.SimpleDateFormat;
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
public class Crear extends JFrame{
    private JLabel exit, no, n, p, m,des, n1, n2, n3, n4, n5, n6, n7, n8, d1, d2, ay;
    private JRadioButton a1, a2, a3, c1, c2;
    public JTextField nom, pa, ma, pais, ciu, s1, s2, r1, r2, lav, comb;
    private JDateChooser fs, fr;
    public ayudita y;
    private int a, c, t, niv;
    private int hs, hr, h1, h2, m1, m2, dias;
    private int de, com, cen, hos, td, cande, cancom, cancen, canhos, tde, tcom, tcen, thos, laven=0, co=0, tt;
    private JButton bus, sav;
    private String kuni, town, reg, cod; 
    public Connection con;
    public Boolean ban=false;
    java.sql.Date rdate, sdate;
    
    public Crear(){
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
        fs=new JDateChooser();
        fr=new JDateChooser();
        nom=new JTextField();
        pa=new JTextField();
        ma=new JTextField();
        pais=new JTextField();
        ciu=new JTextField();
        s1=new JTextField();
        s2=new JTextField();
        r1=new JTextField();
        r2=new JTextField();
        comb=new JTextField();
        lav=new JTextField();
        no=new JLabel("Datos del representante");
        n=new JLabel("Nombre");
        p=new JLabel("Apellido P");
        m=new JLabel("Apellido M");
        des=new JLabel ("Destino");
        n1=new JLabel("Pais");
        n2=new JLabel("ciudad");
        n3=new JLabel("Fecha de salida");
        n4=new JLabel("Hora de salida");
        n5=new JLabel("Fecha de regreso");
        n6=new JLabel("Hora de rereso");
        n7=new JLabel("<html>Dinero para lavanderia<br>(solo mayor a 7 dias)<html>");
        n8=new JLabel("<html>Dinero para combustible<br>(solo viaje en carro)<html>");
        d1=new JLabel(":");
        d2=new JLabel(":");
        a1=new JRadioButton ("America");
        a2=new JRadioButton ("Europa, Asia, Oceania o Africa");
        a3=new JRadioButton ("Estado e interior de la republica mexicana");
        c1=new JRadioButton ("Vida cara");
        c2=new JRadioButton ("Vida media");
        bus=new JButton("<html>buscar<br>representante<html>");
        sav=new JButton("crear calculo");
        ay=new JLabel(new ImageIcon(getClass().getResource("/imagenes/menu/ayuda.png")));
        ay.setLocation(1600, 10);
        ay.setSize(80, 80);
        
        exit.setLocation(1700, 10);
        exit.setSize(150, 150);
        fs.setLocation(250, 570);
        fs.setSize(250, 40);
        fr.setLocation(250, 700);
        fr.setSize(250, 40);
        nom.setLocation(620, 120);
        nom.setSize(200, 40);
        pa.setLocation(840, 120);
        pa.setSize(200, 40);
        ma.setLocation(1060, 120);
        ma.setSize(200, 40);
        pais.setLocation(250, 450);
        pais.setSize(250, 40);
        ciu.setLocation(600, 450);
        ciu.setSize(250, 40);
        s1.setLocation(630, 570);
        s1.setSize(50, 40);
        s2.setLocation(700, 570);
        s2.setSize(50, 40);
        r1.setLocation(630, 700);
        r1.setSize(50, 40);
        r2.setLocation(700, 700);
        r2.setSize(50, 40);
        comb.setLocation(1050, 550);
        comb.setSize(250, 40);
        lav.setLocation(1050, 700);
        lav.setSize(250, 40);
        no.setLocation(250, 120);
        no.setSize(400, 40);
        n.setLocation(620, 80);
        n.setSize(400, 40);
        p.setLocation(840, 80);
        p.setSize(400, 40);
        m.setLocation(1060, 80);
        m.setSize(400, 40);
        des.setLocation(250, 200);
        des.setSize(300, 40);
        n1.setLocation(250, 410);
        n1.setSize(150, 40);
        n2.setLocation(600, 410);
        n2.setSize(150, 40);
        n3.setLocation(250, 520);
        n3.setSize(250, 40);
        n4.setLocation(600, 520);
        n4.setSize(250, 40);
        n5.setLocation(250, 650);
        n5.setSize(270, 40);
        n6.setLocation(600, 650);
        n6.setSize(250, 40);
        n7.setLocation(1000, 610);
        n7.setSize(400, 80);
        n8.setLocation(1000, 460);
        n8.setSize(400, 80);
        d1.setLocation(690, 570);
        d1.setSize(20, 40);
        d2.setLocation(690, 700);
        d2.setSize(20, 40);
        a1.setLocation(250, 240);
        a1.setSize(600, 40);
        a2.setLocation(250, 280);
        a2.setSize(600, 40);
        a3.setLocation(250, 320);
        a3.setSize(670, 40);
        c1.setLocation(950, 260);
        c1.setSize(200, 40);
        c2.setLocation(950, 300);
        c2.setSize(200, 40);
        bus.setLocation(1000, 190);
        bus.setSize(230, 80);
        sav.setLocation(500, 800);
        sav.setSize(230, 40);
        
        c1.setVisible(false);
        c2.setVisible(false);
        comb.setVisible(false);
        n8.setVisible(false);
        a1.setOpaque(false);
        a2.setOpaque(false);
        a3.setOpaque(false);
        c1.setOpaque(false);
        c2.setOpaque(false);
        a1.setEnabled(false);
        a2.setEnabled(false);
        a3.setEnabled(false);
        pais.setEnabled(false);
        ciu.setEnabled(false);
        lav.setEnabled(false);
        s1.setEnabled(false);
        s2.setEnabled(false);
        r1.setEnabled(false);
        r2.setEnabled(false);
        fs.setEnabled(false);
        fr.setEnabled(false);
        sav.setEnabled(false);

        fs.setFont(new Font("Arial",Font.PLAIN,35));
        fr.setFont(new Font("Arial",Font.PLAIN,35));
        no.setFont(new Font("Arial",Font.PLAIN,35));
        n.setFont(new Font("Arial",Font.PLAIN,35));
        p.setFont(new Font("Arial",Font.PLAIN,35));
        m.setFont(new Font("Arial",Font.PLAIN,35));
        des.setFont(new Font("Arial",Font.PLAIN,35));
        nom.setFont(new Font("Arial",Font.PLAIN,30));
        pa.setFont(new Font("Arial",Font.PLAIN,30));
        ma.setFont(new Font("Arial",Font.PLAIN,30));
        pais.setFont(new Font("Arial",Font.PLAIN,35));
        ciu.setFont(new Font("Arial",Font.PLAIN,35));
        comb.setFont(new Font("Arial",Font.PLAIN,35));
        lav.setFont(new Font("Arial",Font.PLAIN,35));
        s1.setFont(new Font("Arial",Font.PLAIN,35));
        s2.setFont(new Font("Arial",Font.PLAIN,35));
        r1.setFont(new Font("Arial",Font.PLAIN,35));
        r2.setFont(new Font("Arial",Font.PLAIN,35));
        n1.setFont(new Font("Arial",Font.PLAIN,35));
        n2.setFont(new Font("Arial",Font.PLAIN,35));
        n3.setFont(new Font("Arial",Font.PLAIN,35));
        n4.setFont(new Font("Arial",Font.PLAIN,35));
        n5.setFont(new Font("Arial",Font.PLAIN,35));
        n6.setFont(new Font("Arial",Font.PLAIN,35));
        n7.setFont(new Font("Arial",Font.PLAIN,35));
        n8.setFont(new Font("Arial",Font.PLAIN,35));
        d1.setFont(new Font("Arial",Font.PLAIN,35));
        d2.setFont(new Font("Arial",Font.PLAIN,35));
        a1.setFont(new Font("Arial",Font.PLAIN,35));
        a2.setFont(new Font("Arial",Font.PLAIN,35));
        a3.setFont(new Font("Arial",Font.PLAIN,35));
        c1.setFont(new Font("Arial",Font.PLAIN,35));
        c2.setFont(new Font("Arial",Font.PLAIN,35));
        bus.setFont(new Font("Arial",Font.PLAIN,35));
        sav.setFont(new Font("Arial",Font.PLAIN,35));
        
        setLayout(null);
        
        RestrictedTextField restricted = new RestrictedTextField(s1);
        restricted.setLimit(2);
        restricted.setOnlyNums(true);
        RestrictedTextField re = new RestrictedTextField(s2);
        re.setLimit(2);
        re.setOnlyNums(true);
        RestrictedTextField rec = new RestrictedTextField(r1);
        rec.setLimit(2);
        rec.setOnlyNums(true);
        RestrictedTextField ted = new RestrictedTextField(r2);
        ted.setLimit(2);
        ted.setOnlyNums(true);
        RestrictedTextField res = new RestrictedTextField(comb);
        res.setLimit(4);
        res.setOnlyNums(true);
        
        ButtonGroup grupo1 = new ButtonGroup();
        grupo1.add(a1);
        grupo1.add(a2);
        grupo1.add(a3);
        final ButtonGroup grupo2 = new ButtonGroup();
        grupo2.add(c1);
        grupo2.add(c2);
        
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
        bus.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                buscar();
            }
        });
        sav.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                captura();
            }
        });
        a1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                    c1.setVisible(false);
                    c2.setVisible(false);
                    comb.setVisible(false);
                    n8.setVisible(false);
                    comb.setText("");
                    a=1;
                    c=0;
            }           
        });
        a2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                    c1.setVisible(false);
                    c2.setVisible(false);
                    comb.setVisible(false);
                    n8.setVisible(false);
                    comb.setText("");
                    a=2;
                    c=0;
            } 
        });
        a3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                    c1.setVisible(true);
                    c2.setVisible(true);
                    comb.setVisible(true);
                    n8.setVisible(true);
                    grupo2.clearSelection();
                    a=3;
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
                r.setText("<html>Para crear el calculo primero se debera ingresar los datos del representante cuya informacion ya deberia estar en el sistema para prosegir a llenar todo el formulario con datos correctos, en algunos casos apareceran opciones extras dependiendo de los parametros, y una vez el formulario este completo con el boton de crear se realizara y guardara el calculo<html>");
                r.setFont(new Font("Arial",Font.PLAIN,25));
                y.add(r);
            }
        });
        
        
        this.add(exit);
        this.add(fs);
        this.add(fr);
        this.add(nom);
        this.add(pa);
        this.add(ma);
        this.add(pais);
        this.add(ciu);
        this.add(s1);
        this.add(s2);
        this.add(r1);
        this.add(r2);
        this.add(no);
        this.add(n);
        this.add(p);
        this.add(m);
        this.add(des);
        this.add(n1);
        this.add(n2);
        this.add(n3);
        this.add(n4);
        this.add(n5);
        this.add(n6);
        this.add(n7);
        this.add(n8);
        this.add(d1);
        this.add(d2);
        this.add(a1);
        this.add(a2);
        this.add(a3);
        this.add(c1);
        this.add(lav);
        this.add(comb);
        this.add(c2);
        this.add(bus);
        this.add(sav);
        this.add(ay);
        this.setUndecorated(true);
        this.setSize(1920,1080);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
    private Crear getMe()
    {
        return this;
    }
    private void buscar (){
        String v1, v2, v3, n1="", n2="", n3="";
        v1=nom.getText();
        v2=pa.getText();
        v3=ma.getText();
        String sql="select * from representante where Nombre='"+v1+"'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                n1=rs.getString("Nombre");
                n2=rs.getString("Apellido_P");
                n3=rs.getString("Apellido_M");
                niv=rs.getInt("Rango");
                reg=rs.getString("Registro");
            }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(n1.equals(v1) && n2.equals(v2) && n3.equals(v3)){
            a1.setEnabled(true);
            a2.setEnabled(true);
            a3.setEnabled(true);
            pais.setEnabled(true);
            ciu.setEnabled(true);
            s1.setEnabled(true);
            s2.setEnabled(true);
            r1.setEnabled(true);
            r2.setEnabled(true);
            fs.setEnabled(true);
            fr.setEnabled(true);
            sav.setEnabled(true);
            comb.setEnabled(true);
            lav.setEnabled(true);
            
            nom.setEnabled(false);
            pa.setEnabled(false);
            ma.setEnabled(false);
            fs.setEnabled(true);
            fr.setEnabled(true);
        }
    }
    public void captura(){
        rdate = new java.sql.Date(fr.getDate().getTime());
        sdate = new java.sql.Date(fs.getDate().getTime());
        kuni=pais.getText();
        town=ciu.getText();
        h1=Integer.parseInt(s1.getText());
        h2=Integer.parseInt(r1.getText());
        m1=Integer.parseInt(s2.getText());
        m2=Integer.parseInt(r2.getText());
        hs=(h1*100)+m1;
        hr=(h2*100)+m2;
        dias=(int) ((rdate.getTime()-sdate.getTime())/86400000);
        if(dias>=7){
            if(lav.getText().equals("")){
                laven=0;
            }else{
                laven=Integer.parseInt(lav.getText());
            }
        }
        if(a==3){
            if(comb.getText().equals("")){
                co=0;
            }else{
                co=Integer.parseInt(comb.getText());
            }
        }
        clear();
    }
    public void clear(){
        String sql="insert into viaje (Registro, destino_general, Pais, Ciudad, Hora_S, Hora_R, Fecha_S, Fecha_R, Clase) values ('"+reg+"', '"+a+"', '"+kuni+"', '"+town+"', '"+hs+"', '"+hr+"', '"+sdate+"', '"+rdate+"', '"+c+"')";
        String sqlc="select Codigo from viaje where Registro='"+reg+"' and Hora_S='"+hs+"'";
        try {
            Statement st = con.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        calculo();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sqlc);
            while(rs.next()){
                cod=rs.getString("Codigo");
            }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sqlp="insert into viaticos (Codigo, Desayunos, Comidas, Cenas, Hospedaje, Lavanderia, Combustible, Total_D, Total_P) values ('"+cod+"', '"+tde+"', '"+tcom+"', '"+tcen+"', '"+thos+"', '"+laven+"', '"+co+"', '"+td+"', '"+tt+"')";
        try {
            Statement st = con.createStatement();
            st.executeUpdate(sqlp);
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sqlv="select Codigo_V from viaticos where Codigo='"+cod+"' and Total_P='"+tt+"'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sqlv);
            while(rs.next()){
                cod=rs.getString("Codigo_V");
            }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sqlf="insert into contador (Codigo_V, des, com, cen, hos) values ('"+cod+"', '"+cande+"', '"+cancom+"', '"+cancen+"', '"+canhos+"')";
        try {
            Statement st = con.createStatement();
            st.executeUpdate(sqlf);
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void calculo(){
        String sql="select * from cantidades  where destino_general='"+a+"' and rango='"+niv+"' and clase='"+c+"'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                de=rs.getInt("desayuno");
                com=rs.getInt("comida");
                cen=rs.getInt("cena");
                hos=rs.getInt("hospedaje");
                td=rs.getInt("total_dia");
            }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        cande=dias;
        cancom=dias;
        cancen=dias;
        canhos=dias;
        if(hs>=900 && hs<1900)
            cande--;
        else if(hs>1900){
            cancom--;
            cande--;
        }
        if(hr>=600 && hr<1400){
            cande++;
        }
        else if(hr>=1400 && hr<1900){
            cande++;
            cancom++;
        }
        else if(hr>=1900){
            cande++;
            cancom++;
            cancen++;
        }
        tde=cande*de;
        tcom=cancom*com;
        tcen=cancen*cen;
        thos=canhos*hos;
        tt=tde+tcom+tcen+thos+laven+co;
    }
}
