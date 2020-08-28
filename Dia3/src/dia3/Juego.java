/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia3;

import java.io.FileWriter;
import java.io.IOException;
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
        for(int i=0;i<3;i++){// i =1 i=2
            Casilla C1=this.Tablero[i][0];
            Casilla C2=this.Tablero[i][1];
            Casilla C3=this.Tablero[i][2];
            
            if(C1!=null && C2 != null && C3!=null){
                if(C1.getPropietario() == C2.getPropietario()){
                    if(C3.getPropietario()==C1.getPropietario()){
                        this.Termino = true;
                        return;
                    }
                }
            }
            
        }
        
        for(int j=0;j<3;j++){// i =1 i=2
            Casilla C1=this.Tablero[0][j];
            Casilla C2=this.Tablero[1][j];
            Casilla C3=this.Tablero[2][j];
            
            if(C1!=null && C2 != null && C3!=null){
                if(C1.getPropietario() == C2.getPropietario()){
                    if(C3.getPropietario()==C1.getPropietario()){
                        this.Termino = true;
                        return;
                    }
                }
            }
            //0,0 y 1,1 y 2,2
            //0,2 y 1,1 y 2,0
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
            this.JuegoTerminado();
            if(this.Termino){
                System.out.println("El Jugador Con Nombre "+J1.getNombre()+" Gano La Partida");
                break;
            }
            
            if(this.Empate()){
                System.out.println("El Juego Termino En Un Empate");
                break;
            }
            
            Turno(J2);
            this.Imprimir();
            this.JuegoTerminado();
            if(this.Termino){
                System.out.println("El Jugador Con Nombre "+J2.getNombre()+" Gano La Partida");
                break;
            }
            if(this.Empate()){
                System.out.println("El Juego Termino En Un Empate");
                break;
            }
        }
        this.Reporte();
    }
    
    public void Reporte() {
        String TextoSalida="<table>";
        for(int i=0;i<3;i++){
            TextoSalida=TextoSalida+"<tr>";
            for(int j=0;j<3;j++){
                
                if(Tablero[j][i] != null){
                    if(Tablero[j][i].getPropietario()==this.J1){
                      TextoSalida=TextoSalida+"<td><img src=\"X.PNG\"></td>";  
                    }else{
                        TextoSalida=TextoSalida+"<td><img src=\"O.PNG\"></td>";
                    }
                }else{
                    TextoSalida=TextoSalida+"<td><img src=\"V.PNG\"></td>";
                }         
            }
            TextoSalida=TextoSalida+"</tr>\n";
           
        }
        TextoSalida = TextoSalida+"<\table>";
        
        FileWriter escribir = null;
        try{
            escribir = new FileWriter("C:\\Users\\Esnorki\\Desktop\\taller_ipc1\\reporte.html");
            escribir.write(TextoSalida);
            escribir.close();
       }catch(Exception ex){
            System.out.println("No se pudo abrir el archivo");
       }
           
       
    
    }
    
    public boolean Empate(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(Tablero[j][i] == null){
                    return false;
                }      
            }
        }
        
        return true;
    }
    public void Turno(Jugador Actual){
        Casilla Comprobacion= null;
        int Px=0;
        int Py=0;
        do{
            System.out.println("Ingrese Coordenada Jugador: "+Actual.getNombre());
            Scanner Leer = new Scanner(System.in);
            int Coordenada = Leer.nextInt();
            //1-9
            Px = ((Coordenada - 1) % 3);
            Py = (Coordenada - 1) / 3;
            Comprobacion =this.Tablero[Px][Py];
        }
        while (Comprobacion != null);
            

            
        
        /*
        if(Coordenada==1){
            Px = 0;
            Py  = 0;
        }*/

        // 1(0,0)-2(1,0)-3(1,0)
        // 4(0,1)-5-6
        // 7(0,2)-8-9
        
        this.Tablero[Px][Py]= new Casilla(Actual);
        
    
    }
    
}
