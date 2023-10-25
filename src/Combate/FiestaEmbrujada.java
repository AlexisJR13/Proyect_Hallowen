package Combate;

import java.util.Scanner;

public class FiestaEmbrujada {
    //Declaras el boobleano de manera global para utilizarla en el metodo
    // De esta manera puedes utilizarle en el main y en las clases
    public static boolean encerrado = true;
    public static String eleccion;
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Bienvenidos a la Fiesta de la Casa Embrujada!");
        System.out.println("¿Te gustaría explorar la casa (1) o escapar de ella (2)?");
        /*Utilizas un int, esto hace que si el usuario 
        * le da por meter un caracter java Crashe, 
        * por eso es mejor hacer un Swicht y recojer la variable en un String
        * FIJATE
        */
        eleccion = sc.nextLine();


        //Si la eleccion es diferente a 1 o 2 entras al bucle
        //no saldras hasta que no escribas una eleccion válida
        while(!eleccion.equals("1") && !eleccion.equals("2")){
            //mensaje si no escribe un 1 o un 2 de esta manera nunca va a dar error
            System.out.println("Elección no válida. La casa ha hablado.");
            System.out.println("¿Te gustaría explorar la casa (1) o escapar de ella (2)?");
            eleccion = sc.nextLine();    
        }

        switch(eleccion){
            case "1":
            explorarCasaEmbrujada(sc);
            break;
            
            case "2":
            escaparDeLaCasa();
            break;
        }
        
        /*if (eleccion == 1) {
            explorarCasaEmbrujada();
        } else if (eleccion == 2) {
            escaparDeLaCasa();
        } else {
            System.out.println("Elección no válida. La casa ha hablado.");
        }*/
        
        
        /*El while lo estas declarando al revez, te explico debes fijarte que lo que tienes en
        el while sea lo contrario del valor que tiene antes de entrar en el bucle
        porque si tiene el mismo valor nunca entra al bucle se lo salta, quiere decir
        tu declaras el bulean true , cuando pasa por la funcion escaparDeLaCasa()
        te devuelve false, si pones while(encontrado==false) tiene el mismo valor y no entras al bucle,
        porque en el while pones la condicion de salida , es decir , pones que la condicion de salida
        sea que el bolean sea true, porque llegas en false, [en este caso pones !encerrado porque es el contrario del valor que tenga]
        y luego cuando quieras salir del bucle pones el boolean en TRUE
        
        ACUERDATE --> WHILE(CONDICION DE SALIDA DEL BUCLE)
        
        [Te lo he intentado explicar lo mejor posible si no lo entiendes me dices y te explico en clase]
        */

        while (!encerrado) {
            System.out.println("Estás atrapado en la casa. Debes resolver el siguiente acertijo para escapar:");
            System.out.println("Tiene llaves pero no puede abrir cerraduras. Tiene espacio pero no tiene peso. ¿Qué es?");
            
            
            System.out.println("Tu respuesta: ");
            String respuesta = sc.nextLine();
            
            if (respuesta.equalsIgnoreCase("teclado")) {
                System.out.println("¡Correcto! Has resuelto el acertijo y puedes escapar de la casa.");
                encerrado = true; // tenias la condicion en false, pero llegabas al bucle en false por eso no entraba.
                System.out.println("!Enhorabuena, has logrado escapar¡");
            } else {
                System.out.println("Respuesta incorrecta. El misterio de la casa persiste...");
            }
        }
        
        // Cuando los personajes resuelvan el acertijo, el bucle se romperá y podrán escapar de la casa embrujada.
        System.out.println("¡Has escapado con éxito de la Casa Embrujada! ¡Felicitaciones!");
        sc.close();
    }
    
    public static void someterseAlFantasma() {
        System.out.println("Has elegido someterte al fantasma. Prometes guardar su secreto, pero eso significa que nunca podrás salir de la casa.");
        System.out.println("El fantasma sonríe y desaparece en las sombras, dejándote atrapado en la casa embrujada por toda la eternidad...");
    }
    
    public static boolean escaparDeLaCasa() {
        //imprime esto
        System.out.println("Corres hacia la puerta principal, pero está bloqueada.");
        System.out.println("Una risa malévola te envuelve mientras te das cuenta de que no hay escape.");
        System.out.println("Sin embargo, encuentras una nota que dice: 'Responde al acertijo para desbloquear la puerta'.");
        //devuelve el boolean que quieres falso
        return encerrado=false;
    }

    public static void explorarCasaEmbrujada(Scanner sc) {
        System.out.println("Mientras exploras la casa, te encuentras con una puerta que se cierra detrás de ti.");
        System.out.println("Ruidos misteriosos y sombras danzan a tu alrededor. Comienzas a sentir una presencia oscura.");
        System.out.println("De repente, una voz susurra desde las sombras: 'Nunca debiste entrar aquí.'");
        
        System.out.println("¿Deseas seguir explorando (1) o intentar encontrar una salida (2)?");
        eleccion = sc.nextLine();
        
        while(!eleccion.equals("1") && !eleccion.equals("2")){
            
            //mensaje si no escribe un 1 o un 2 de esta manera nunca va a dar error
            System.out.println("El tiempo se agota. Debes elegir.");
            System.out.println("¿Deseas seguir explorando (1) o intentar encontrar una salida (2)?");
            eleccion = sc.nextLine();    
        }
        
        switch(eleccion){
            case "1":
            explorarMas(sc);
            break;
            case "2":
            escaparDeLaCasa();
            break;
        }
        
       /*
        if (eleccion == 1) {
            explorarMas();
        } else if (eleccion == 2) {
            escaparDeLaCasa();
        } else {
            System.out.println("El tiempo se agota. Debes elegir.");
        }*/
      
    }

    public static void explorarMas(Scanner sc) {

        System.out.println("Decides continuar explorando la casa en busca de respuestas.");
        System.out.println("A medida que avanzas, encuentras habitaciones con muebles cubiertos por sábanas polvorientas y retratos de personas desconocidas.");
        System.out.println("En una de las habitaciones, ves un antiguo diario abierto sobre una mesa. Comienzas a leer...");

        System.out.println("De repente, una figura pálida y fantasmal aparece frente a ti.");
        System.out.println("Sus ojos vacíos y su voz susurrante te llenan de terror. Te ordena que nunca reveles lo que has descubierto.");

        System.out.println("¿Te someterás (1) o intentarás escapar (2)?");
        eleccion = sc.nextLine();
        
        while(!eleccion.equals("1") && !eleccion.equals("2")){

            //mensaje si no escribe un 1 o un 2 de esta manera nunca va a dar error
            System.out.println("El tiempo se agota. Debes elegir.");
            System.out.println("¿Te someterás (1) o intentarás escapar (2)?");
            eleccion = sc.nextLine();    
        }
        
        switch(eleccion){
            case "1":
            someterseAlFantasma();
            break;
            case "2":
            escaparDeLaCasa();
            break;}
            /* 
            if (eleccion == 1) {
                someterseAlFantasma();
            } else if (eleccion == 2) {
                escaparDeLaCasa();
            } else {
                System.out.println("El tiempo se agota. Debes elegir.");
            }*/
            
    }
}
