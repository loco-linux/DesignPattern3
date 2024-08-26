package Model;

import Controller.RopaComponenteConcreto;


public class DiscountManager { // PATRÓN DE DISEÑO S I N G L E T O N
    
    private static DiscountManager descuento;
    
    private DiscountManager(){
    }
    
    public static DiscountManager obtenerInstancia() {
        
        if(descuento == null) {
        descuento = new DiscountManager();
        }
        
        return descuento;
    }
    
    public void realizarDescuento(int total){
    int descuentoAplicado = 10000;
    total = total - descuentoAplicado;
        System.out.println("Descuento exclusivo de $10.000 pesos en el total de tu boleta aplicado con exito.");
        System.out.println("Tu nuevo Total a Pagar es de: $ "+total);
        System.out.println("Procesando... Por favor espere unos segundos.");
        RopaComponenteConcreto.wait(3);            
        System.out.println("Pagado con exito");
        System.out.println("¡Gracias por preferirnos!");
    }
}
