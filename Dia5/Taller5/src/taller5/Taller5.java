/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class Taller5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //JFRAME
        JFrame Principal = new JFrame("Titulo Principal");
        Principal.setVisible(true);
        Principal.setSize(700, 600);
        Principal.setLocation(100, 50);
        
        JPanel Panel = new JPanel();
        Principal.setSize(680, 580);
        Principal.add(Panel);
        Principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Panel.setLayout(null);
        //=============JBUTTON
        MiBoton Boton1 = new MiBoton("Boton Prueba",160, 40);
        Boton1.setLocation(10, 10);
        
        //=============JTEXT
        JTextField Texto = new JTextField("Texto");
        Texto.setSize(160, 40);
        Texto.setLocation(10, 55);
        //==============JLABEL
        JLabel Etiqueta = new JLabel("Titulo Label");
        Etiqueta.setSize(160, 40);
        Etiqueta.setLocation(10, 90);
        
        Panel.add(Boton1);
        Panel.add(Texto);
        Panel.add(Etiqueta);
        
        Boton1.addKeyListener(new MiEvento());
        
        Boton1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                Etiqueta.setText(Texto.getText());
            }
        });
        
        JScrollPane Scroll = new JScrollPane(); 
        Scroll.setSize(300, 70);
        Scroll.setLocation(10, 150);
        
        
        DefaultTableModel Defecto = new DefaultTableModel();
        Defecto.addColumn("Nombre");
        Defecto.addColumn("Apellido");
        Defecto.addRow(new Object[]{"Mario","Gonzales"});
        
        
        JTable tabla = new JTable(Defecto);
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        tabla.setSize(300, 70);
        
        Scroll.add(tabla);
        Scroll.setVisible(true);
        Panel.add(Scroll);
        Panel.repaint();
        Principal.setVisible(true);
    }
    
}
