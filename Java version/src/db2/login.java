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
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Omar xv
 */
    public class login extends JFrame{
    public boolean openedOnce;
    public JButton ingresar, salir;
    private JTextField usuario, clave;
    private JLabel usu, cla, fondo, ayuda;
    private fondo back;
    public Connection con;
    int niv;
    Principal prin; 
    
    public login (){
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
        
        setContentPane(new JLabel(new ImageIcon(getClass().getResource("/imagenes/menu/fondo.png"))));
        back=new fondo();
        ingresar=new JButton("ingrear");
        salir=new JButton("cerrar");
        ayuda=new JLabel(new ImageIcon(getClass().getResource("/imagenes/menu/ayuda.png")));
        usuario=new JTextField();
        clave=new JPasswordField();
        usu=new JLabel();
        cla=new JLabel();
        ingresar.setLocation(400, 250);
        ingresar.setSize(200, 50);
        salir.setLocation(80, 250);
        salir.setSize(200, 50);
        ayuda.setLocation(530, 10);
        ayuda.setSize(80, 80);
        usuario.setLocation(150, 100);
        usuario.setSize(450, 40);
        usuario.setFont(new Font("Arial",Font.PLAIN,20));
        clave.setLocation(150, 150);
        clave.setSize(450, 40);
        clave.setFont(new Font("Arial",Font.PLAIN,20));
        usu.setText("USUARIO");
        usu.setLocation(50, 100);
        usu.setSize(90, 40);
        cla.setText("CLAVE");
        cla.setLocation(50, 150);
        cla.setSize(90, 40);
        
        setLayout(null);
        
        ingresar.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent ae) {
                String usu=usuario.getText();
                String pas=clave.getText();
                acceder(usu, pas);
            }
        });
        
        ayuda.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                Ayuda aiuda =  new  Ayuda();
                aiuda.setVisible(true);
                aiuda.addWindowListener(new WindowAdapter() {
                    public void windowClosed(WindowEvent w){
                        getMe().setVisible(true);
                    }
                });
                getMe().setVisible(false);
            }  
        });
        salir.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                System.exit(0);
            }  
        });
        this.add(ingresar);
        this.add(salir);
        this.add(ayuda);
        this.add(usuario);
        this.add(clave);
        this.add(usu);
        this.add(cla);
        this.setAlwaysOnTop(true);
        this.setSize(650,350);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        setUndecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        if(openedOnce == false){
            new Splash(this, back);
            openedOnce = true;
        }
    }
    private login getMe()
    {
        return this;
    }
    private fondo getBack()
    {
        return back;
    }

    private void acceder(String id, String pass){
        String us="", pa="";
        String sql="select * from usuarios where ID = '"+usuario.getText()+"' ";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                us=rs.getString("ID");
                pa=rs.getString("pasword");
                niv=rs.getInt("nivel");
            }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(us.equals(id) && pa.equals(pass)){
            prin = new Principal(niv);
            prin.setVisible(true);
            getMe().setVisible(false);
            getBack().setVisible(false);
            try{
                con.close();
            } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        usuario.setText("");
        clave.setText("");
        us="";
        pa="";
    }
}
