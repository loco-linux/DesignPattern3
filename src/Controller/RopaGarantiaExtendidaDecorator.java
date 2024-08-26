package Controller;

import Model.RopaDecorator;
import java.util.Scanner;
import Model.IComponent;
import View.Option;

public class RopaGarantiaExtendidaDecorator extends RopaDecorator {

    public RopaGarantiaExtendidaDecorator(IComponent componente) {
        super(componente);
    }
    
    public RopaGarantiaExtendidaDecorator(){
    }

    @Override
    public void extra(int total) {
        Scanner teclado = new Scanner(System.in);
        int costeGarantia = 20000;
        System.out.println("----------------------- === GARANTIA EXTENDIDA === -----------------------");
        System.out.println("Desea usted aplicar una Garantia Extendida a su(s) producto(s)? [1] Si | [2] No");
        //int opcionUsuario = teclado.nextInt();
        //teclado.nextLine();
        int opcionUsuario = Option.OUsuario(1, 2, 0);        
        if(opcionUsuario == 1){
            System.out.println("""
                                Usted ha seleccionado la opcion de Garantia Extendida
                                En vestuario, por $20.000 adicionales al total de su boleta, usted obtendra la garantia extra
                                Esta garantia ofrece 180 dias (6 meses) de cobertura extendida, la cual cubrira:
                                1.- Cualquier daño producto del lavado e inclusive de cualquier tipo de indole
                                2.- Robo de la prenda (Efectivo con la respectiva denuncia policial)""");
            System.out.println("El nuevo monto de su boleta es: $ "+(total+costeGarantia) +"\n");
        }
        else{
            System.out.println("Usted ha escogido NO contratar la Garantia Extendida.");
            System.out.println("");
        }
        
    }
    
    @Override
    public void descuento(int total) {
        
    }

    
    
}
