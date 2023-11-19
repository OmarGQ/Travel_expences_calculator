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
public class reporte extends JFrame{
    public reporte(){
        super();
        setContentPane(new JLabel(new ImageIcon(getClass().getResource("/imagenes/menu/tt.png"))));
        
        setLayout(null);
        
        this.setSize(720, 890);
        this.setLocation(400, 200);
    }
    
}
