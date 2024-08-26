package Controller;

import Model.RopaDecorator;
import Model.IComponent;
import Model.ICommand;

public class RopaTicketDeCambioDecorator extends RopaDecorator implements ICommand{
    
    RopaComponenteConcreto ropa;
    
    public RopaTicketDeCambioDecorator(IComponent componente) {
        super(componente);
    }
    
    public RopaTicketDeCambioDecorator(){
    }

    @Override
    public void extra(int total) {
        System.out.println("------------- === TICKET DE CAMBIO === -------------");
        System.out.println("Este es el ticket de cambio");
        System.out.println("Es valido en la sucursal la cual el producto fue comprado");
        System.out.println("Y es valido para cambiar o devolver el producto");
        System.out.println("---------------------------------------");
        System.out.println("Fin Ticket de Cambio");
        System.out.println("---------------------------------------");
        System.out.println("");
        ejecutar(0);
    }

    @Override
    public void descuento(int total) {
        
    }

    @Override
    public void ejecutar(int total) { // Patrón de diseño C O M M A N D 
        if(ropa == null){
        ropa = new RopaComponenteConcreto();
        ropa.saludoDespedida();
        }
    }
    
}
