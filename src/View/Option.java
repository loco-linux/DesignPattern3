package View;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Option {
    
    private static final Scanner teclado = new Scanner(System.in);
    
    public static int OUsuario(int min, int max, int xDefecto){
        try{
        int opcion = teclado.nextInt();
        if(opcion >= min && opcion <= max){
            return opcion;
        }
        }catch(InputMismatchException e){
            teclado.nextLine();
            return xDefecto;
        }
        return xDefecto;
    }
    
    /*
    public static int OUsuario(int max, int xDefecto){
        teclado.reset();
        String entrada = teclado.nextLine();
        if(entrada.trim().length()>1 || entrada.isEmpty()){
            return xDefecto;
        }else if(entrada.trim().length() == 1){
            try{
                int opcion = Integer.parseInt(entrada);
                if(opcion >= 1 && opcion <= max){
                    return opcion;
                }
            }catch(NumberFormatException io){
                return xDefecto;
            }
        }               
        return xDefecto;
    }
*/
}
