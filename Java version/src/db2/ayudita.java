/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db2;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Omar xv
 */
public class ayudita extends JFrame{
    private JLabel a; 
            
    public ayudita (){
        a=new JLabel();
        a.setLocation(250, 20);
        a.setSize(100, 40);
        a.setFont(new Font("Arial",Font.PLAIN,40));
        
        setLayout(null);
        
        this.add(a);
        this.setSize(600, 500);
        this.setLocation(400, 200);
    }
}

