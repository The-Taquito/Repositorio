import java.io.*;


public class Quoridor {
    public static void main(String[] args) throws IOException{
    Variables obj1 = new Variables();
    
    BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("¡Bienvenido a Quoridor!");

   while(obj1.juego.equals("True")){ 
    obj1.ImprimirTablero();
    System.out.println("\n"+"Inicio del turno del primer jugador");
    obj1.jug1Confirm="True";
    obj1.jug2Confirm="True";

    while (obj1.jug1Confirm.equals("True")) {
        try {
            System.out.println("¿Que deseas hacer?"+"\n"+"(Escribe el numero correspondiente a la opcion para seleccionarla)"+"\n"+"\n"+"1. Moverte"+"\n"+"2. Colocar una barrera"+"\n"+"3. EXIT");
            obj1.decision= Integer.parseInt(lector.readLine());
            if (obj1.decision==1) {
                System.out.println("A que direccion deseas moverte?"+"\n"+"\n"+"(Escribe el numero correspondiente a la opcion para seleccionarla)"+"\n"+"1. Moverte hacia adelante"+"\n"+"2. Moverte hacia abajo"+"\n"+"3. Moverte hacia la derecha"+"\n"+"4. Moverte hacia la izquierda");
                obj1.decisionMovimiento= Integer.parseInt(lector.readLine());
                if(obj1.decisionMovimiento==1){
                    if(obj1.tablero[obj1.coordenadaX1+1][obj1.coordenadaY1].equals("#")){
                        System.out.println("\n"+"La barrera bloquea tu camino hacia esta direccion"+"\n");
                        continue;
                    }
                    obj1.MoverAdelante();
                    System.out.println("\n"+"El jugador 1 se movio hacia adelante"+"\n");
                    obj1.ImprimirTablero();
                    obj1.decisionMovimiento=0;
                    }
                else if (obj1.decisionMovimiento==2) {
                    if(obj1.coordenadaX1==1){
                        System.out.println("\n"+"No puedes moverte hacia abajo desde esta posicion"+"\n");
                        continue;
                    }
                    if(obj1.tablero[obj1.coordenadaX1-1][obj1.coordenadaY1].equals("#")){
                        System.out.println("\n"+"La barrera bloquea tu camino hacia esta direccion"+"\n");
                        continue;
                    }                
                    obj1.MoverAbajo();
                    System.out.println("\n"+"El jugador 1 se movio hacia abajo"+"\n");
                    obj1.ImprimirTablero();
                    obj1.decisionMovimiento=0;
                }
                else if(obj1.decisionMovimiento==3){
                    if(obj1.coordenadaY1==17){
                        System.out.println("\n"+"No puedes moverte hacia la derecha desde esta posicion"+"\n");
                        continue;
                    }
                    if(obj1.tablero[obj1.coordenadaX1][obj1.coordenadaY1+1].equals("#")){
                        System.out.println("\n"+"La barrera bloquea tu camino hacia esta direccion"+"\n");
                        continue;
                    }
                    obj1.MoverDerecha();
                    System.out.println("\n"+"El jugador 1 se movio hacia la derecha"+"\n");
                    obj1.ImprimirTablero();
                    obj1.decisionMovimiento=0;
                }
                else if(obj1.decisionMovimiento==4){
                    if(obj1.coordenadaY1==1){
                        System.out.println("\n"+"No puedes moverte hacia la izquierda desde esta posicion"+"\n");
                        continue;
                    }
                    if(obj1.tablero[obj1.coordenadaX1][obj1.coordenadaY1-1].equals("#")){
                        System.out.println("\n"+"La barrera bloquea tu camino hacia esta direccion"+"\n");
                        continue;
                    }
                    obj1.MoverIzquierda();
                    System.out.println("\n"+"El jugador 1 se movio hacia la izquierda"+"\n");
                    obj1.ImprimirTablero();
                    obj1.decisionMovimiento=0;
                } 
                else {
                    System.out.println("\n"+"Introduzca un numero valido"+"\n");
                    continue;
                    }
                }//fin movimientos jugador 1
                if(obj1.decision==2){
                    obj1.BarreraJugador1();
                }//fin controlador barreras
                if(obj1.decision==3){
                    System.out.println("\n"+"Juego interrumpido"+"\n");
                    
                    break;
                }//fin forfeit
            }
         catch (Exception e) {
            System.out.println("Introduzca un numero valido");
            continue;
        }//fin turno jugador 1
        obj1.jug1Confirm="False";
    }//fin while jugador 1
        if(obj1.decision==3){
            System.out.println("\n"+"Movimientos realizados:"+"\n");
            System.out.println(obj1.historial);
            obj1.juego="False";
            break;
        }//fin forfeit

        if(obj1.coordenadaX1==17) {
            System.out.println("¡Ganaste, jugador 1!");
            System.out.println("\n"+"Movimientos realizados"+"\n"+obj1.historial); 
            break;
        }//Mensaje victoria jugador 1


    while (obj1.jug2Confirm.equals("True")) {
        try {
            System.out.println("\n"+"Inicio del turno del segundo jugador");
            System.out.println("¿Que deseas hacer?"+"\n"+"(Escribe el numero correspondiente a la opcion para seleccionarla)"+"\n"+"\n"+"1. Moverte"+"\n"+"2. Colocar una barrera"+"\n"+"3. EXIT");
            obj1.decision= Integer.parseInt(lector.readLine());
            if (obj1.decision==1) {
                System.out.println("A que direccion deseas moverte?"+"\n"+"\n"+"(Escribe el numero correspondiente a la opcion para seleccionarla)"+"\n"+"1. Moverte hacia adelante"+"\n"+"2. Moverte hacia abajo"+"\n"+"3. Moverte hacia la derecha"+"\n"+"4. Moverte hacia la izquierda");
                obj1.decisionMovimiento= Integer.parseInt(lector.readLine());
                
                if(obj1.decisionMovimiento==1){
                    if(obj1.tablero[obj1.coordenadaX2-1][obj1.coordenadaY2].equals("#")){
                        System.out.println("\n"+"La barrera bloquea tu camino hacia esta direccion"+"\n");
                        continue;
                    }
                    obj1.MoverAdelante2();
                    System.out.println("\n"+"El jugador 2 se movio hacia adelante"+"\n");
                    obj1.ImprimirTablero();
                    obj1.decisionMovimiento=0;
                }
                else if(obj1.decisionMovimiento==2){
                    if(obj1.coordenadaX2==17){
                        System.out.println("\n"+"No puedes moverte hacia abajo desde esta posicion"+"\n");
                        continue;
                    }
                    if(obj1.tablero[obj1.coordenadaX2+1][obj1.coordenadaY2].equals("#")){
                        System.out.println("\n"+"La barrera bloquea tu camino hacia esta direccion"+"\n");
                        continue;
                    }
                    obj1.MoverAbajo2();
                    System.out.println("\n"+"El jugador 2 se movio hacia abajo"+"\n");
                    obj1.ImprimirTablero();
                    obj1.decisionMovimiento=0;
                    
                }
                else if(obj1.decisionMovimiento==3){
                    if(obj1.coordenadaY2==17){
                        System.out.println("No puedes moverte hacia la derecha desde esta posicion");
                        continue;  
                    }
                    if(obj1.tablero[obj1.coordenadaX2][obj1.coordenadaY2+1].equals("#")){
                        System.out.println("\n"+"La barrera bloquea tu camino hacia esta direccion"+"\n");
                        continue;
                    }
                    obj1.MoverDerecha2();
                    System.out.println("\n"+"El jugador 2 se movio hacia la derecha"+"\n");
                    obj1.ImprimirTablero();
                    obj1.decisionMovimiento=0;
                }
                else  if(obj1.decisionMovimiento==4){
                    if(obj1.coordenadaY2==1){
                        System.out.println("No puedes moverte hacia la izquierda desde esta posicion");
                        continue;
                    }
                    if(obj1.tablero[obj1.coordenadaX2][obj1.coordenadaY2-1].equals("#")){
                        System.out.println("\n"+"La barrera bloquea tu camino hacia esta direccion"+"\n");
                        continue;
                    }
                    obj1.MoverIzquierda2();
                    System.out.println("\n"+"El jugador 2 se movio hacia la izquierda"+"\n");
                    obj1.ImprimirTablero();
                    obj1.decisionMovimiento=0;
                }
                else{
                    System.out.println("Introduzca un numero valido");
                    continue;
                }
                  
            }//fin seleccion movimiento
            else if (obj1.decision==2){
                obj1.BarreraJugador2();
            }//fin controlador barreras
            
            if(obj1.decision==3){
                System.out.println("\n"+"Juego interrumpido"+"\n");
                break;
            }//fin forfeit
            obj1.jug2Confirm="False";
        } catch (Exception e) {
            System.out.println("Introduzca un numero valido");
            continue;
        }
    }//fin while jugador 2
    if(obj1.decision==3){
        System.out.println("\n"+"Movimientos realizados:"+"\n");
        System.out.println(obj1.historial);
        obj1.juego="False";
        break;
    }//fin forfeit
    if(obj1.coordenadaX2==1) {
        System.out.println("¡Ganaste, jugador 2!");
        System.out.println("\n"+"Movimientos realizados"+"\n"+obj1.historial); 
        break;
    }
    
   }//fin while principal 
    

     
    }//fin main
}//fin clase Quoridor
