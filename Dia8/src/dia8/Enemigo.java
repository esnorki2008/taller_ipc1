/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia8;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Esnorki
 */
public class Enemigo extends Entidad{
    private int Vida;
    public Enemigo(int X, int Y, int SizeX, int SizeY) {
        super(X, Y, SizeX, SizeY);
        this.Sprite.setText("");
        ImageIcon Imagen = new ImageIcon("C:\\Users\\Esnorki\\Desktop\\taller_ipc1\\Imagenes\\Enem.png");
        this.Sprite.setIcon(Imagen);
        this.Vida = 3;
    }
    public void RecibirGolpe(){
        this.Vida--;
    }
    public int getVida() {
        return Vida;
    }

    public void setVida(int Vida) {
        this.Vida = Vida;
    }

    public JLabel getSprite() {
        return Sprite;
    }

    public void setSprite(JLabel Sprite) {
        this.Sprite = Sprite;
    }

    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

    public Boolean getActivo() {
        return Activo;
    }

    public void setActivo(Boolean Activo) {
        this.Activo = Activo;
    }
            
    @Override
    public void run() {
        while(Activo && this.X <700){
            try {
                Thread.sleep(400);
            } catch (InterruptedException ex) {
                Logger.getLogger(Enemigo.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.X = this.X+10;
            this.Sprite.setLocation(X, Y);
        }
    }
    
}
