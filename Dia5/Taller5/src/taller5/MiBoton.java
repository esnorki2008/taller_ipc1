/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller5;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author Admin
 */
public class MiBoton extends JButton{
    public MiBoton(String Texto, int X,int Y){
       this.setText(Texto);
       this.setSize(X, Y);
       this.setBackground(Color.RED);
    }
}
