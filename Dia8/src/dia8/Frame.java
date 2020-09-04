/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia8;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static java.lang.Math.abs;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Esnorki
 */
public class Frame extends JFrame{
    private JPanel panel;
    private Enemigo EnemigoArreglo[];
    private Municion MunicionArreglo[];
    private Jugador J1;
    public Frame() {
        this.setSize(800,500);
        this.setVisible(true);
        this.panel = new JPanel();
        this.panel.setLayout(null);
        this.add(panel);
        this.EnemigoArreglo = new Enemigo[50];
        this.MunicionArreglo = new Municion[50];
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setVisible(true);
        
        this.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent ke) {
                ///throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                System.out.println(ke.getKeyChar());
                switch(ke.getKeyChar()){
                    case 'w':
                        J1.MoverArriba();
                        break;
                    case 's':
                        J1.MoverAbajo();
                        break;
                    case 'h':
                        Disparar();
                        break;
                }
            }
        
        
        
        });
        this.setFocusable(true);
        this.J1 = new Jugador(700,250,100,100);
        this.panel.add(J1.getSprite());
    }
    
    public void Jugar(){
        int Contador = 0;
        while(true){
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(Contador == 10){
                CrearEnemigo();
                Contador=0;
            }
            Contador++;
            this.Colisiones();
            panel.repaint();
            this.repaint();
        }
    }
    private void Disparar(){
        for(int i=0;i<50;i++){
            Municion Actual = this.MunicionArreglo[i];
            if(Actual==null){
                
                Municion M1 = new Municion(this.J1.getX(),this.J1.getY(),100,100);
                panel.add(M1.getSprite());
                M1.start();
                this.MunicionArreglo[i]=M1;
                return;
            }
        }
    
    }
    
    private void Colisiones(){
        this.ColisionesBalasEnemigos();
    }
    private void ColisionesBalasEnemigos(){
        for(int i=0;i<50;i++){
            Enemigo EnemigoActual = this.EnemigoArreglo[i];
            if(EnemigoActual!=null){
                for (int j = 0; j < 50; j++) {
                    Municion MunicionActual = this.MunicionArreglo[j];
                    if (MunicionActual != null) {
                        if (abs(MunicionActual.getY() - EnemigoActual.getY()) <= 50 ) {
                            if (abs(MunicionActual.getX() - EnemigoActual.getX()) <= 50) {
                                this.panel.remove(this.MunicionArreglo[j].getSprite());
                                this.MunicionArreglo[j].setActivo(false);
                                this.MunicionArreglo[j]=null;
                                
                                this.EnemigoArreglo[i].RecibirGolpe();
                                if(this.EnemigoArreglo[i].getVida()<=0){
                                    this.panel.remove(this.EnemigoArreglo[i].getSprite());
                                    this.EnemigoArreglo[i].setActivo(false);
                                    this.EnemigoArreglo[i]=null;
                                }
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
    
    private void CrearEnemigo(){
        for(int i=0;i<50;i++){
            Enemigo Actual = this.EnemigoArreglo[i];
            if(Actual==null){
                int Posy = i%2;
                Enemigo Ene1 = new Enemigo(10,100+(Posy*100),100,100);
                panel.add(Ene1.getSprite());
                Ene1.start();                
                this.EnemigoArreglo[i]=Ene1;
                return;
            }
        }
        
    
    }
    
    
}
