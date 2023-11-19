/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db2;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

/**
 *
 * @author Informatica
 */
public class Manual extends JFrame{
    private JLabel exit, im;
    private JScrollPane ma;
    
    public Manual(){
        super();
        setContentPane(new JLabel(new ImageIcon(getClass().getResource("/imagenes/menu/ver.png"))));
        exit=new JLabel(new ImageIcon(getClass().getResource("/imagenes/menu/sal.png")));
        im=new JLabel(new ImageIcon(getClass().getResource("/imagenes/menu/man.png")));
        ma=new JScrollPane(im);
        exit.setLocation(1700, 10);
        exit.setSize(150, 150);
        ma.setSize(1920, 900);
        ma.setLocation(0, 200);
        im.setSize(1920,2840);
        im.setLocation(0,0);
        
        setLayout(null);
        
        exit.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                getMe().dispose();
            }
        });
        
        this.add(ma);
        this.add(exit);
        this.setUndecorated(true);
        this.setSize(1920,1080);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
    private Manual getMe()
    {
        return this;
    }
}
