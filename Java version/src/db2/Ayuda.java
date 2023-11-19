/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db2;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Omar xv
 */
public class Ayuda extends JFrame{

    private JLabel mensaje, regresar;
    public Ayuda(){
        super();
        setContentPane(new JLabel(new ImageIcon(getClass().getResource("/imagenes/menu/fondo.png"))));
        mensaje=new JLabel();
        regresar= new JLabel(new ImageIcon(getClass().getResource("/imagenes/menu/exi.png")));
        mensaje.setFont(new Font("Arial",Font.PLAIN,20));
        mensaje.setForeground(java.awt.Color.BLACK);
        mensaje.setLocation(10, 50);
        mensaje.setText("<html>Para tener acceso se tiene que utilizar el nombre de usuario que se le<br>asigno, junto con su contraseña que debe contener el primer carater<br>como mayuscula, almenos un numero y tiene que ser de almenos 6<br>caracteres de longitud</html>");
        mensaje.setSize(650, 150);
        regresar.setLocation(500, 200);
        regresar.setSize(100, 100);
        
        regresar.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent me) {
                getMe().dispose();
            }
        });
        
        setLayout(null);
        
        this.add(regresar);
        this.add(mensaje);
        this.setSize(650,350);
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
        setUndecorated(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true); 
    }
    private Ayuda getMe()
    {
        return this;
    }
}
