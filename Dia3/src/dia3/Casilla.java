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
public class Casilla {
    private Jugador Propietario;
    public Casilla(Jugador Propi){
        Propietario=Propi;
    }
    public String RetornarSimboolo(){
        return this.Propietario.getSimbolo();
    }
    /**
     * @return the Propietario
     */
    public Jugador getPropietario() {
        return Propietario;
    }

    /**
     * @param Propietario the Propietario to set
     */
    public void setPropietario(Jugador Propietario) {
        this.Propietario = Propietario;
    }
    
}
