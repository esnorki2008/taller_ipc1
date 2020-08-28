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
public class Triangulo implements FiguraGeometrica{
    @Override
    public int CalcularArea(int Base, int Altura) {
        return Base*Altura/2;
    }
}
