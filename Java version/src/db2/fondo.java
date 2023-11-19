/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db2;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Omar xv
 */
public class fondo extends JFrame{
    public fondo(){
        super();
        setContentPane(new JLabel(new ImageIcon(getClass().getResource("/imagenes/menu/plantilla.png"))));
        this.setSize(1920, 1080);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setUndecorated(true);
    }
    
}
