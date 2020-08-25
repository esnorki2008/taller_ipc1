/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia1;

/**
 *
 * @author Esnorki
 */
public class Dia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DECLARACIONES
        //TIPO IDENITIFACOR = VALOR;
        A A1 = new A();
        A A2 = new A();
        A A3 = null;
        System.out.println(A1);
        System.out.println(A2);
        System.out.println(A3);
        //ASIGNACIONES
      
        System.out.println("--------------");
        System.out.println(A1);
        System.out.println("-----------------------");
        int num1,num2,num3;
        num1=num2=num3=10;
        System.out.println(num1);
        //
        
        A1 = new A();
        A3 = new A();
        A1 = A3;
        if (A1 == A3)
            System.out.println("iguales");
        else
            System.out.println("diferentes");
        
        //
        
        
        
        
        //CONDICIONALES
        if(5<3){
            System.out.println("Menor");
        }else if(5<2){
            System.out.println("Mayor");
        }
        
        int variable = 20;
        switch(variable){
            case 20:
                System.out.println("Veinte");
                break;
            default:
                System.out.println("Defecto");
                break;
        
        }
        
        //CICLOS
        //FOR
        String[][] mat = new String[10][10];
        
        int contador = 0;
        for(int i=0;i<4;i++){//10
            //i==1
            for(int j=0;j<4;j++){//10
               //j==0
                mat[i][j]= "X";            
            }
        }
        
        mat[3][2]="0";
        
        for(int i=0;i<4;i++){//10
            //i==1
            for(int j=0;j<4;j++){//10
               //j==0
                System.out.println(mat[i][j]);
            }
        }
        
        //WHILE
        //DO-WHILE
        
    }
    
}


class A {
    int a = 5;
    A var = null;
}
