/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia9;

/**
 *
 * @author Esnorki
 */
public class Dia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println(mult(5,8));
        //System.out.println(div(41,8));
        //System.out.println(mod(41,8));
        //System.out.println(fact(6));
    }
    
    public static int fact(int numero){
        if(numero ==0)
            return 1;
        return numero*fact(numero-1);
    }
    public static int div(int dividendo,int divisor){
        if (dividendo <divisor)
            return 0;
        return div(dividendo-divisor,divisor)+1;
    }
    public static int mod(int dividendo,int divisor){
        if (dividendo <divisor)
            return dividendo;
        return div(dividendo-divisor,divisor);
    }
    public static int mult(int num,int veces){
        if (veces == 0)
            return 0;
                
        return mult(num,veces-1)+num;
    }
}
