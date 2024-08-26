package Controller;

import java.util.ArrayList;
import Model.IComponent;
import Model.ICommand;
import View.View;
import View.Option;


public class RopaComponenteConcreto implements IComponent, ICommand{
    
    private String marcaRopa;
    private String modeloRopa;
    private String tipoRopa;
    private int precioPrenda;
    private RopaComponenteConcreto ropaObjeto;
    int opcionUsuario;

    
    public void vender(){
        ArrayList<Integer> totalYRetornoCompra = new ArrayList<>();
        ArrayList<RopaComponenteConcreto> ropa = new ArrayList<>();
        
        do{
            View.Menu_principal();
            opcionUsuario = Option.OUsuario(1, 9, 10);
        switch(opcionUsuario) {
            case 1 -> {
                View.MenuCamisetas_H();
                int opcionUsuarioCVH = Option.OUsuario(1, 9, 10);
                switch(opcionUsuarioCVH) {
                    case 1 -> {                        
                        ropaObjeto = new RopaComponenteConcreto(
                            "Camiseta de Vestir HOMBRE",
                           "Tommy Hilfiger",
                             "Blanca Talla S",                       
                          55990
                        );                        
                        totalYRetornoCompra.add(getPrecioPrenda());
                        System.out.println("Usted esta llevando: ");
                        System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                        System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                        System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                        ropa.add(ropaObjeto);
                    }
                    
                    case 2 -> {                     
                        ropaObjeto = new RopaComponenteConcreto(
                            "Camiseta de Vestir HOMBRE",
                           "Tommy Hilfiger",
                             "Blanca Talla M",
                          55990
                        );                                              
                        totalYRetornoCompra.add(getPrecioPrenda());
                        System.out.println("Usted esta llevando: ");
                        System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                        System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                        System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                        ropa.add(ropaObjeto);
                    }
                    
                    case 3 -> {                      
                        ropaObjeto = new RopaComponenteConcreto(
                            "Camiseta de Vestir HOMBRE",
                           "Tommy Hilfiger",
                             "Blanca Talla L",
                          55990
                        );                        
                        totalYRetornoCompra.add(getPrecioPrenda());
                        System.out.println("Usted esta llevando: ");
                        System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                        System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                        System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                        ropa.add(ropaObjeto);
                    }
                    
                    case 4 -> {                      
                        ropaObjeto = new RopaComponenteConcreto(
                            "Camiseta de Vestir HOMBRE",
                           "Tommy Hilfiger",
                             "Celeste Talla S",
                          55990
                        );                        
                        totalYRetornoCompra.add(getPrecioPrenda());
                        System.out.println("Usted esta llevando: ");
                        System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                        System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                        System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                        ropa.add(ropaObjeto);
                    }
                    
                    case 5 -> {                      
                        ropaObjeto = new RopaComponenteConcreto(
                            "Camiseta de Vestir HOMBRE",
                           "Tommy Hilfiger",
                             "Celeste Talla M",
                          55990
                        );                        
                        totalYRetornoCompra.add(getPrecioPrenda());
                        System.out.println("Usted esta llevando: ");
                        System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                        System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                        System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                        ropa.add(ropaObjeto);
                    }
                    
                    case 6 -> {                      
                        ropaObjeto = new RopaComponenteConcreto(
                            "Camiseta de Vestir HOMBRE",
                           "Tommy Hilfiger",
                             "Celeste Talla L",
                          55990
                        );                        
                        totalYRetornoCompra.add(getPrecioPrenda());
                        System.out.println("Usted esta llevando: ");
                        System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                        System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                        System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                        ropa.add(ropaObjeto);
                    }
                    
                    case 7 -> {                     
                        ropaObjeto = new RopaComponenteConcreto(
                            "Camiseta de Vestir HOMBRE",
                           "Tommy Hilfiger",
                             "Rosada Talla S",
                          55990
                        );                        
                        totalYRetornoCompra.add(getPrecioPrenda());
                        System.out.println("Usted esta llevando: ");
                        System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                        System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                        System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                        ropa.add(ropaObjeto);
                    }
                    
                    case 8 -> {
                        ropaObjeto = new RopaComponenteConcreto(
                            "Camiseta de Vestir HOMBRE",
                           "Tommy Hilfiger",
                             "Rosada Talla M",
                          55990
                        );                        
                        totalYRetornoCompra.add(getPrecioPrenda());
                        System.out.println("Usted esta llevando: ");
                        System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                        System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                        System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                        ropa.add(ropaObjeto);
                    }
                    
                    case 9 -> {                       
                        ropaObjeto = new RopaComponenteConcreto(
                            "Camiseta de Vestir HOMBRE",
                           "Tommy Hilfiger",
                             "Rosada Talla L",
                          55990
                        );                        
                        totalYRetornoCompra.add(getPrecioPrenda());
                        System.out.println("Usted esta llevando: ");
                        System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                        System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                        System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                        ropa.add(ropaObjeto);
                    }
                    default -> System.out.println("[ERROR] No disponible...");                        
                }
                }
                
            case 2 -> { 
                View.MenuCamisetas_M();
                int opcionUsuarioCVM = Option.OUsuario(1,9,10);
                switch(opcionUsuarioCVM) {
                    case 1 -> {                      
                        ropaObjeto = new RopaComponenteConcreto(
                            "Camiseta de Vestir MUJER",
                           "Tommy Hilfiger",
                             "Blanca Talla S",
                          55990
                        );                        
                        totalYRetornoCompra.add(getPrecioPrenda());
                        System.out.println("Usted esta llevando: ");
                        System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                        System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                        System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                        ropa.add(ropaObjeto);
                    }
                    
                    case 2 -> {                       
                        ropaObjeto = new RopaComponenteConcreto(
                            "Camiseta de Vestir MUJER",
                           "Tommy Hilfiger",
                             "Blanca Talla M",
                          55990
                        );                        
                        totalYRetornoCompra.add(getPrecioPrenda());
                        System.out.println("Usted esta llevando: ");
                        System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                        System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                        System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                        ropa.add(ropaObjeto);
                    }
                    
                    case 3 -> {                       
                        ropaObjeto = new RopaComponenteConcreto(
                            "Camiseta de Vestir MUJER",
                           "Tommy Hilfiger",
                             "Blanca Talla L",
                          55990
                        );                        
                        totalYRetornoCompra.add(getPrecioPrenda());
                        System.out.println("Usted esta llevando: ");
                        System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                        System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                        System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                        ropa.add(ropaObjeto);
                    }
                    
                    case 4 -> {                      
                        ropaObjeto = new RopaComponenteConcreto(
                            "Camiseta de Vestir MUJER",
                           "Tommy Hilfiger",
                             "Celeste Talla S",
                          55990
                        );                        
                        totalYRetornoCompra.add(getPrecioPrenda());
                        System.out.println("Usted esta llevando: ");
                        System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                        System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                        System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                        ropa.add(ropaObjeto);
                    }
                    
                    case 5 -> {                    
                        ropaObjeto = new RopaComponenteConcreto(
                            "Camiseta de Vestir MUJER",
                           "Tommy Hilfiger",
                             "Celeste Talla M",
                          55990
                        );                        
                        totalYRetornoCompra.add(getPrecioPrenda());
                        System.out.println("Usted esta llevando: ");
                        System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                        System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                        System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                        ropa.add(ropaObjeto);
                    }
                    
                    case 6 -> {                       
                        ropaObjeto = new RopaComponenteConcreto(
                            "Camiseta de Vestir MUJER",
                           "Tommy Hilfiger",
                             "Celeste Talla L",
                          55990
                        );                        
                        totalYRetornoCompra.add(getPrecioPrenda());
                        System.out.println("Usted esta llevando: ");
                        System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                        System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                        System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                        ropa.add(ropaObjeto);
                    }
                    
                    case 7 -> {
                        ropaObjeto = new RopaComponenteConcreto(
                            "Camiseta de Vestir MUJER",
                           "Tommy Hilfiger",
                             "Rosada Talla S",
                          55990
                        );                        
                        totalYRetornoCompra.add(getPrecioPrenda());
                        System.out.println("Usted esta llevando: ");
                        System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                        System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                        System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                        ropa.add(ropaObjeto);
                    }
                    
                    case 8 -> {                       
                        ropaObjeto = new RopaComponenteConcreto(
                            "Camiseta de Vestir MUJER",
                           "Tommy Hilfiger",
                             "Rosada Talla M",
                          55990
                        );                        
                        totalYRetornoCompra.add(getPrecioPrenda());
                        System.out.println("Usted esta llevando: ");
                        System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                        System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                        System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                        ropa.add(ropaObjeto);
                    }
                    
                    case 9 -> {                      
                        ropaObjeto = new RopaComponenteConcreto(
                            "Camiseta de Vestir MUJER",
                           "Tommy Hilfiger",
                             "Rosada Talla L",
                          55990
                        );                        
                        totalYRetornoCompra.add(getPrecioPrenda());
                        System.out.println("Usted esta llevando: ");
                        System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                        System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                        System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                        ropa.add(ropaObjeto);
                    }
                }
                }
                
            case 3 -> {
                View.MenuPantalon_H();
                int opcionUsuarioPVH = Option.OUsuario(1,3,4);
                switch(opcionUsuarioPVH) {
                    case 1 -> {                     
                        ropaObjeto = new RopaComponenteConcreto(
                            "Pantalon de Vestir HOMBRE",
                           "Tommy Hilfiger",
                             "Azul Marino Talla 46",
                          60990
                        );                        
                        totalYRetornoCompra.add(getPrecioPrenda());
                        System.out.println("Usted esta llevando: ");
                        System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                        System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                        System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                        ropa.add(ropaObjeto);
                    }
                    
                    case 2 -> {                       
                        ropaObjeto = new RopaComponenteConcreto(
                            "Pantalon de Vestir HOMBRE",
                           "Tommy Hilfiger",
                             "Azul Marino Talla 48",
                          60990
                        );                        
                        totalYRetornoCompra.add(getPrecioPrenda());
                        System.out.println("Usted esta llevando: ");
                        System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                        System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                        System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                        ropa.add(ropaObjeto);
                    }
                    
                    case 3 -> {                      
                        ropaObjeto = new RopaComponenteConcreto(
                            "Pantalon de Vestir HOMBRE",
                           "Tommy Hilfiger",
                             "Azul Marino Talla 50",
                          60990
                        );                        
                        totalYRetornoCompra.add(getPrecioPrenda());
                        System.out.println("Usted esta llevando: ");
                        System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                        System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                        System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                        ropa.add(ropaObjeto);
                    }
                }
                }
               
            case 4 -> {
                View.MenuPantalon_M();
                int opcionUsuarioPVM = Option.OUsuario(1,3,4);
                switch(opcionUsuarioPVM) {
                    case 1 -> {                         
                        ropaObjeto = new RopaComponenteConcreto(
                            "Pantalon de Vestir MUJER",
                           "Tommy Hilfiger",
                             "Beige Talla 42",
                          60990
                        );                        
                        totalYRetornoCompra.add(getPrecioPrenda());
                        System.out.println("Usted esta llevando: ");
                        System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                        System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                        System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                        ropa.add(ropaObjeto);
                    }
                    
                    case 2 -> {                       
                        ropaObjeto = new RopaComponenteConcreto(
                            "Pantalon de Vestir MUJER",
                           "Tommy Hilfiger",
                             "Beige Talla 44",
                          60990
                        );                        
                        totalYRetornoCompra.add(getPrecioPrenda());
                        System.out.println("Usted esta llevando: ");
                        System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                        System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                        System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                        ropa.add(ropaObjeto);
                    }
                    
                    case 3 -> {                       
                        ropaObjeto = new RopaComponenteConcreto(
                            "Pantalon de Vestir MUJER",
                           "Tommy Hilfiger",
                             "Beige Talla 48",
                          60990
                        );                        
                        totalYRetornoCompra.add(getPrecioPrenda());
                        System.out.println("Usted esta llevando: ");
                        System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                        System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                        System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                        ropa.add(ropaObjeto);
                    }
                }
                }
               
            case 5 -> {
                View.MenuFutbol_H();
                int opcionUsuarioCFH = Option.OUsuario(1,3,4);
                switch(opcionUsuarioCFH) {
                    case 1 -> {                       
                        ropaObjeto = new RopaComponenteConcreto(
                            "Camiseta de Futbol HOMBRE",
                           "Adidas",
                             "COLO-COLO Talla S",
                          59990
                        );                        
                        totalYRetornoCompra.add(getPrecioPrenda());
                        System.out.println("Usted esta llevando: ");
                        System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                        System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                        System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                        ropa.add(ropaObjeto);
                    }
                    
                    case 2 -> {                       
                        ropaObjeto = new RopaComponenteConcreto(
                            "Camiseta de Futbol HOMBRE",
                           "Adidas",
                             "COLO-COLO Talla M",
                          59990
                        );                        
                        totalYRetornoCompra.add(getPrecioPrenda());
                        System.out.println("Usted esta llevando: ");
                        System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                        System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                        System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                        ropa.add(ropaObjeto);
                    }
                    
                    case 3 -> {                       
                        ropaObjeto = new RopaComponenteConcreto(
                            "Camiseta de Futbol HOMBRE",
                           "Adidas",
                             "COLO-COLO Talla L",
                          59990
                        );                        
                        totalYRetornoCompra.add(getPrecioPrenda());
                        System.out.println("Usted esta llevando: ");
                        System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                        System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                        System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                        ropa.add(ropaObjeto);
                    }
                }
                }
                
            case 6 -> {
                View.MenuFutbol_M();
                int opcionUsuarioCFM = Option.OUsuario(1,3,4);
                switch(opcionUsuarioCFM) {
                    case 1 -> {
                        ropaObjeto = new RopaComponenteConcreto(
                            "Camiseta de Futbol MUJER",
                           "Adidas",
                             "COLO-COLO Talla S",
                          59990
                        );                        
                        totalYRetornoCompra.add(getPrecioPrenda());
                        System.out.println("Usted esta llevando: ");
                        System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                        System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                        System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                        ropa.add(ropaObjeto);
                    }
                    
                    case 2 -> {                       
                        ropaObjeto = new RopaComponenteConcreto(
                            "Camiseta de Futbol MUJER",
                           "Adidas",
                             "COLO-COLO Talla M",
                          59990
                        );                        
                        totalYRetornoCompra.add(getPrecioPrenda());
                        System.out.println("Usted esta llevando: ");
                        System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                        System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                        System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                        ropa.add(ropaObjeto);
                    }
                    
                    case 3 -> {                        
                        ropaObjeto = new RopaComponenteConcreto(
                            "Camiseta de Futbol MUJER",
                           "Adidas",
                             "COLO-COLO Talla L",
                          59990
                        );                        
                        totalYRetornoCompra.add(getPrecioPrenda());
                        System.out.println("Usted esta llevando: ");
                        System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                        System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                        System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                        ropa.add(ropaObjeto);
                    }
                }
                }
                
            case 7 -> {
                View.MenuZapatillas();
                int opcionUsuarioZD = Option.OUsuario(1,6,7);
                switch(opcionUsuarioZD) {
                    case 1 -> {                  
                        ropaObjeto = new RopaComponenteConcreto(
                            "Zapatillas Deportivas UNISEX",
                           "Nike",
                             "AirZoom Talla 40",
                          99990
                        );                        
                        totalYRetornoCompra.add(getPrecioPrenda());
                        System.out.println("Usted esta llevando: ");
                        System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                        System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                        System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                        ropa.add(ropaObjeto);
                    }
                    
                    case 2 -> {                       
                        ropaObjeto = new RopaComponenteConcreto(
                            "Zapatillas Deportivas UNISEX",
                           "Nike",
                             "AirZoom Talla 42",
                          99990
                        );                        
                        totalYRetornoCompra.add(getPrecioPrenda());
                        System.out.println("Usted esta llevando: ");
                        System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                        System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                        System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                        ropa.add(ropaObjeto);
                    }
                    
                    case 3 -> {                      
                        ropaObjeto = new RopaComponenteConcreto(
                            "Zapatillas Deportivas UNISEX",
                           "Nike",
                             "AirZoom Talla 44",
                          99990
                        );                        
                        totalYRetornoCompra.add(getPrecioPrenda());
                        System.out.println("Usted esta llevando: ");
                        System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                        System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                        System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                        ropa.add(ropaObjeto);
                    }
                    
                    case 4 -> {                  
                        ropaObjeto = new RopaComponenteConcreto(
                            "Zapatillas Deportivas UNISEX",
                           "Nike",
                             "AirZoom Mercury Talla 40",
                          129990
                        );                       
                        totalYRetornoCompra.add(getPrecioPrenda());
                        System.out.println("Usted esta llevando: ");
                        System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                        System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                        System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                        ropa.add(ropaObjeto);
                    }
                    
                    case 5 -> {                        
                        ropaObjeto = new RopaComponenteConcreto(
                            "Zapatillas Deportivas UNISEX",
                           "Nike",
                             "AirZoom Mercury Talla 42",
                          129990
                        );                       
                        totalYRetornoCompra.add(getPrecioPrenda());
                        System.out.println("Usted esta llevando: ");
                        System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                        System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                        System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                        ropa.add(ropaObjeto);
                    }
                    
                    case 6 -> {                        
                        ropaObjeto = new RopaComponenteConcreto(
                            "Zapatillas Deportivas UNISEX",
                           "Nike",
                             "AirZoom Mercury Talla 44",
                          129990
                        );                        
                        totalYRetornoCompra.add(getPrecioPrenda());
                        System.out.println("Usted esta llevando: ");
                        System.out.println("Tipo de Prenda: "+ropaObjeto.getTipoRopa());
                        System.out.println("Marca y Modelo: "+ropaObjeto.getMarcaRopa()+" "+ropaObjeto.getModeloRopa());
                        System.out.println("Precio: $ "+ropaObjeto.getPrecioPrenda());
                        ropa.add(ropaObjeto);
                    }
                }
                }
                
            case 8 -> {
                System.out.println("----------------------== PLATAFORMA DE PAGO ==----------------------");
                int totalAPagar = 0;
                System.out.println("El Resumen de tu Compra: ");
                System.out.println("===============================================");
                for (RopaComponenteConcreto prenda : ropa) {
                    System.out.println("Prenda: " + prenda.getTipoRopa());
                    System.out.println("Marca prenda: "+prenda.getMarcaRopa());
                    System.out.println("Modelo prenda: "+prenda.getModeloRopa());
                    System.out.println("Precio prenda: $ "+prenda.getPrecioPrenda());
                    System.out.println("===============================================");
                    totalAPagar = totalAPagar + prenda.getPrecioPrenda();
                }
                System.out.println("Total a Pagar : $ "+totalAPagar);
                System.out.println("===============================================");
                System.out.println("Desea confirmar la compra? Digite [1] Si | [2] No");
                int confirmarCompra = Option.OUsuario(1,2,0);
                if(confirmarCompra == 1) {
                    System.out.println("Usted ha sido seleccionado para un descuento exclusivo en el total de su boleta");
                    this.ejecutar(totalAPagar); // INTERFACE C O M M A N D
                    RopaGarantiaExtendidaDecorator garantiaExtendida = new RopaGarantiaExtendidaDecorator();// IMPLEMENTANDO DECORADOR 1
                    garantiaExtendida.extra(totalAPagar);
                    RopaTicketDeCambioDecorator ticketDeCambio = new RopaTicketDeCambioDecorator();// IMPLEMENTANDO DECORADOR 2
                    ticketDeCambio.extra(totalAPagar);
                    ropa.clear();
                    totalYRetornoCompra.clear();
                    totalAPagar = 0;
                } else {
                    System.out.println("Cancelando compra... Por favor espere...");
                    wait(3);
                    System.out.println("\nSu compra ha sido cancelada con exito y el carrito ha sido vaciado.");
                    System.out.println("Gracias por preferirnos!");
                    ropa.clear();
                    totalYRetornoCompra.clear();
                    totalAPagar = 0;
                }
                }
                
            case 9 -> System.out.println("Saliendo de la tienda... Gracias por Preferirnos!");
            default -> System.out.println("Opcion invalida. Por favor digite una opcion. Ejemplo: 2");         
        }
        
        }while(opcionUsuario != 9);
        
        
    }
    
    public RopaComponenteConcreto() {
    }

    public RopaComponenteConcreto(String marcaRopa, String modeloRopa, int precioPrenda, int codigoPrenda) {
        this.marcaRopa = marcaRopa;
        this.modeloRopa = modeloRopa;
        this.precioPrenda = precioPrenda;

    }

    public RopaComponenteConcreto(String marcaRopa, String modeloRopa, String tipoRopa, int precioPrenda) {
        this.marcaRopa = marcaRopa;
        this.modeloRopa = modeloRopa;
        this.tipoRopa = tipoRopa;
        this.precioPrenda = precioPrenda;
    }


    public String getMarcaRopa() {
        return marcaRopa;
    }

    public void setMarcaRopa(String marcaRopa) {
        this.marcaRopa = marcaRopa;
    }

    public String getModeloRopa() {
        return modeloRopa;
    }

    public void setModeloRopa(String modeloRopa) {
        this.modeloRopa = modeloRopa;
    }

    public String getTipoRopa() {
        return tipoRopa;
    }

    public void setTipoRopa(String tipoRopa) {
        this.tipoRopa = tipoRopa;
    }

    public int getPrecioPrenda() {
        return precioPrenda;
    }

    public void setPrecioPrenda(int precioPrenda) {
        this.precioPrenda = precioPrenda;
    }

    @Override
    public void descuento(int total) { // INTERFACE C O M P O N E N T 
        if(total <= 100000) {
        int descuentoAplicado = 10000;
    total = total - descuentoAplicado;
        System.out.println("Descuento exclusivo de $10.000 pesos en el total de tu boleta aplicado con exito.");
        System.out.println("Tu nuevo Total a Pagar es de: $ "+total);
        System.out.println("Procesando... Por favor espere unos segundos.");
        wait(3);
        System.out.println("\nPagado con exito");
        }
        
        
        if(total > 100000) {
            int descuentoAplicado = 20000;
    total = total - descuentoAplicado;
        System.out.println("Descuento exclusivo de $20.000 pesos en el total de tu boleta aplicado con exito.");
        System.out.println("Tu nuevo Total a Pagar es de: $ "+total);
        System.out.println("Procesando... Por favor espere unos segundos.");
        wait(3);
        System.out.println("\nPagado con exito");
        }
    }

    @Override
    public void extra(int total) {
        
    }

    @Override
    public void ejecutar(int total) { // INTERFACE C O M M A N D Para aplicar descuentos
        
        this.descuento(total); // INTERFACE C O M P O N E N T
        
    }
    
    public void saludoDespedida(){
        System.out.println("\nGracias por visitar nuestra tienda.");
        System.out.println("Te esperamos pronto de vuelta!");
    }

    public static void wait(int segundos){
        try{
            for(int i=0; i<segundos; i++){
                Thread.sleep(500);
                System.out.print((3-i)+"...");
                Thread.sleep(500);
            }}catch(InterruptedException e){
                System.out.println("Ups... Algo imprevisto ha ocurrido. Intente de nuevo.");
            }
        System.out.println("");
    }
    
    
}