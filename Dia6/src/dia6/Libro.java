/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia6;

/**
 *
 * @author Esnorki
 */
public class Libro {
    private int Codigo;
    private String Nombre;
    private Genero GeneroLibro;
    private int Cantidad;

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
    
    public Libro(int Codigo,Genero GeneroLibro, String Nombre ) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.GeneroLibro = GeneroLibro;
        this.Cantidad = 1;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Genero getGeneroLibro() {
        return GeneroLibro;
    }

    public void setGeneroLibro(Genero GeneroLibro) {
        this.GeneroLibro = GeneroLibro;
    }
    
    
    
}
