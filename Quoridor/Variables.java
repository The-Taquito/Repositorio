import java.io.*;
public class Variables {
    String jug1= "+";
    String jug1Confirm = "True";
    String jug2Confirm = "True";
    int decision;
    int decisionMovimiento;
    int coordenadaY1 = 9;
    int coordenadaX1 = 1;
    int coordenadaY2 = 9;
    int coordenadaX2 = 17;

    String jug2= "^";
    String juego = "True";
    String historial="Inicio del juego";
    String[][] tablero ={{"-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"},
                        {"|"," ","|"," ","|"," ","|"," ","|",jug1,"|"," ","|"," ","|"," ","|"," ","|"},
                        {"-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"},
                        {"|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"},
                        {"-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"},
                        {"|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"},
                        {"-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"},
                        {"|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"},
                        {"-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"},
                        {"|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"},
                        {"-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"},
                        {"|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"},
                        {"-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"},
                        {"|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"},
                        {"-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"},
                        {"|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"},
                        {"-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"},
                        {"|"," ","|"," ","|"," ","|"," ","|",jug2,"|"," ","|"," ","|"," ","|"," ","|"},
                        {"-","A","-","B","-","C","-","D","-","E","-","F","-","G","-","H","-","I","-"},
                        };
    public void ImprimirTablero(){
       for(int i=0; i<tablero.length;i++){
        for(int j=0;j<tablero[0].length;j++){
            System.out.print(tablero[i][j]);
        }
        System.out.println();
       } 
    }
    public void MoverAdelante(){
        tablero[coordenadaX1][coordenadaY1]=" ";
        coordenadaX1= coordenadaX1 +2;
        tablero[coordenadaX1][coordenadaY1]=tablero[coordenadaX1][coordenadaY1]+jug1;
        historial=historial + "\n"+"El jugador 1 se movio hacia adelante";

        

    }
    public void MoverAbajo(){
        tablero[coordenadaX1][coordenadaY1]=" ";
        coordenadaX1= coordenadaX1 -2;
        tablero[coordenadaX1][coordenadaY1]=tablero[coordenadaX1][coordenadaY1]+jug1;
        historial=historial + "\n"+"El jugador 1 se movio hacia atras";
    }
    public void MoverDerecha(){
        tablero[coordenadaX1][coordenadaY1]=" ";
        coordenadaY1= coordenadaY1 +2;
        tablero[coordenadaX1][coordenadaY1]=tablero[coordenadaX1][coordenadaY1]+jug1;
        historial=historial + "\n"+"El jugador 1 se movio hacia la derecha";
    }
    public void MoverIzquierda(){
        tablero[coordenadaX1][coordenadaY1]=" ";
        coordenadaY1= coordenadaY1 -2;
        tablero[coordenadaX1][coordenadaY1]=tablero[coordenadaX1][coordenadaY1]+jug1;
        historial=historial + "\n"+"El jugador 1 se movio hacia la izquierda";
    }
    public void MoverAdelante2(){
        tablero[coordenadaX2][coordenadaY2]=" ";
        coordenadaX2= coordenadaX2 -2;
        tablero[coordenadaX2][coordenadaY2]=tablero[coordenadaX2][coordenadaY2]+jug2;
        historial=historial + "\n"+"El jugador 2 se movio hacia adelante";
    }
    public void MoverAbajo2(){
        tablero[coordenadaX2][coordenadaY2]=" ";
        coordenadaX2= coordenadaX2 +2;
        tablero[coordenadaX2][coordenadaY2]=tablero[coordenadaX2][coordenadaY2]+jug2;
        historial=historial + "\n"+"El jugador 2 se movio hacia abajo";
    }
}
    
    


    

