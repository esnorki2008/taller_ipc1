/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Esnorki
 */
public class FrameLogin extends JFrame {
    private JButton BtnLogin;
    private JLabel LblContra;
    private JLabel LblTitulo;
    private JTextField TxtUsu;
    private JTextField TxtContra;
    
    public FrameLogin(){
        this.setVisible(true);
        this.setTitle("Login");
        this.initComponents();
    }
    
    private void initComponents(){
        //Inicio El Texto
        this.TxtUsu = new JTextField("");
        this.TxtContra = new JTextField("");
        //Inicio Las Etiquetas
        this.LblContra = new JLabel("Ingrese su Contrasenia");
        this.LblTitulo = new JLabel("Ingrese Su Usuario");
        //Iniciar Botones
        this.BtnLogin = new JButton("Ingresar Al Sistema");
        //Valores Del Frame
        this.setSize(450,450);
        JPanel Panel = new JPanel();
        Panel.setLayout(null);
        Panel.setSize(420,230);
        this.add(Panel);
        //GUI Ingresar Usuario
        this.TxtUsu.setBounds(10, 100, 100, 20);
        Panel.add(this.TxtUsu);
        this.LblTitulo.setBounds(10,80,200,20);
        Panel.add(this.LblTitulo);
        //GUI Ingresar Contra
        this.LblContra.setBounds(10, 130, 100, 20);
        Panel.add(this.LblContra);
        this.TxtContra.setBounds(10, 150, 100, 20);
        Panel.add(this.TxtContra);
        //Agregar Boton
        this.BtnLogin.setBounds(150, 80, 250, 40);
        Panel.add(this.BtnLogin);
        //Agregar Evento
        this.BtnLogin.addActionListener(
            new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(TxtUsu.getText().toLowerCase().equals("admin"))
                   if(TxtContra.getText().equals("1234"))
                        System.out.println("Ingreso Al Sitema");
            }
        
        
            }
        );
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
