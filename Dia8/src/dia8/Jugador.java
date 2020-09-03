/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia8;

import javax.swing.ImageIcon;

/**
 *
 * @author Esnorki
 */
public class Jugador extends Entidad{

    public Jugador(int X, int Y, int SizeX, int SizeY) {
        super(X, Y, SizeX, SizeY);
        this.Sprite.setText("");
        ImageIcon Imagen = new ImageIcon("C:\\Users\\Esnorki\\Desktop\\taller_ipc1\\Imagenes\\Nave.png");
        this.Sprite.setIcon(Imagen);
    }

    @Override
    public void run() {
    }
    
    public void MoverAbajo(){
        if(this.Y<400){
            this.Y = this.Y+10;
            this.Sprite.setLocation(X,Y);
        }
    }
    public void MoverArriba(){
        if(this.Y>10){
            this.Y = this.Y-10;
            this.Sprite.setLocation(X,Y);
        }
    }
}
