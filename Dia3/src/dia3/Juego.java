/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia3;

import java.util.Scanner;

/**
 *
 * @author Esnorki
 */
public class Juego {
    private Casilla Tablero[][];
    private Jugador J1;
    private Jugador J2;
    private Boolean Termino;
    
    public Juego(){
        Tablero = new Casilla[3][3];
        Termino = false;
    }
    
    public void Imprimir(){
        for(int i=0;i<3;i++){
            String Fila = "";
            for(int j=0;j<3;j++){
                if(Tablero[j][i] != null){
                    Casilla Individual=Tablero[j][i];
                    Fila = Fila +Individual.RetornarSimboolo();
                }else{
                    Fila = Fila +"-";
                }          
            }
            System.out.println(Fila);
        }
    }
    public void JuegoTerminado(){
        for(int i=0;i<3;i++){
            Casilla C1=this.Tablero[i][0];
            Casilla C2=this.Tablero[i][1];
            Casilla C3=this.Tablero[i][2];
            
            if(C1!=null && C2 != null && C3!=null){
                if(C1.getPropietario() == C2.getPropietario()){
                    if(C3.getPropietario()==C1.getPropietario()){
                        
                    }
                }
            }
            
        }
    }
    
    
    public void IniciarJuego(){
        
        Scanner Leer = new Scanner(System.in);
        System.out.println("Ingrese Jugador 1");
        //String Leido= Leer.next();
        String Leido="Luis";
        J1 = new Jugador(Leido,"X");
        System.out.println("Ingrese Jugador 2");
        //Leido= Leer.next();
        Leido="Maroc";
        J2 = new Jugador(Leido,"O");
        
        this.Imprimir();
        
        while(!this.Termino){
            
            Turno(J1);
            this.Imprimir();
            if(this.Termino)
                break;
            
            
            Turno(J2);
            this.Imprimir();
            if(this.Termino)
                break;
            
            break;
        }
    }
    
    public void Turno(Jugador Actual){
        System.out.println("Ingrese Coordenada Jugador: "+Actual.getNombre());
        Scanner Leer = new Scanner(System.in);
        int Coordenada = Leer.nextInt();
        //1-9
        int Px=((Coordenada-1)%3);
        int Py=(Coordenada-1)/3;
        
        this.Tablero[Px][Py]= new Casilla(Actual);
        
    
    }
    
}
