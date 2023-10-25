package Combate;
import java.util.Scanner;


public class Elegir_boss {
    public static void main(String[] args) {
        //importo configuracion
        Configuracion configuracion = new Configuracion();
        //importo Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe Dato obtenido en mini-juego [Nombre_boss]");
        String entrada_usuario_boss = sc.nextLine().toLowerCase();//guardo la variable del nombre

        //**GESTIONO QUE LA ENTRADA SEA 
        //*MACHEA CON LAS OPCIONES
        /**
         * *Pastillas --> Jose
        **Diario --> Lidia
        **Carpeta de Noelia --> Paco
        **Fotografía --> Guilla
        **Estuche --> David
         */

        //Asignacion\
        boolean match = false;
    while(!match){
        switch(entrada_usuario_boss){
            case "carpeta de noelia":
                entrada_usuario_boss = configuracion.PROFESORES_NOMBRE_BOSS[0];
                match = true;
                break;
                case "fotografia":
                entrada_usuario_boss = configuracion.PROFESORES_NOMBRE_BOSS[1];
                match = true;
                break;
                case "diario":
                entrada_usuario_boss = configuracion.PROFESORES_NOMBRE_BOSS[2];
                match = true;
                break;
                case "estuche":
                entrada_usuario_boss = configuracion.PROFESORES_NOMBRE_BOSS[3];
                match = true;
                break;
                case "pastillas":
                entrada_usuario_boss = configuracion.PROFESORES_NOMBRE_BOSS[4];
                match = true;
                break;
            default:
                System.out.println("Intentalo de nuevo: ");
                entrada_usuario_boss = sc.nextLine().toLowerCase();//guardo la variable del nombre
        }

    }

        System.out.println("tu boss es ==> " + entrada_usuario_boss);

    

        

        
        
        
        


        sc.close();
        
    }
}
