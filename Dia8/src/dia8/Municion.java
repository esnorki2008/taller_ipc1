/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia8;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Esnorki
 */
public class Municion extends Entidad{

    public Municion(int X, int Y, int SizeX, int SizeY) {
        super(X, Y-0, SizeX, SizeY);
        this.Sprite.setText("");
        ImageIcon Imagen = new ImageIcon("C:\\Users\\Esnorki\\Desktop\\taller_ipc1\\Imagenes\\bala.png");
        this.Sprite.setIcon(Imagen);
    }

    @Override
    public void run() {
        while(Activo && this.X >20){
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(Enemigo.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.X = this.X-10;
            this.Sprite.setLocation(X, Y);
        }
    }
    
}
