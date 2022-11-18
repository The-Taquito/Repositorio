import java.io.*;

public class Quoridor {
    public static void main(String[] args) throws IOException{
    Variables obj1 = new Variables();
    BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
   while(obj1.juego.equals("True")){ 

    System.out.println("¡Bienvenido a Quoridor!");
    obj1.ImprimirTablero();
    System.out.println("Inicio del turno del primer jugador");
    obj1.jug1Confirm="True";

    while (obj1.jug1Confirm.equals("True")) {
        try {
            System.out.println("¿Que deseas hacer?"+"\n"+"(Escribe el numero correspondiente a la opcion para seleccionarla)"+"\n"+"\n"+"1. Moverte"+"\n"+"2. Colocar una barrera"+"\n"+"3. Salir del juego/rendirte");
            obj1.decision= Integer.parseInt(lector.readLine());
            if (obj1.decision==1) {
                System.out.println("A que direccion deseas moverte?"+"\n"+"\n"+"(Escribe el numero correspondiente a la opcion para seleccionarla)"+"\n"+"1. Moverte hacia adelante"+"\n"+"2. Moverte hacia abajo"+"\n"+"3. Moverte hacia la derecha"+"\n"+"4. Moverte hacia la izquierda");
                obj1.decisionMovimiento= Integer.parseInt(lector.readLine());
                if(obj1.decisionMovimiento==1){
                    obj1.MoverAdelante();
                    System.out.println("El jugador 1 se movio hacia adelante");
                    obj1.ImprimirTablero();
                    obj1.decisionMovimiento=0;
                    }
                else if (obj1.decisionMovimiento==2) {
                    
                } else {
                    System.out.println("Introduzca un numero valido");
                    continue;
                    }
                }
            }
         catch (Exception e) {
            System.out.println("Introduzca un numero valido");
            continue;
        }
        obj1.jug1Confirm="False";
    }

    continue;
   } 
    

     
    }
}
