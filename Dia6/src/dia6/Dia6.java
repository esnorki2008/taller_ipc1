/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia6;

import GUI.FrameLogin;

/**
 *
 * @author Esnorki
 */
public class Dia6 {
    
    public static Genero[] GeneroArreglo = new Genero[100];
    public static Usuario[] UsuarioArreglo = new Usuario[100];
    public static Libro[] LibroArreglo = new Libro[100];
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
        //Genero GeneroCreado =  new Genero(1,"Genero 1");
        //Libro LibroCreado = new Libro(1,GeneroCreado,"Libro Verde");
        
        //System.out.println(LibroCreado.getGeneroLibro().getNombre());
    
        /*
        //LEER PRUEBA
        CargaMasiva Carga = new CargaMasiva();
        //Usuarios
        Carga.CargarUsuarios();
        Carga.ImprimirUsuarios();
        //Generos
        Carga.CargarGeneros();
        Carga.ImprimirGeneros();
        //Libros
        Carga.CargarLibros();
        Carga.ImprimirLibros();
        
        */
        
        
        Graficador prueba = new Graficador("Libros","Categoria","Cantidad");
        Genero NuevoGenero = new Genero(1,"Genero 1");
        Libro Libro1 = new Libro(10,NuevoGenero,"Libto Azul");
        Libro Libro2 = new Libro(20,NuevoGenero,"Libto Verde");
        Libro1.setCantidad(400);
        prueba.CargarLibro(Libro1);
        prueba.CargarLibro(Libro2);
        prueba.CargarGrafica();
        
        
        //FrameLogin Login = new FrameLogin();
        //FrameOperador Operador = new FrameOperador();
    
    
    }
    
}
