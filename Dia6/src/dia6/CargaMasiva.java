/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Esnorki
 */
public class CargaMasiva {

    public JFileChooser Selector() {
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("Carga Masiva");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos Entrada", "ipc1");
        chooser.addChoosableFileFilter(filter);
        chooser.setAcceptAllFileFilterUsed(true);
        return chooser;
    }

    public void CargarUsuarios() {
        JFileChooser chooser = this.Selector();

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            //String hola=" texto1,texto2  "
            //hola.split(",");
            //[texto1,texto2]
            String Leido = this.LeerArchivo(chooser.getSelectedFile().toString());
            String Lineas[] = Leido.split("\n");
            for (int j = 0; j < Lineas.length; j++) {
                String Campos[] = Lineas[j].split(",");
                //Campos[0]  NombreUsuario
                String Nombre = Campos[0];
                //Campos[1]  Contra
                String Contra = Campos[1];
                //Yo se que el arreglo tiene 100 posiciones pero voy a poner 80
                for (int i = 0; i < 80; i++) {
                    if (Dia6.UsuarioArreglo[i] == null) {
                        Dia6.UsuarioArreglo[i] = new Usuario(Nombre, Contra);
                        break;
                    }
                }
            }
        } else {
            System.out.println("No Detecto Archivo");
        }

    }

    public void CargarLibros() {
        JFileChooser chooser = this.Selector();

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            //String hola=" texto1,texto2  "
            //hola.split(",");
            //[texto1,texto2]
            String Leido = this.LeerArchivo(chooser.getSelectedFile().toString());
            String Lineas[] = Leido.split("\n");
            for (int j = 0; j < Lineas.length; j++) {
                String Campos[] = Lineas[j].split(",");
                //Campos[0]  Codigo Libro
                int Codigo = Integer.parseInt(Campos[0]);
                //Campos[1]  Codigo Genero
                int CodigoLibro = Integer.parseInt(Campos[1]);
                Genero GeneroBuscado = this.BuscarGenero(CodigoLibro);
                //Campos[2]  Nombre Libro
                String Nombre = Campos[2];
                //Yo se que el arreglo tiene 100 posiciones pero voy a poner 80
                if (GeneroBuscado == null) {
                    System.out.println("No Se Encontro El Genero");
                } else {
                    for (int i = 0; i < 80; i++) {
                        if (Dia6.LibroArreglo[i] == null) {
                            Dia6.LibroArreglo[i] = new Libro(Codigo, GeneroBuscado, Nombre);
                            break;
                        }
                    }
                }

            }
        } else {
            System.out.println("No Detecto Archivo");
        }

    }

    public Genero BuscarGenero(int CodigoGenero) {
        for (int i = 0; i < 80; i++) {
            Genero Actual = Dia6.GeneroArreglo[i];
            if (Actual != null) {
                if (Actual.getCodigo() == CodigoGenero) {
                    return Actual;
                }
            }
        }

        return null;
    }
    
    public void ImprimirGeneros(){
        for(int i=0;i<80;i++){
            if(Dia6.UsuarioArreglo[i]!=null)
            System.out.println(Dia6.GeneroArreglo[i].getNombre());
        }
    }
    public void ImprimirUsuarios(){
        for(int i=0;i<80;i++){
            if(Dia6.UsuarioArreglo[i]!=null)
            System.out.println(Dia6.UsuarioArreglo[i].getNombre());
        }
    }
    public void ImprimirLibros(){
        for(int i=0;i<80;i++){
            if(Dia6.UsuarioArreglo[i]!=null)
            System.out.println(Dia6.LibroArreglo[i].getNombre());
        }
    }
    
    public void CargarGeneros() {
        JFileChooser chooser = this.Selector();

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            //String hola=" texto1,texto2  "
            //hola.split(",");
            //[texto1,texto2]
            String Leido = this.LeerArchivo(chooser.getSelectedFile().toString());
            String Lineas[] = Leido.split("\n");
            for (int j = 0; j < Lineas.length; j++) {
                String Campos[] = Lineas[j].split(",");
                //Campos[0]  Codigo
                int Codigo = Integer.parseInt(Campos[0]);
                //Campos[1]  Contra
                String Nombre = Campos[1];
                //Yo se que el arreglo tiene 100 posiciones pero voy a poner 80
                for (int i = 0; i < 80; i++) {
                    if (Dia6.GeneroArreglo[i] == null) {
                        Dia6.GeneroArreglo[i] = new Genero(Codigo, Nombre);
                        break;
                    }
                }
            }
        } else {
            System.out.println("No Detecto Archivo");
        }
    }

    public String LeerArchivo(String Ruta) {
        String Leido = "";

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            archivo = new File(Ruta);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String Linea;
            while ((Linea = br.readLine()) != null) {
                Leido = Leido + Linea + "\n";
            }
            fr.close();
        } catch (Exception e) {
            System.out.println("Error Al Abrir El Archivo");
        }

        return Leido;
    }
}
