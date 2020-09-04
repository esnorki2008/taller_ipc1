/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia8;

/**
 *
 * @author Esnorki
 */
public class Dia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Cajero Caja1 = new Cajero(30);
        Cajero Caja2 = new Cajero(31);
        Caja1.start();
        Caja2.start();
         */

        //Frame Juego = new Frame();
        //Juego.Jugar();
        
        
        Entidad Prueba = new Enemigo(20, 20, 20, 20);
        System.out.println(Prueba.getX());
        Prueba.setX(74);
        System.out.println(Prueba.getX());
        
        

    }

}
