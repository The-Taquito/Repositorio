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
    int coordenadaBarreraX1;
    int coordenadaBarreraY1;
    int coordenadaBarreraX2;
    int coordenadaBarreraY2;
    int conteoBarrera1=10;
    int conteoBarrera2=10;
    BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
    String jug2= "^";
    String juego = "True";
    String historial="Inicio del juego";
    String[][] tablero ={{"-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," "},
                        {"|"," ","|"," ","|"," ","|"," ","|",jug1,"|"," ","|"," ","|"," ","|"," ","|","1"},
                        {"-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," "},
                        {"|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|","2"},
                        {"-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," "},
                        {"|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|","3"},
                        {"-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," "},
                        {"|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|","4"},
                        {"-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," "},
                        {"|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|","5"},
                        {"-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," "},
                        {"|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|","6"},
                        {"-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," "},
                        {"|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|","7"},
                        {"-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," "},
                        {"|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|"," ","|","8"},
                        {"-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," ","-"," "},
                        {"|"," ","|"," ","|"," ","|"," ","|",jug2,"|"," ","|"," ","|"," ","|"," ","|","9"},
                        {"-","A","-","B","-","C","-","D","-","E","-","F","-","G","-","H","-","I","-"," "},
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
    public void MoverDerecha2(){
        tablero[coordenadaX2][coordenadaY2]=" ";
        coordenadaY2= coordenadaY2 +2;
        tablero[coordenadaX2][coordenadaY2]=tablero[coordenadaX2][coordenadaY2]+jug2;
        historial=historial + "\n"+"El jugador 2 se movio hacia la derecha";
    }
    public void MoverIzquierda2(){
        tablero[coordenadaX2][coordenadaY2]=" ";
        coordenadaY2= coordenadaY2 -2;
        tablero[coordenadaX2][coordenadaY2]=tablero[coordenadaX2][coordenadaY2]+jug1;
        historial=historial + "\n"+"El jugador 2 se movio hacia la izquierda";
    }
    public void BarreraJugador1()throws IOException{
        String letraTablero;
        int numeroTablero;
        int decisionBarrera;
        

        System.out.println("\n"+"Barreras restantes: "+conteoBarrera1+"\n");
        System.out.println("Escribe una letra de la A a la I para indicar la columna donde deseas la barrera");
        letraTablero=lector.readLine();
        switch (letraTablero) {
            case "A":
                if(conteoBarrera1>=1){
                    
                coordenadaBarreraY1=1;
                System.out.println("Escribe un numero del 1 al 8 para indicar la fila donde deseas la barrera ");
                numeroTablero=Integer.parseInt(lector.readLine());
                if(numeroTablero==9){
                    System.out.println("\n"+"No puedes colocar una barrera en esta posicion");
                    break;
                }
                coordenadaBarreraX1=numeroTablero*2;
                
                System.out.println("\n"+"¿como deseas colocar la barrera?"+"\n"+"1. Horizontalmente"+"\n"+"2. Verticalmente");
                decisionBarrera=Integer.parseInt(lector.readLine());
                if(decisionBarrera==1){
                    
                    if(tablero[coordenadaBarreraX1][coordenadaBarreraY1].equals("#")){
                        if(tablero[coordenadaBarreraX1][coordenadaBarreraY1+3].equals("#")){
                            System.out.println("\n"+"Ya existe una barrera en esta posicion"+"\n");
                            break;
                        }
                    }
                    System.out.println("Tu barrera se colocara horizontalmente"+"\n");
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1-1]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1+1]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1+2]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1+3]="#";
                    historial=historial+"\n"+"El jugador 1 coloco una barrera horizontal en la posicion: "+letraTablero+numeroTablero;
                    ImprimirTablero();
                    System.out.println("\n"+"El jugador 1 coloco una barrera horizontal en la posicion: "+letraTablero+numeroTablero+"\n");
                    conteoBarrera1=conteoBarrera1-1;
                    System.out.println("\n"+"Barreras restantes: "+conteoBarrera1+"\n");
                }
                else if(decisionBarrera==2){
                    if(tablero[coordenadaBarreraX1-1][coordenadaBarreraY1+1].equals("#")){
                        if(tablero[coordenadaBarreraX1+1][coordenadaBarreraY1+1].equals("#")){
                            System.out.println("\n"+"Ya existe una barrera en esta posicion"+"\n");
                            break;
                        }
                    }
                    System.out.println("Tu barrera se colocara verticalmente");
                    tablero[coordenadaBarreraX1-1][coordenadaBarreraY1+1]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1+1]="#";
                    tablero[coordenadaBarreraX1+1][coordenadaBarreraY1+1]="#";
                    historial=historial+"\n"+"El jugador 1 coloco una barrera vertical en la posicion: "+letraTablero+numeroTablero;
                    ImprimirTablero();
                    System.out.println("\n"+"El jugador 1 coloco una barrera vertical en la posicion: "+letraTablero+numeroTablero+"\n");
                    conteoBarrera1=conteoBarrera1-1;
                    System.out.println("\n"+"Barreras restantes: "+conteoBarrera1+"\n");
                }
                else{
                    System.out.println("Escribe un numero entre el 1 al 8");
                    break;
                }
                }
                else{
                    System.out.println("No tienes barreras restantes para colocar");
                    break;
                }
                
                
                break;
            
            case "B":

            if(conteoBarrera1>=1){
                    
                coordenadaBarreraY1=3;
                System.out.println("Escribe un numero del 1 al 8 para indicar la fila donde deseas la barrera ");
                numeroTablero=Integer.parseInt(lector.readLine());
                if(numeroTablero==9){
                    System.out.println("\n"+"No puedes colocar una barrera en esta posicion");
                    break;
                }
                coordenadaBarreraX1=numeroTablero*2;
                
                System.out.println("\n"+"¿como deseas colocar la barrera?"+"\n"+"1. Horizontalmente"+"\n"+"2. Verticalmente");
                decisionBarrera=Integer.parseInt(lector.readLine());
                if(decisionBarrera==1){
                    
                    if(tablero[coordenadaBarreraX1][coordenadaBarreraY1].equals("#")){
                        if(tablero[coordenadaBarreraX1][coordenadaBarreraY1+3].equals("#")){
                            System.out.println("\n"+"Ya existe una barrera en esta posicion"+"\n");
                            break;
                        }
                    }
                    System.out.println("Tu barrera se colocara horizontalmente"+"\n");
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1-1]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1+1]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1+2]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1+3]="#";
                    historial=historial+"\n"+"El jugador 1 coloco una barrera horizontal en la posicion: "+letraTablero+numeroTablero;
                    ImprimirTablero();
                    System.out.println("\n"+"El jugador 1 coloco una barrera horizontal en la posicion: "+letraTablero+numeroTablero+"\n");
                    conteoBarrera1=conteoBarrera1-1;
                    System.out.println("\n"+"Barreras restantes: "+conteoBarrera1+"\n");
                }
                else if(decisionBarrera==2){
                    if(tablero[coordenadaBarreraX1-1][coordenadaBarreraY1+1].equals("#")){
                        if(tablero[coordenadaBarreraX1+1][coordenadaBarreraY1+1].equals("#")){
                            System.out.println("\n"+"Ya existe una barrera en esta posicion"+"\n");
                            break;
                        }
                    }
                    System.out.println("Tu barrera se colocara verticalmente");
                    tablero[coordenadaBarreraX1-1][coordenadaBarreraY1+1]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1+1]="#";
                    tablero[coordenadaBarreraX1+1][coordenadaBarreraY1+1]="#";
                    historial=historial+"\n"+"El jugador 1 coloco una barrera vertical en la posicion: "+letraTablero+numeroTablero;
                    ImprimirTablero();
                    System.out.println("\n"+"El jugador 1 coloco una barrera vertical en la posicion: "+letraTablero+numeroTablero+"\n");
                    conteoBarrera1=conteoBarrera1-1;
                    System.out.println("\n"+"Barreras restantes: "+conteoBarrera1+"\n");
                }
                else{
                    System.out.println("Escribe un numero entre el 1 al 8");
                    break;
                }
                }
                else{
                    System.out.println("No tienes barreras restantes para colocar");
                    break;
                }
                break;


            case "C":
            if(conteoBarrera1>=1){
                    
                coordenadaBarreraY1=5;
                System.out.println("Escribe un numero del 1 al 8 para indicar la fila donde deseas la barrera ");
                numeroTablero=Integer.parseInt(lector.readLine());
                if(numeroTablero==9){
                    System.out.println("\n"+"No puedes colocar una barrera en esta posicion");
                    break;
                }
                coordenadaBarreraX1=numeroTablero*2;
                
                System.out.println("\n"+"¿como deseas colocar la barrera?"+"\n"+"1. Horizontalmente"+"\n"+"2. Verticalmente");
                decisionBarrera=Integer.parseInt(lector.readLine());
                if(decisionBarrera==1){
                    
                    if(tablero[coordenadaBarreraX1][coordenadaBarreraY1].equals("#")){
                        if(tablero[coordenadaBarreraX1][coordenadaBarreraY1+3].equals("#")){
                            System.out.println("\n"+"Ya existe una barrera en esta posicion"+"\n");
                            break;
                        }
                    }
                    System.out.println("Tu barrera se colocara horizontalmente"+"\n");
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1-1]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1+1]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1+2]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1+3]="#";
                    historial=historial+"\n"+"El jugador 1 coloco una barrera horizontal en la posicion: "+letraTablero+numeroTablero;
                    ImprimirTablero();
                    System.out.println("\n"+"El jugador 1 coloco una barrera horizontal en la posicion: "+letraTablero+numeroTablero+"\n");
                    conteoBarrera1=conteoBarrera1-1;
                    System.out.println("\n"+"Barreras restantes: "+conteoBarrera1+"\n");
                }
                else if(decisionBarrera==2){
                    if(tablero[coordenadaBarreraX1-1][coordenadaBarreraY1+1].equals("#")){
                        if(tablero[coordenadaBarreraX1+1][coordenadaBarreraY1+1].equals("#")){
                            System.out.println("\n"+"Ya existe una barrera en esta posicion"+"\n");
                            break;
                        }
                    }
                    System.out.println("Tu barrera se colocara verticalmente");
                    tablero[coordenadaBarreraX1-1][coordenadaBarreraY1+1]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1+1]="#";
                    tablero[coordenadaBarreraX1+1][coordenadaBarreraY1+1]="#";
                    historial=historial+"\n"+"El jugador 1 coloco una barrera vertical en la posicion: "+letraTablero+numeroTablero;
                    ImprimirTablero();
                    System.out.println("\n"+"El jugador 1 coloco una barrera vertical en la posicion: "+letraTablero+numeroTablero+"\n");
                    conteoBarrera1=conteoBarrera1-1;
                    System.out.println("\n"+"Barreras restantes: "+conteoBarrera1+"\n");
                }
                else{
                    System.out.println("Escribe un numero entre el 1 al 8");
                    break;
                }
                }
                else{
                    System.out.println("No tienes barreras restantes para colocar");
                    break;
                }

                break;


            case "D":
            if(conteoBarrera1>=1){
                    
                coordenadaBarreraY1=7;
                System.out.println("Escribe un numero del 1 al 8 para indicar la fila donde deseas la barrera ");
                numeroTablero=Integer.parseInt(lector.readLine());
                if(numeroTablero==9){
                    System.out.println("\n"+"No puedes colocar una barrera en esta posicion");
                    break;
                }
                coordenadaBarreraX1=numeroTablero*2;
                
                System.out.println("\n"+"¿como deseas colocar la barrera?"+"\n"+"1. Horizontalmente"+"\n"+"2. Verticalmente");
                decisionBarrera=Integer.parseInt(lector.readLine());
                if(decisionBarrera==1){
                    
                    if(tablero[coordenadaBarreraX1][coordenadaBarreraY1].equals("#")){
                        if(tablero[coordenadaBarreraX1][coordenadaBarreraY1+3].equals("#")){
                            System.out.println("\n"+"Ya existe una barrera en esta posicion"+"\n");
                            break;
                        }
                    }
                    System.out.println("Tu barrera se colocara horizontalmente"+"\n");
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1-1]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1+1]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1+2]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1+3]="#";
                    historial=historial+"\n"+"El jugador 1 coloco una barrera horizontal en la posicion: "+letraTablero+numeroTablero;
                    ImprimirTablero();
                    System.out.println("\n"+"El jugador 1 coloco una barrera horizontal en la posicion: "+letraTablero+numeroTablero+"\n");
                    conteoBarrera1=conteoBarrera1-1;
                    System.out.println("\n"+"Barreras restantes: "+conteoBarrera1+"\n");
                }
                else if(decisionBarrera==2){
                    if(tablero[coordenadaBarreraX1-1][coordenadaBarreraY1+1].equals("#")){
                        if(tablero[coordenadaBarreraX1+1][coordenadaBarreraY1+1].equals("#")){
                            System.out.println("\n"+"Ya existe una barrera en esta posicion"+"\n");
                            break;
                        }
                    }
                    System.out.println("Tu barrera se colocara verticalmente");
                    tablero[coordenadaBarreraX1-1][coordenadaBarreraY1+1]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1+1]="#";
                    tablero[coordenadaBarreraX1+1][coordenadaBarreraY1+1]="#";
                    historial=historial+"\n"+"El jugador 1 coloco una barrera vertical en la posicion: "+letraTablero+numeroTablero;
                    ImprimirTablero();
                    System.out.println("\n"+"El jugador 1 coloco una barrera vertical en la posicion: "+letraTablero+numeroTablero+"\n");
                    conteoBarrera1=conteoBarrera1-1;
                    System.out.println("\n"+"Barreras restantes: "+conteoBarrera1+"\n");
                }
                else{
                    System.out.println("Escribe un numero entre el 1 al 8");
                    break;
                }
                }
                else{
                    System.out.println("No tienes barreras restantes para colocar");
                    break;
                }
                break;


            case "E":
            if(conteoBarrera1>=1){
                    
                coordenadaBarreraY1=9;
                System.out.println("Escribe un numero del 1 al 8 para indicar la fila donde deseas la barrera ");
                numeroTablero=Integer.parseInt(lector.readLine());
                if(numeroTablero==9){
                    System.out.println("\n"+"No puedes colocar una barrera en esta posicion");
                    break;
                }
                coordenadaBarreraX1=numeroTablero*2;
                
                System.out.println("\n"+"¿como deseas colocar la barrera?"+"\n"+"1. Horizontalmente"+"\n"+"2. Verticalmente");
                decisionBarrera=Integer.parseInt(lector.readLine());
                if(decisionBarrera==1){
                    
                    if(tablero[coordenadaBarreraX1][coordenadaBarreraY1].equals("#")){
                        if(tablero[coordenadaBarreraX1][coordenadaBarreraY1+3].equals("#")){
                            System.out.println("\n"+"Ya existe una barrera en esta posicion"+"\n");
                            break;
                        }
                    }
                    System.out.println("Tu barrera se colocara horizontalmente"+"\n");
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1-1]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1+1]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1+2]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1+3]="#";
                    historial=historial+"\n"+"El jugador 1 coloco una barrera horizontal en la posicion: "+letraTablero+numeroTablero;
                    ImprimirTablero();
                    System.out.println("\n"+"El jugador 1 coloco una barrera horizontal en la posicion: "+letraTablero+numeroTablero+"\n");
                    conteoBarrera1=conteoBarrera1-1;
                    System.out.println("\n"+"Barreras restantes: "+conteoBarrera1+"\n");
                }
                else if(decisionBarrera==2){
                    if(tablero[coordenadaBarreraX1-1][coordenadaBarreraY1+1].equals("#")){
                        if(tablero[coordenadaBarreraX1+1][coordenadaBarreraY1+1].equals("#")){
                            System.out.println("\n"+"Ya existe una barrera en esta posicion"+"\n");
                            break;
                        }
                    }
                    System.out.println("Tu barrera se colocara verticalmente");
                    tablero[coordenadaBarreraX1-1][coordenadaBarreraY1+1]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1+1]="#";
                    tablero[coordenadaBarreraX1+1][coordenadaBarreraY1+1]="#";
                    historial=historial+"\n"+"El jugador 1 coloco una barrera vertical en la posicion: "+letraTablero+numeroTablero;
                    ImprimirTablero();
                    System.out.println("\n"+"El jugador 1 coloco una barrera vertical en la posicion: "+letraTablero+numeroTablero+"\n");
                    conteoBarrera1=conteoBarrera1-1;
                    System.out.println("\n"+"Barreras restantes: "+conteoBarrera1+"\n");
                }
                else{
                    System.out.println("Escribe un numero entre el 1 al 8");
                    break;
                }
                }
                else{
                    System.out.println("No tienes barreras restantes para colocar");
                    break;
                }


                break;


            case "F":
            if(conteoBarrera1>=1){
                    
                coordenadaBarreraY1=11;
                System.out.println("Escribe un numero del 1 al 8 para indicar la fila donde deseas la barrera ");
                numeroTablero=Integer.parseInt(lector.readLine());
                if(numeroTablero==9){
                    System.out.println("\n"+"No puedes colocar una barrera en esta posicion");
                    break;
                }
                coordenadaBarreraX1=numeroTablero*2;
                
                System.out.println("\n"+"¿como deseas colocar la barrera?"+"\n"+"1. Horizontalmente"+"\n"+"2. Verticalmente");
                decisionBarrera=Integer.parseInt(lector.readLine());
                if(decisionBarrera==1){
                    
                    if(tablero[coordenadaBarreraX1][coordenadaBarreraY1].equals("#")){
                        if(tablero[coordenadaBarreraX1][coordenadaBarreraY1+3].equals("#")){
                            System.out.println("\n"+"Ya existe una barrera en esta posicion"+"\n");
                            break;
                        }
                    }
                    System.out.println("Tu barrera se colocara horizontalmente"+"\n");
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1-1]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1+1]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1+2]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1+3]="#";
                    historial=historial+"\n"+"El jugador 1 coloco una barrera horizontal en la posicion: "+letraTablero+numeroTablero;
                    ImprimirTablero();
                    System.out.println("\n"+"El jugador 1 coloco una barrera horizontal en la posicion: "+letraTablero+numeroTablero+"\n");
                    conteoBarrera1=conteoBarrera1-1;
                    System.out.println("\n"+"Barreras restantes: "+conteoBarrera1+"\n");
                }
                else if(decisionBarrera==2){
                    if(tablero[coordenadaBarreraX1-1][coordenadaBarreraY1+1].equals("#")){
                        if(tablero[coordenadaBarreraX1+1][coordenadaBarreraY1+1].equals("#")){
                            System.out.println("\n"+"Ya existe una barrera en esta posicion"+"\n");
                            break;
                        }
                    }
                    System.out.println("Tu barrera se colocara verticalmente");
                    tablero[coordenadaBarreraX1-1][coordenadaBarreraY1+1]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1+1]="#";
                    tablero[coordenadaBarreraX1+1][coordenadaBarreraY1+1]="#";
                    historial=historial+"\n"+"El jugador 1 coloco una barrera vertical en la posicion: "+letraTablero+numeroTablero;
                    ImprimirTablero();
                    System.out.println("\n"+"El jugador 1 coloco una barrera vertical en la posicion: "+letraTablero+numeroTablero+"\n");
                    conteoBarrera1=conteoBarrera1-1;
                    System.out.println("\n"+"Barreras restantes: "+conteoBarrera1+"\n");
                }
                else{
                    System.out.println("Escribe un numero entre el 1 al 8");
                    break;
                }
                }
                else{
                    System.out.println("No tienes barreras restantes para colocar");
                    break;
                }
                break;


            case "G":
            if(conteoBarrera1>=1){
                    
                coordenadaBarreraY1=13;
                System.out.println("Escribe un numero del 1 al 8 para indicar la fila donde deseas la barrera ");
                numeroTablero=Integer.parseInt(lector.readLine());
                if(numeroTablero==9){
                    System.out.println("\n"+"No puedes colocar una barrera en esta posicion");
                    break;
                }
                coordenadaBarreraX1=numeroTablero*2;
                
                System.out.println("\n"+"¿como deseas colocar la barrera?"+"\n"+"1. Horizontalmente"+"\n"+"2. Verticalmente");
                decisionBarrera=Integer.parseInt(lector.readLine());
                if(decisionBarrera==1){
                    
                    if(tablero[coordenadaBarreraX1][coordenadaBarreraY1].equals("#")){
                        if(tablero[coordenadaBarreraX1][coordenadaBarreraY1+3].equals("#")){
                            System.out.println("\n"+"Ya existe una barrera en esta posicion"+"\n");
                            break;
                        }
                    }
                    System.out.println("Tu barrera se colocara horizontalmente"+"\n");
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1-1]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1+1]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1+2]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1+3]="#";
                    historial=historial+"\n"+"El jugador 1 coloco una barrera horizontal en la posicion: "+letraTablero+numeroTablero;
                    ImprimirTablero();
                    System.out.println("\n"+"El jugador 1 coloco una barrera horizontal en la posicion: "+letraTablero+numeroTablero+"\n");
                    conteoBarrera1=conteoBarrera1-1;
                    System.out.println("\n"+"Barreras restantes: "+conteoBarrera1+"\n");
                }
                else if(decisionBarrera==2){
                    if(tablero[coordenadaBarreraX1-1][coordenadaBarreraY1+1].equals("#")){
                        if(tablero[coordenadaBarreraX1+1][coordenadaBarreraY1+1].equals("#")){
                            System.out.println("\n"+"Ya existe una barrera en esta posicion"+"\n");
                            break;
                        }
                    }
                    System.out.println("Tu barrera se colocara verticalmente");
                    tablero[coordenadaBarreraX1-1][coordenadaBarreraY1+1]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1+1]="#";
                    tablero[coordenadaBarreraX1+1][coordenadaBarreraY1+1]="#";
                    historial=historial+"\n"+"El jugador 1 coloco una barrera vertical en la posicion: "+letraTablero+numeroTablero;
                    ImprimirTablero();
                    System.out.println("\n"+"El jugador 1 coloco una barrera vertical en la posicion: "+letraTablero+numeroTablero+"\n");
                    conteoBarrera1=conteoBarrera1-1;
                    System.out.println("\n"+"Barreras restantes: "+conteoBarrera1+"\n");
                }
                else{
                    System.out.println("Escribe un numero entre el 1 al 8");
                    break;
                }
                }
                else{
                    System.out.println("No tienes barreras restantes para colocar");
                    break;
                }
                break;


            case "H":
            if(conteoBarrera1>=1){
                    
                coordenadaBarreraY1=15;
                System.out.println("Escribe un numero del 1 al 8 para indicar la fila donde deseas la barrera ");
                numeroTablero=Integer.parseInt(lector.readLine());
                if(numeroTablero==9){
                    System.out.println("\n"+"No puedes colocar una barrera en esta posicion");
                    break;
                }
                coordenadaBarreraX1=numeroTablero*2;
                
                System.out.println("\n"+"¿como deseas colocar la barrera?"+"\n"+"1. Horizontalmente"+"\n"+"2. Verticalmente");
                decisionBarrera=Integer.parseInt(lector.readLine());
                if(decisionBarrera==1){
                    
                    if(tablero[coordenadaBarreraX1][coordenadaBarreraY1].equals("#")){
                        if(tablero[coordenadaBarreraX1][coordenadaBarreraY1+3].equals("#")){
                            System.out.println("\n"+"Ya existe una barrera en esta posicion"+"\n");
                            break;
                        }
                    }
                    System.out.println("Tu barrera se colocara horizontalmente"+"\n");
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1-1]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1+1]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1+2]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1+3]="#";
                    historial=historial+"\n"+"El jugador 1 coloco una barrera horizontal en la posicion: "+letraTablero+numeroTablero;
                    ImprimirTablero();
                    System.out.println("\n"+"El jugador 1 coloco una barrera horizontal en la posicion: "+letraTablero+numeroTablero+"\n");
                    conteoBarrera1=conteoBarrera1-1;
                    System.out.println("\n"+"Barreras restantes: "+conteoBarrera1+"\n");
                }
                else if(decisionBarrera==2){
                    if(tablero[coordenadaBarreraX1-1][coordenadaBarreraY1+1].equals("#")){
                        if(tablero[coordenadaBarreraX1+1][coordenadaBarreraY1+1].equals("#")){
                            System.out.println("\n"+"Ya existe una barrera en esta posicion"+"\n");
                            break;
                        }
                    }
                    System.out.println("Tu barrera se colocara verticalmente");
                    tablero[coordenadaBarreraX1-1][coordenadaBarreraY1+1]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1+1]="#";
                    tablero[coordenadaBarreraX1+1][coordenadaBarreraY1+1]="#";
                    historial=historial+"\n"+"El jugador 1 coloco una barrera vertical en la posicion: "+letraTablero+numeroTablero;
                    ImprimirTablero();
                    System.out.println("\n"+"El jugador 1 coloco una barrera vertical en la posicion: "+letraTablero+numeroTablero+"\n");
                    conteoBarrera1=conteoBarrera1-1;
                    System.out.println("\n"+"Barreras restantes: "+conteoBarrera1+"\n");
                }
                else{
                    System.out.println("Escribe un numero entre el 1 al 8");
                    break;
                }
                }
                else{
                    System.out.println("No tienes barreras restantes para colocar");
                    break;
                }
                break;


            case "I":
            if(conteoBarrera1>=1){
                    
                coordenadaBarreraY1=17;
                System.out.println("Escribe un numero del 1 al 8 para indicar la fila donde deseas la barrera ");
                numeroTablero=Integer.parseInt(lector.readLine());
                if(numeroTablero==9){
                    System.out.println("\n"+"No puedes colocar una barrera en esta posicion");
                    break;
                }
                coordenadaBarreraX1=numeroTablero*2;
                
                System.out.println("\n"+"¿como deseas colocar la barrera?"+"\n"+"1. Horizontalmente"+"\n"+"2. Verticalmente");
                decisionBarrera=Integer.parseInt(lector.readLine());
                if(decisionBarrera==1){
                    
                    if(tablero[coordenadaBarreraX1][coordenadaBarreraY1].equals("#")){
                        if(tablero[coordenadaBarreraX1][coordenadaBarreraY1-3].equals("#")){
                            System.out.println("\n"+"Ya existe una barrera en esta posicion"+"\n");
                            break;
                        }
                    }
                    System.out.println("Tu barrera se colocara horizontalmente"+"\n");
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1+1]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1-1]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1-2]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1-3]="#";
                    historial=historial+"\n"+"El jugador 1 coloco una barrera horizontal en la posicion: "+letraTablero+numeroTablero;
                    ImprimirTablero();
                    System.out.println("\n"+"El jugador 1 coloco una barrera horizontal en la posicion: "+letraTablero+numeroTablero+"\n");
                    conteoBarrera1=conteoBarrera1-1;
                    System.out.println("\n"+"Barreras restantes: "+conteoBarrera1+"\n");
                }
                else if(decisionBarrera==2){
                    if(tablero[coordenadaBarreraX1-1][coordenadaBarreraY1+1].equals("#")){
                        if(tablero[coordenadaBarreraX1+1][coordenadaBarreraY1+1].equals("#")){
                            System.out.println("\n"+"Ya existe una barrera en esta posicion"+"\n");
                            break;
                        }
                    }
                    System.out.println("Tu barrera se colocara verticalmente");
                    tablero[coordenadaBarreraX1+1][coordenadaBarreraY1-1]="#";
                    tablero[coordenadaBarreraX1][coordenadaBarreraY1-1]="#";
                    tablero[coordenadaBarreraX1-1][coordenadaBarreraY1-1]="#";
                    historial=historial+"\n"+"El jugador 1 coloco una barrera vertical en la posicion: "+letraTablero+numeroTablero;
                    ImprimirTablero();
                    System.out.println("\n"+"El jugador 1 coloco una barrera vertical en la posicion: "+letraTablero+numeroTablero+"\n");
                    conteoBarrera1=conteoBarrera1-1;
                    System.out.println("\n"+"Barreras restantes: "+conteoBarrera1+"\n");
                }
                else{
                    System.out.println("Escribe un numero entre el 1 al 8");
                    break;
                }
                }
                else{
                    System.out.println("No tienes barreras restantes para colocar");
                    break;
                }
                break;
        
            default:
            System.out.println("Escribe una de las letras que aparecen en el tablero de juego"+"\n"+"(toma en cuenta las mayusculas)"+"\n");
                break;
        }
    }
    public void BarreraJugador2()throws IOException{
        String letraTablero;
        int numeroTablero;
        int decisionBarrera;
        

        System.out.println("\n"+"Barreras restantes: "+conteoBarrera2+"\n");
        System.out.println("Escribe una letra de la A a la I para indicar la columna donde deseas la barrera");
        letraTablero=lector.readLine();
        switch (letraTablero) {
            case "A":
                if(conteoBarrera2>=1){
                    
                coordenadaBarreraY2=1;
                System.out.println("Escribe un numero del 1 al 8 para indicar la fila donde deseas la barrera ");
                numeroTablero=Integer.parseInt(lector.readLine());
                if(numeroTablero==9){
                    System.out.println("\n"+"No puedes colocar una barrera en esta posicion");
                    break;
                }
                coordenadaBarreraX2=numeroTablero*2;
                
                System.out.println("\n"+"¿como deseas colocar la barrera?"+"\n"+"1. Horizontalmente"+"\n"+"2. Verticalmente");
                decisionBarrera=Integer.parseInt(lector.readLine());
                if(decisionBarrera==1){
                    
                    if(tablero[coordenadaBarreraX2][coordenadaBarreraY2].equals("#")){
                        if(tablero[coordenadaBarreraX2][coordenadaBarreraY2+3].equals("#")){
                            System.out.println("\n"+"Ya existe una barrera en esta posicion"+"\n");
                            break;
                        }
                    }
                    System.out.println("Tu barrera se colocara horizontalmente"+"\n");
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2-1]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2+1]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2+2]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2+3]="#";
                    historial=historial+"\n"+"El jugador 2 coloco una barrera horizontal en la posicion: "+letraTablero+numeroTablero;
                    ImprimirTablero();
                    System.out.println("\n"+"El jugador 2 coloco una barrera horizontal en la posicion: "+letraTablero+numeroTablero+"\n");
                    conteoBarrera2=conteoBarrera2-1;
                    System.out.println("\n"+"Barreras restantes: "+conteoBarrera2+"\n");
                }
                else if(decisionBarrera==2){
                    if(tablero[coordenadaBarreraX2-1][coordenadaBarreraY2+1].equals("#")){
                        if(tablero[coordenadaBarreraX2+1][coordenadaBarreraY2+1].equals("#")){
                            System.out.println("\n"+"Ya existe una barrera en esta posicion"+"\n");
                            break;
                        }
                    }
                    System.out.println("Tu barrera se colocara verticalmente");
                    tablero[coordenadaBarreraX2-1][coordenadaBarreraY2+1]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2+1]="#";
                    tablero[coordenadaBarreraX2+1][coordenadaBarreraY2+1]="#";
                    historial=historial+"\n"+"El jugador 2 coloco una barrera vertical en la posicion: "+letraTablero+numeroTablero;
                    ImprimirTablero();
                    System.out.println("\n"+"El jugador 2 coloco una barrera vertical en la posicion: "+letraTablero+numeroTablero+"\n");
                    conteoBarrera2=conteoBarrera2-1;
                    System.out.println("\n"+"Barreras restantes: "+conteoBarrera2+"\n");
                }
                else{
                    System.out.println("Escribe un numero entre el 1 al 8");
                    break;
                }
                }
                else{
                    System.out.println("No tienes barreras restantes para colocar");
                    break;
                }
                
                
                break;
            
            case "B":

            if(conteoBarrera2>=1){
                    
                coordenadaBarreraY2=3;
                System.out.println("Escribe un numero del 1 al 8 para indicar la fila donde deseas la barrera ");
                numeroTablero=Integer.parseInt(lector.readLine());
                if(numeroTablero==9){
                    System.out.println("\n"+"No puedes colocar una barrera en esta posicion");
                    break;
                }
                coordenadaBarreraX2=numeroTablero*2;
                
                System.out.println("\n"+"¿como deseas colocar la barrera?"+"\n"+"1. Horizontalmente"+"\n"+"2. Verticalmente");
                decisionBarrera=Integer.parseInt(lector.readLine());
                if(decisionBarrera==1){
                    
                    if(tablero[coordenadaBarreraX2][coordenadaBarreraY2].equals("#")){
                        if(tablero[coordenadaBarreraX2][coordenadaBarreraY2+3].equals("#")){
                            System.out.println("\n"+"Ya existe una barrera en esta posicion"+"\n");
                            break;
                        }
                    }
                    System.out.println("Tu barrera se colocara horizontalmente"+"\n");
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2-1]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2+1]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2+2]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2+3]="#";
                    historial=historial+"\n"+"El jugador 2 coloco una barrera horizontal en la posicion: "+letraTablero+numeroTablero;
                    ImprimirTablero();
                    System.out.println("\n"+"El jugador 2 coloco una barrera horizontal en la posicion: "+letraTablero+numeroTablero+"\n");
                    conteoBarrera2=conteoBarrera2-1;
                    System.out.println("\n"+"Barreras restantes: "+conteoBarrera2+"\n");
                }
                else if(decisionBarrera==2){
                    if(tablero[coordenadaBarreraX2-1][coordenadaBarreraY2+1].equals("#")){
                        if(tablero[coordenadaBarreraX2+1][coordenadaBarreraY2+1].equals("#")){
                            System.out.println("\n"+"Ya existe una barrera en esta posicion"+"\n");
                            break;
                        }
                    }
                    System.out.println("Tu barrera se colocara verticalmente");
                    tablero[coordenadaBarreraX2-1][coordenadaBarreraY2+1]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2+1]="#";
                    tablero[coordenadaBarreraX2+1][coordenadaBarreraY2+1]="#";
                    historial=historial+"\n"+"El jugador 2 coloco una barrera vertical en la posicion: "+letraTablero+numeroTablero;
                    ImprimirTablero();
                    System.out.println("\n"+"El jugador 2 coloco una barrera vertical en la posicion: "+letraTablero+numeroTablero+"\n");
                    conteoBarrera2=conteoBarrera2-1;
                    System.out.println("\n"+"Barreras restantes: "+conteoBarrera2+"\n");
                }
                else{
                    System.out.println("Escribe un numero entre el 1 al 8");
                    break;
                }
                }
                else{
                    System.out.println("No tienes barreras restantes para colocar");
                    break;
                }
                break;


            case "C":
            if(conteoBarrera2>=1){
                    
                coordenadaBarreraY2=5;
                System.out.println("Escribe un numero del 1 al 8 para indicar la fila donde deseas la barrera ");
                numeroTablero=Integer.parseInt(lector.readLine());
                if(numeroTablero==9){
                    System.out.println("\n"+"No puedes colocar una barrera en esta posicion");
                    break;
                }
                coordenadaBarreraX2=numeroTablero*2;
                
                System.out.println("\n"+"¿como deseas colocar la barrera?"+"\n"+"1. Horizontalmente"+"\n"+"2. Verticalmente");
                decisionBarrera=Integer.parseInt(lector.readLine());
                if(decisionBarrera==1){
                    
                    if(tablero[coordenadaBarreraX2][coordenadaBarreraY2].equals("#")){
                        if(tablero[coordenadaBarreraX2][coordenadaBarreraY2+3].equals("#")){
                            System.out.println("\n"+"Ya existe una barrera en esta posicion"+"\n");
                            break;
                        }
                    }
                    System.out.println("Tu barrera se colocara horizontalmente"+"\n");
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2-1]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2+1]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2+2]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2+3]="#";
                    historial=historial+"\n"+"El jugador 2 coloco una barrera horizontal en la posicion: "+letraTablero+numeroTablero;
                    ImprimirTablero();
                    System.out.println("\n"+"El jugador 2 coloco una barrera horizontal en la posicion: "+letraTablero+numeroTablero+"\n");
                    conteoBarrera2=conteoBarrera2-1;
                    System.out.println("\n"+"Barreras restantes: "+conteoBarrera2+"\n");
                }
                else if(decisionBarrera==2){
                    if(tablero[coordenadaBarreraX2-1][coordenadaBarreraY2+1].equals("#")){
                        if(tablero[coordenadaBarreraX2+1][coordenadaBarreraY2+1].equals("#")){
                            System.out.println("\n"+"Ya existe una barrera en esta posicion"+"\n");
                            break;
                        }
                    }
                    System.out.println("Tu barrera se colocara verticalmente");
                    tablero[coordenadaBarreraX2-1][coordenadaBarreraY2+1]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2+1]="#";
                    tablero[coordenadaBarreraX2+1][coordenadaBarreraY2+1]="#";
                    historial=historial+"\n"+"El jugador 2 coloco una barrera vertical en la posicion: "+letraTablero+numeroTablero;
                    ImprimirTablero();
                    System.out.println("\n"+"El jugador 2 coloco una barrera vertical en la posicion: "+letraTablero+numeroTablero+"\n");
                    conteoBarrera2=conteoBarrera2-1;
                    System.out.println("\n"+"Barreras restantes: "+conteoBarrera2+"\n");
                }
                else{
                    System.out.println("Escribe un numero entre el 1 al 8");
                    break;
                }
                }
                else{
                    System.out.println("No tienes barreras restantes para colocar");
                    break;
                }

                break;


            case "D":
            if(conteoBarrera2>=1){
                    
                coordenadaBarreraY2=7;
                System.out.println("Escribe un numero del 1 al 8 para indicar la fila donde deseas la barrera ");
                numeroTablero=Integer.parseInt(lector.readLine());
                if(numeroTablero==9){
                    System.out.println("\n"+"No puedes colocar una barrera en esta posicion");
                    break;
                }
                coordenadaBarreraX2=numeroTablero*2;
                
                System.out.println("\n"+"¿como deseas colocar la barrera?"+"\n"+"1. Horizontalmente"+"\n"+"2. Verticalmente");
                decisionBarrera=Integer.parseInt(lector.readLine());
                if(decisionBarrera==1){
                    
                    if(tablero[coordenadaBarreraX2][coordenadaBarreraY2].equals("#")){
                        if(tablero[coordenadaBarreraX2][coordenadaBarreraY2+3].equals("#")){
                            System.out.println("\n"+"Ya existe una barrera en esta posicion"+"\n");
                            break;
                        }
                    }
                    System.out.println("Tu barrera se colocara horizontalmente"+"\n");
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2-1]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2+1]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2+2]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2+3]="#";
                    historial=historial+"\n"+"El jugador 2 coloco una barrera horizontal en la posicion: "+letraTablero+numeroTablero;
                    ImprimirTablero();
                    System.out.println("\n"+"El jugador 2 coloco una barrera horizontal en la posicion: "+letraTablero+numeroTablero+"\n");
                    conteoBarrera2=conteoBarrera2-1;
                    System.out.println("\n"+"Barreras restantes: "+conteoBarrera2+"\n");
                }
                else if(decisionBarrera==2){
                    if(tablero[coordenadaBarreraX2-1][coordenadaBarreraY2+1].equals("#")){
                        if(tablero[coordenadaBarreraX2+1][coordenadaBarreraY2+1].equals("#")){
                            System.out.println("\n"+"Ya existe una barrera en esta posicion"+"\n");
                            break;
                        }
                    }
                    System.out.println("Tu barrera se colocara verticalmente");
                    tablero[coordenadaBarreraX2-1][coordenadaBarreraY2+1]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2+1]="#";
                    tablero[coordenadaBarreraX2+1][coordenadaBarreraY2+1]="#";
                    historial=historial+"\n"+"El jugador 2 coloco una barrera vertical en la posicion: "+letraTablero+numeroTablero;
                    ImprimirTablero();
                    System.out.println("\n"+"El jugador 2 coloco una barrera vertical en la posicion: "+letraTablero+numeroTablero+"\n");
                    conteoBarrera2=conteoBarrera2-1;
                    System.out.println("\n"+"Barreras restantes: "+conteoBarrera2+"\n");
                }
                else{
                    System.out.println("Escribe un numero entre el 1 al 8");
                    break;
                }
                }
                else{
                    System.out.println("No tienes barreras restantes para colocar");
                    break;
                }
                break;


            case "E":
            if(conteoBarrera2>=1){
                    
                coordenadaBarreraY2=9;
                System.out.println("Escribe un numero del 1 al 8 para indicar la fila donde deseas la barrera ");
                numeroTablero=Integer.parseInt(lector.readLine());
                if(numeroTablero==9){
                    System.out.println("\n"+"No puedes colocar una barrera en esta posicion");
                    break;
                }
                coordenadaBarreraX2=numeroTablero*2;
                
                System.out.println("\n"+"¿como deseas colocar la barrera?"+"\n"+"1. Horizontalmente"+"\n"+"2. Verticalmente");
                decisionBarrera=Integer.parseInt(lector.readLine());
                if(decisionBarrera==1){
                    
                    if(tablero[coordenadaBarreraX2][coordenadaBarreraY2].equals("#")){
                        if(tablero[coordenadaBarreraX2][coordenadaBarreraY2+3].equals("#")){
                            System.out.println("\n"+"Ya existe una barrera en esta posicion"+"\n");
                            break;
                        }
                    }
                    System.out.println("Tu barrera se colocara horizontalmente"+"\n");
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2-1]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2+1]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2+2]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2+3]="#";
                    historial=historial+"\n"+"El jugador 2 coloco una barrera horizontal en la posicion: "+letraTablero+numeroTablero;
                    ImprimirTablero();
                    System.out.println("\n"+"El jugador 2 coloco una barrera horizontal en la posicion: "+letraTablero+numeroTablero+"\n");
                    conteoBarrera2=conteoBarrera2-1;
                    System.out.println("\n"+"Barreras restantes: "+conteoBarrera2+"\n");
                }
                else if(decisionBarrera==2){
                    if(tablero[coordenadaBarreraX2-1][coordenadaBarreraY2+1].equals("#")){
                        if(tablero[coordenadaBarreraX2+1][coordenadaBarreraY2+1].equals("#")){
                            System.out.println("\n"+"Ya existe una barrera en esta posicion"+"\n");
                            break;
                        }
                    }
                    System.out.println("Tu barrera se colocara verticalmente");
                    tablero[coordenadaBarreraX2-1][coordenadaBarreraY2+1]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2+1]="#";
                    tablero[coordenadaBarreraX2+1][coordenadaBarreraY2+1]="#";
                    historial=historial+"\n"+"El jugador 2 coloco una barrera vertical en la posicion: "+letraTablero+numeroTablero;
                    ImprimirTablero();
                    System.out.println("\n"+"El jugador 2 coloco una barrera vertical en la posicion: "+letraTablero+numeroTablero+"\n");
                    conteoBarrera2=conteoBarrera2-1;
                    System.out.println("\n"+"Barreras restantes: "+conteoBarrera2+"\n");
                }
                else{
                    System.out.println("Escribe un numero entre el 1 al 8");
                    break;
                }
                }
                else{
                    System.out.println("No tienes barreras restantes para colocar");
                    break;
                }


                break;


            case "F":
            if(conteoBarrera2>=1){
                    
                coordenadaBarreraY2=11;
                System.out.println("Escribe un numero del 1 al 8 para indicar la fila donde deseas la barrera ");
                numeroTablero=Integer.parseInt(lector.readLine());
                if(numeroTablero==9){
                    System.out.println("\n"+"No puedes colocar una barrera en esta posicion");
                    break;
                }
                coordenadaBarreraX2=numeroTablero*2;
                
                System.out.println("\n"+"¿como deseas colocar la barrera?"+"\n"+"1. Horizontalmente"+"\n"+"2. Verticalmente");
                decisionBarrera=Integer.parseInt(lector.readLine());
                if(decisionBarrera==1){
                    
                    if(tablero[coordenadaBarreraX2][coordenadaBarreraY2].equals("#")){
                        if(tablero[coordenadaBarreraX2][coordenadaBarreraY2+3].equals("#")){
                            System.out.println("\n"+"Ya existe una barrera en esta posicion"+"\n");
                            break;
                        }
                    }
                    System.out.println("Tu barrera se colocara horizontalmente"+"\n");
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2-1]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2+1]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2+2]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2+3]="#";
                    historial=historial+"\n"+"El jugador 2 coloco una barrera horizontal en la posicion: "+letraTablero+numeroTablero;
                    ImprimirTablero();
                    System.out.println("\n"+"El jugador 2 coloco una barrera horizontal en la posicion: "+letraTablero+numeroTablero+"\n");
                    conteoBarrera2=conteoBarrera2-1;
                    System.out.println("\n"+"Barreras restantes: "+conteoBarrera2+"\n");
                }
                else if(decisionBarrera==2){
                    if(tablero[coordenadaBarreraX2-1][coordenadaBarreraY2+1].equals("#")){
                        if(tablero[coordenadaBarreraX2+1][coordenadaBarreraY2+1].equals("#")){
                            System.out.println("\n"+"Ya existe una barrera en esta posicion"+"\n");
                            break;
                        }
                    }
                    System.out.println("Tu barrera se colocara verticalmente");
                    tablero[coordenadaBarreraX2-1][coordenadaBarreraY2+1]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2+1]="#";
                    tablero[coordenadaBarreraX2+1][coordenadaBarreraY2+1]="#";
                    historial=historial+"\n"+"El jugador 2 coloco una barrera vertical en la posicion: "+letraTablero+numeroTablero;
                    ImprimirTablero();
                    System.out.println("\n"+"El jugador 2 coloco una barrera vertical en la posicion: "+letraTablero+numeroTablero+"\n");
                    conteoBarrera2=conteoBarrera2-1;
                    System.out.println("\n"+"Barreras restantes: "+conteoBarrera2+"\n");
                }
                else{
                    System.out.println("Escribe un numero entre el 1 al 8");
                    break;
                }
                }
                else{
                    System.out.println("No tienes barreras restantes para colocar");
                    break;
                }
                break;


            case "G":
            if(conteoBarrera2>=1){
                    
                coordenadaBarreraY2=13;
                System.out.println("Escribe un numero del 1 al 8 para indicar la fila donde deseas la barrera ");
                numeroTablero=Integer.parseInt(lector.readLine());
                if(numeroTablero==9){
                    System.out.println("\n"+"No puedes colocar una barrera en esta posicion");
                    break;
                }
                coordenadaBarreraX2=numeroTablero*2;
                
                System.out.println("\n"+"¿como deseas colocar la barrera?"+"\n"+"1. Horizontalmente"+"\n"+"2. Verticalmente");
                decisionBarrera=Integer.parseInt(lector.readLine());
                if(decisionBarrera==1){
                    
                    if(tablero[coordenadaBarreraX2][coordenadaBarreraY2].equals("#")){
                        if(tablero[coordenadaBarreraX2][coordenadaBarreraY2+3].equals("#")){
                            System.out.println("\n"+"Ya existe una barrera en esta posicion"+"\n");
                            break;
                        }
                    }
                    System.out.println("Tu barrera se colocara horizontalmente"+"\n");
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2-1]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2+1]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2+2]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2+3]="#";
                    historial=historial+"\n"+"El jugador 2 coloco una barrera horizontal en la posicion: "+letraTablero+numeroTablero;
                    ImprimirTablero();
                    System.out.println("\n"+"El jugador 2 coloco una barrera horizontal en la posicion: "+letraTablero+numeroTablero+"\n");
                    conteoBarrera2=conteoBarrera2-1;
                    System.out.println("\n"+"Barreras restantes: "+conteoBarrera2+"\n");
                }
                else if(decisionBarrera==2){
                    if(tablero[coordenadaBarreraX2-1][coordenadaBarreraY2+1].equals("#")){
                        if(tablero[coordenadaBarreraX2+1][coordenadaBarreraY2+1].equals("#")){
                            System.out.println("\n"+"Ya existe una barrera en esta posicion"+"\n");
                            break;
                        }
                    }
                    System.out.println("Tu barrera se colocara verticalmente");
                    tablero[coordenadaBarreraX2-1][coordenadaBarreraY2+1]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2+1]="#";
                    tablero[coordenadaBarreraX2+1][coordenadaBarreraY2+1]="#";
                    historial=historial+"\n"+"El jugador 2 coloco una barrera vertical en la posicion: "+letraTablero+numeroTablero;
                    ImprimirTablero();
                    System.out.println("\n"+"El jugador 2 coloco una barrera vertical en la posicion: "+letraTablero+numeroTablero+"\n");
                    conteoBarrera2=conteoBarrera2-1;
                    System.out.println("\n"+"Barreras restantes: "+conteoBarrera2+"\n");
                }
                else{
                    System.out.println("Escribe un numero entre el 1 al 8");
                    break;
                }
                }
                else{
                    System.out.println("No tienes barreras restantes para colocar");
                    break;
                }
                break;


            case "H":
            if(conteoBarrera2>=1){
                    
                coordenadaBarreraY2=15;
                System.out.println("Escribe un numero del 1 al 8 para indicar la fila donde deseas la barrera ");
                numeroTablero=Integer.parseInt(lector.readLine());
                if(numeroTablero==9){
                    System.out.println("\n"+"No puedes colocar una barrera en esta posicion");
                    break;
                }
                coordenadaBarreraX2=numeroTablero*2;
                
                System.out.println("\n"+"¿como deseas colocar la barrera?"+"\n"+"1. Horizontalmente"+"\n"+"2. Verticalmente");
                decisionBarrera=Integer.parseInt(lector.readLine());
                if(decisionBarrera==1){
                    
                    if(tablero[coordenadaBarreraX2][coordenadaBarreraY2].equals("#")){
                        if(tablero[coordenadaBarreraX2][coordenadaBarreraY2+3].equals("#")){
                            System.out.println("\n"+"Ya existe una barrera en esta posicion"+"\n");
                            break;
                        }
                    }
                    System.out.println("Tu barrera se colocara horizontalmente"+"\n");
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2-1]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2+1]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2+2]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2+3]="#";
                    historial=historial+"\n"+"El jugador 2 coloco una barrera horizontal en la posicion: "+letraTablero+numeroTablero;
                    ImprimirTablero();
                    System.out.println("\n"+"El jugador 2 coloco una barrera horizontal en la posicion: "+letraTablero+numeroTablero+"\n");
                    conteoBarrera2=conteoBarrera2-1;
                    System.out.println("\n"+"Barreras restantes: "+conteoBarrera2+"\n");
                }
                else if(decisionBarrera==2){
                    if(tablero[coordenadaBarreraX2-1][coordenadaBarreraY2+1].equals("#")){
                        if(tablero[coordenadaBarreraX2+1][coordenadaBarreraY2+1].equals("#")){
                            System.out.println("\n"+"Ya existe una barrera en esta posicion"+"\n");
                            break;
                        }
                    }
                    System.out.println("Tu barrera se colocara verticalmente");
                    tablero[coordenadaBarreraX2-1][coordenadaBarreraY2+1]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2+1]="#";
                    tablero[coordenadaBarreraX2+1][coordenadaBarreraY2+1]="#";
                    historial=historial+"\n"+"El jugador 2 coloco una barrera vertical en la posicion: "+letraTablero+numeroTablero;
                    ImprimirTablero();
                    System.out.println("\n"+"El jugador 2 coloco una barrera vertical en la posicion: "+letraTablero+numeroTablero+"\n");
                    conteoBarrera2=conteoBarrera2-1;
                    System.out.println("\n"+"Barreras restantes: "+conteoBarrera2+"\n");
                }
                else{
                    System.out.println("Escribe un numero entre el 1 al 8");
                    break;
                }
                }
                else{
                    System.out.println("No tienes barreras restantes para colocar");
                    break;
                }
                break;


            case "I":
            if(conteoBarrera2>=1){
                    
                coordenadaBarreraY2=17;
                System.out.println("Escribe un numero del 1 al 8 para indicar la fila donde deseas la barrera ");
                numeroTablero=Integer.parseInt(lector.readLine());
                if(numeroTablero==9){
                    System.out.println("\n"+"No puedes colocar una barrera en esta posicion");
                    break;
                }
                coordenadaBarreraX2=numeroTablero*2;
                
                System.out.println("\n"+"¿como deseas colocar la barrera?"+"\n"+"1. Horizontalmente"+"\n"+"2. Verticalmente");
                decisionBarrera=Integer.parseInt(lector.readLine());
                if(decisionBarrera==1){
                    
                    if(tablero[coordenadaBarreraX2][coordenadaBarreraY2].equals("#")){
                        if(tablero[coordenadaBarreraX2][coordenadaBarreraY2-3].equals("#")){
                            System.out.println("\n"+"Ya existe una barrera en esta posicion"+"\n");
                            break;
                        }
                    }
                    System.out.println("Tu barrera se colocara horizontalmente"+"\n");
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2+1]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2-1]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2-2]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2-3]="#";
                    historial=historial+"\n"+"El jugador 2 coloco una barrera horizontal en la posicion: "+letraTablero+numeroTablero;
                    ImprimirTablero();
                    System.out.println("\n"+"El jugador 2 coloco una barrera horizontal en la posicion: "+letraTablero+numeroTablero+"\n");
                    conteoBarrera2=conteoBarrera2-1;
                    System.out.println("\n"+"Barreras restantes: "+conteoBarrera2+"\n");
                }
                else if(decisionBarrera==2){
                    if(tablero[coordenadaBarreraX2-1][coordenadaBarreraY2+1].equals("#")){
                        if(tablero[coordenadaBarreraX2+1][coordenadaBarreraY2+1].equals("#")){
                            System.out.println("\n"+"Ya existe una barrera en esta posicion"+"\n");
                            break;
                        }
                    }
                    System.out.println("Tu barrera se colocara verticalmente");
                    tablero[coordenadaBarreraX2+1][coordenadaBarreraY2-1]="#";
                    tablero[coordenadaBarreraX2][coordenadaBarreraY2-1]="#";
                    tablero[coordenadaBarreraX2-1][coordenadaBarreraY2-1]="#";
                    historial=historial+"\n"+"El jugador 2 coloco una barrera vertical en la posicion: "+letraTablero+numeroTablero;
                    ImprimirTablero();
                    System.out.println("\n"+"El jugador 2 coloco una barrera vertical en la posicion: "+letraTablero+numeroTablero+"\n");
                    conteoBarrera2=conteoBarrera2-1;
                    System.out.println("\n"+"Barreras restantes: "+conteoBarrera2+"\n");
                }
                else{
                    System.out.println("Escribe un numero entre el 1 al 8");
                    break;
                }
                }
                else{
                    System.out.println("No tienes barreras restantes para colocar");
                    break;
                }
                break;
        
            default:
            System.out.println("Escribe una de las letras que aparecen en el tablero de juego"+"\n"+"(toma en cuenta las mayusculas)"+"\n");
                break;
        }
}
    
}
    
    


    

