/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia4;

/**
 *
 * @author Esnorki
 */
public class Dia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Perro Perro1 = new Perro();
        Gato Gato1 = new Gato();
        
        //Perro1.Comunicarse();
        //Gato1.Comunicarse();
        
        //-------------------------------
        Animal Generico1 = new Perro();
        Animal Generico2 = new Gato();
        
        //Generico1.Comunicarse();
        //Generico2.Comunicarse();
    
        FiguraGeometrica Cuad = new Cuadrado();
        FiguraGeometrica Tri = new Triangulo();
        
        
        System.out.println(Cuad.CalcularArea(5, 3));
        System.out.println(Tri.CalcularArea(5, 3));
    }

}
