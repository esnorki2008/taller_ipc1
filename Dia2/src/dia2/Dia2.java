/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Esnorki
 */
public class Dia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*======================DECLARACION===============*/
        //DEFINICION SIMPLE
        int Arreglo1[][] = new int[3][9];//0,1,2
        //DEFINIENDO CON VALORES
        int arr1[][]={{1,2,3},{4,5,6}};//2*3
        /*======================USO===============*/
        int variable = Arreglo1[1][2];
        int variable1 = Arreglo1[1][2];
        /*======================LENGTH===============*/
        //System.out.println(Arreglo1[2].length);
        /*======================FOR EACH===============*/
        /*for(int uno[] : arr1 ){
            for(int dos: uno){
                System.out.println(dos);
            }
        }*/
        
        for(int uno =0;uno<2;uno++){
            for(int dos =0;dos<3;dos++){
                System.out.println(arr1[uno][dos]);
            }
        }
        
        //NULL
        /*========================METODOS Y FUNCIONES=========*/
        
        
     
    

        devolver_valor();
        
        
    }
    
    static int  devolver_valor(){
        return 5;
    }
    
    
}

