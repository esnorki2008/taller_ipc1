/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia8;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Esnorki
 */
public class Cajero extends Thread{
    private int TiempoDeServicio;

    public Cajero(int TiempoDeServicio) {
        this.TiempoDeServicio = TiempoDeServicio;
    }
    private void DarServicio(){
        System.out.println("Servicio Iniciado");
        try {
            Thread.sleep(this.TiempoDeServicio*100);
        } catch (InterruptedException ex) {
            
        }
        System.out.println("Servicio Finalizado");
    }
    
    @Override
    public void run(){
        this.DarServicio();
    }
}
