/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia99;

/**
 *
 * @author Esnorki
 */
public class Dia99 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(factRecursivo(3));        
    }
    
    // 5!=5*4*3*2*1=120
    // 5!=5*4!
    // 4!=4*3!
    
    // 3!=3*2!
    // 2!=2*1!
    
    // 1!=1
    public static int factRecursivo(int num){
        if(num==1)
            return 1;
        else{
            return num*factRecursivo(num-1);
        }
    }
    
    public static int factIterativo(int num){
        int fact=1;
        for(int i=num;i>0;i--){
            //5
            //60=60*3
            fact = fact*i;
        }
        return fact;
    }
    //5*3=15
    //5+5+5=15
    
    
    public static int mult(int num,int veces){
        // num = 5  veces = 0
        if(veces==0)
            return 50;
        
        int Suma=num;
        Suma= Suma+mult(num,veces-1);//10
        return Suma;
    }
    
    
    public static int Error(int num){
        //num = 0
        if(num<=0)
            return 1;
        else
            return Error(num-1);
    }
    
}
