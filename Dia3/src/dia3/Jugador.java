/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia3;

/**
 *
 * @author Esnorki
 */
public class Jugador {
    private String Nombre;
    private String Simbolo;
    
    public Jugador(String Nombre,String Simbolo){
        this.Nombre = Nombre;
        this.Simbolo = Simbolo;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Simbolo
     */
    public String getSimbolo() {
        return Simbolo;
    }

    /**
     * @param Simbolo the Simbolo to set
     */
    public void setSimbolo(String Simbolo) {
        this.Simbolo = Simbolo;
    }
}
