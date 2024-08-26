package View;

import java.util.Scanner;


public class Option {
    
    private static final Scanner teclado = new Scanner(System.in);
    
    public static int OUsuario(int min, int max, int xdefecto){
        try{
        int opcion = teclado.nextInt();
        if(opcion >= min && opcion <= max){
            return opcion;
        }
        }catch(Exception e){
            System.out.println("[ERROR] No disponible.");
            teclado.nextLine();
        }
        return xdefecto;
    }
}
