/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db2;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Omar xv
 */
public class Principal extends JFrame{
    private JLabel crear, buscar, salir, manual, log, sal, mod, con, eli, n1, n2 ,n3;
    private fondo back; 
    
    public Principal(int niv){
        super();
        this.back = back;
        crear=new JLabel(new ImageIcon(getClass().getResource("/imagenes/menu/mas.png")));
        buscar=new JLabel(new ImageIcon(getClass().getResource("/imagenes/menu/bus.png")));
        manual=new JLabel(new ImageIcon(getClass().getResource("/imagenes/menu/manu.png")));
        mod=new JLabel(new ImageIcon(getClass().getResource("/imagenes/menu/mod.png")));
        con=new JLabel(new ImageIcon(getClass().getResource("/imagenes/menu/coni.png")));
        eli=new JLabel(new ImageIcon(getClass().getResource("/imagenes/menu/eli.png")));
        log=new JLabel(new ImageIcon(getClass().getResource("/imagenes/menu/log.png")));
        salir=new JLabel(new ImageIcon(getClass().getResource("/imagenes/menu/sal.png")));
        n1=new JLabel();
        n2=new JLabel();
        n3=new JLabel();
        sal=new JLabel();
        salir.setSize(150, 150);
        salir.setLocation(1720,10);
        sal.setText("<html>Bienvenido al<br>calculador de viaticos de</html>");
        sal.setFont(new Font("Arial",Font.PLAIN,40));
        log.setLocation(500, 150);
        log.setSize(800, 250);
        sal.setSize(600,150);
        sal.setLocation(650, 0);
        setContentPane(new JLabel(new ImageIcon(getClass().getResource("/imagenes/menu/plantilla.png"))));
        switch (niv){
            case 1:
                crear.setLocation(400, 500);
                crear.setSize(200, 200);
                buscar.setLocation(800, 500);
                buscar.setSize(200, 200);
                manual.setLocation(1200, 500);
                manual.setSize(200, 200);
                n1.setLocation(440, 700);
                n1.setSize(200, 80);
                n2.setLocation(840, 700);
                n2.setSize(200, 40);
                n3.setLocation(1240, 700);
                n3.setSize(200, 40);
                n1.setText("<html>Nuevo<br>calculo<html>");
                n2.setText("Buscar");
                n3.setText("Manual");
                n1.setFont(new Font("Arial",Font.PLAIN,40));
                n2.setFont(new Font("Arial",Font.PLAIN,40));
                n3.setFont(new Font("Arial",Font.PLAIN,40));
                break;
                
            case 2:
                con.setSize(200, 200);
                con.setLocation(860,500);
                n2.setLocation(880, 700);
                n2.setSize(200, 40);
                n2.setText("Confirmar");
                n2.setFont(new Font("Arial",Font.PLAIN,40));
                break;
                
            case 3:
                mod.setSize(200, 200);
                mod.setLocation(600, 500);
                eli.setSize(200, 200);
                eli.setLocation(1000, 500);
                n1.setLocation(640, 700);
                n1.setSize(200, 80);
                n2.setLocation(1040, 700);
                n2.setSize(200, 40);
                n1.setText("Modificar");
                n2.setText("Eliminar");
                n1.setFont(new Font("Arial",Font.PLAIN,40));
                n2.setFont(new Font("Arial",Font.PLAIN,40));
                break;
        }
        
        setLayout(null);
        
        salir.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                System.exit(0);
            }  
        });
        
        manual.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                Manual manu =  new  Manual();
                manu.setVisible(true);
                manu.addWindowListener(new WindowAdapter() {
                    public void windowClosed(WindowEvent w){
                        getMe().setVisible(true);
                    }
                });
                getMe().setVisible(false);
            }  
        });
        buscar.addMouseListener(new MouseAdapter() {
         @Override
            public void mouseClicked(MouseEvent me) {
                Buscar bus =new Buscar();
                bus.setVisible(true);
                bus.addWindowListener(new WindowAdapter() {
                    public void windowClosed(WindowEvent w){
                        getMe().setVisible(true);
                    }
                });
                getMe().setVisible(false);
            }
    });
        eli.addMouseListener(new MouseAdapter() {
         @Override
            public void mouseClicked(MouseEvent me) {
                Eliminar del =new Eliminar();
                del.setVisible(true);
                del.addWindowListener(new WindowAdapter() {
                    public void windowClosed(WindowEvent w){
                        getMe().setVisible(true);
                    }
                });
                getMe().setVisible(false);
            }
    });
        crear.addMouseListener(new MouseAdapter() {
         @Override
            public void mouseClicked(MouseEvent me) {
                Crear cr =new Crear();
                cr.setVisible(true);
                cr.addWindowListener(new WindowAdapter() {
                    public void windowClosed(WindowEvent w){
                        getMe().setVisible(true);
                    }
                });
                getMe().setVisible(false);
            }
    });
        mod.addMouseListener(new MouseAdapter() {
         @Override
            public void mouseClicked(MouseEvent me) {
                Modificar mo =new Modificar();
                mo.setVisible(true);
                mo.addWindowListener(new WindowAdapter() {
                    public void windowClosed(WindowEvent w){
                        getMe().setVisible(true);
                    }
                });
                getMe().setVisible(false);
            }
    });
        con.addMouseListener(new MouseAdapter() {
         @Override
            public void mouseClicked(MouseEvent me) {
                Confirmar co =new Confirmar();
                co.setVisible(true);
                co.addWindowListener(new WindowAdapter() {
                    public void windowClosed(WindowEvent w){
                        getMe().setVisible(true);
                    }
                });
                getMe().setVisible(false);
            }
    });
        
        this.add(salir);
        this.add(mod);
        this.add(eli);
        this.add(con);
        this.add(crear);
        this.add(buscar);
        this.add(manual);
        this.add(sal);
        this.add(log);
        this.add(n1);
        this.add(n2);
        this.add(n3);
        this.setUndecorated(true);
        this.setSize(1920,1080);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true); 
    }
    public fondo getBack()
    {
        return back;
    }
    private Principal getMe()
    {
        return this;
    }
}
