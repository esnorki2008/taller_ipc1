/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia4;

/**
 *
 * @author Esnorki
 */
public class Cuadrado implements FiguraGeometrica{

    @Override
    public int CalcularArea(int Lado1, int Lado2) {
        return Lado1*Lado2;
    }
    
}
