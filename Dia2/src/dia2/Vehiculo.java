/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia2;

/**
 *
 * @author Esnorki
 */
public class Vehiculo {
    private String Placa;
    private int anio;
    private String Color;
    private String Marca;
    
    public Vehiculo(String Placa,int anio,String Color,String Marca){
        Color=Color;
        this.Placa=Placa;
        this.Marca=Marca;
        this.anio=anio;
    }
    
    /**
     * @return the Placa
     */
    public String getPlaca() {
        return Placa;
    }

    /**
     * @param Placa the Placa to set
     */
    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    /**
     * @return the anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * @return the Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * @return the Marca
     */
    public String getMarca() {
        return Marca;
    }

    /**
     * @param Marca the Marca to set
     */
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    
    
    public void Ecender(){
        System.out.println("El Vehiculo Con Placa "+this.getPlaca()+" y anio "+this.anio+" Se Esta Encendiendo");
    }
    
    
}
