/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia6;

import dia6.Graficador;
import dia6.CargaMasiva;
import dia6.Libro;
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
public class FrameOperador extends JFrame {

    private JButton BtnCrearUsuario;
    private JButton BtnCrearCargaMasivaUsuario;
    private JButton BtnCrearCargaMasivaGeneroLiterario;
    private JButton BtnCrearCargaMasivaLibro;
    private JButton BtnCrearGraafica;
    private JLabel LblContra;
    private JLabel LblTitulo;
    private JLabel LblUsu;
    private JTextField TxtUsu;
    private JTextField TxtContra;
    private CargaMasiva Cargador;
    
    public FrameOperador() {
        this.initComponents();
        this.setVisible(true);
        this.setTitle("Operador");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.Cargador = new CargaMasiva();
    }

    private void initComponents() {
        //Dar Valores A Los Formularios
        this.TxtUsu = new JTextField();
        this.LblUsu = new JLabel("Ingrese Usuario");
        this.TxtContra = new JTextField();
        this.LblContra = new JLabel("Ingrese Usuario");
        this.LblTitulo = new JLabel("Formulario De Operador");
        this.BtnCrearUsuario = new JButton("Crear Usuario");
        this.BtnCrearCargaMasivaUsuario = new JButton("Carga Usuario");
        this.BtnCrearCargaMasivaGeneroLiterario = new JButton("Carga Genero");
        this.BtnCrearCargaMasivaLibro = new JButton("Carga Libro");
        this.BtnCrearGraafica = new JButton("Crear Grafica");
        //Visibilidad
        this.setSize(850, 550);
        JPanel Panel = new JPanel();
        Panel.setLayout(null);
        Panel.setSize(840, 540);
        this.add(Panel);
        //Colocar En El Panel
        this.TxtUsu.setBounds(10, 100, 100, 20);
        Panel.add(this.TxtUsu);
        this.LblUsu.setBounds(10, 80, 100, 20);
        Panel.add(this.LblUsu);

        this.TxtContra.setBounds(110, 100, 100, 20);
        Panel.add(this.TxtContra);
        this.LblContra.setBounds(110, 80, 100, 20);
        Panel.add(this.LblContra);

        this.BtnCrearUsuario.setBounds(370, 80, 150, 40);
        Panel.add(this.BtnCrearUsuario);
        this.BtnCrearCargaMasivaUsuario.setBounds(430, 300, 200, 40);
        Panel.add(this.BtnCrearCargaMasivaUsuario);
        this.BtnCrearCargaMasivaGeneroLiterario.setBounds(10, 300, 200, 40);
        Panel.add(this.BtnCrearCargaMasivaGeneroLiterario);
        this.BtnCrearCargaMasivaLibro.setBounds(220, 300, 200, 40);
        Panel.add(this.BtnCrearCargaMasivaLibro);
        this.BtnCrearGraafica.setBounds(210, 80, 110, 40);
        Panel.add(this.BtnCrearGraafica);
        
        this.LblTitulo.setBounds(10,20, 200, 20);
        Panel.add(LblTitulo);
        
        
        //Agregar Evento
        this.BtnCrearUsuario.addActionListener(
            new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               
            }
        
        
            }
        );
        this.BtnCrearCargaMasivaUsuario.addActionListener(
            new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               Cargador.CargarUsuarios();
               Cargador.ImprimirUsuarios();
            }
        
        
            }
        );
        this.BtnCrearCargaMasivaGeneroLiterario.addActionListener(
            new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               Cargador.CargarGeneros();
            }
        
        
            }
        );
        this.BtnCrearCargaMasivaLibro.addActionListener(
            new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               Cargador.CargarUsuarios();
            }
        
        
            }
        );
        this.BtnCrearGraafica.addActionListener(
            new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                /*
                Graficador prueba = new Graficador("Libros", "Categoria", "Cantidad");
                Genero NuevoGenero = new Genero(1, "Genero 1");
                Libro Libro1 = new Libro(10, NuevoGenero, "Libto Azul");
                Libro Libro2 = new Libro(20, NuevoGenero, "Libto Verde");
                Libro1.setCantidad(400);
                prueba.CargarLibro(Libro1);
                prueba.CargarLibro(Libro2);
                prueba.CargarGrafica();*/
                Graficador Graf = new Graficador("Libros", "Categoria", "Cantidad");
                for(int i=0;i<80;i++){
                    Libro LibroActual = Dia6.LibroArreglo[i];
                    if(LibroActual != null)
                        Graf.CargarLibro(LibroActual);
                }
                Graf.CargarGrafica();
            }
        
        
            }
        );
        
        
        
        
        
        
    }
}
