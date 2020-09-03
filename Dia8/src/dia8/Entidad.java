/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia8;

import javax.swing.JLabel;

/**
 *
 * @author Esnorki
 */
public abstract class Entidad extends Thread{
    protected JLabel Sprite;
    protected int X,Y;
    protected Boolean Activo;
    public Entidad(int X,int Y,int SizeX,int SizeY) {
        this.X=X;
        this.Y=Y;
        this.Sprite = new JLabel("A");
        this.Sprite.setBounds(X,Y,SizeX,SizeY);
        this.Activo = true;
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
    public abstract void run();
}
