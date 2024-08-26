package View;

import Controller.RopaComponenteConcreto;

public class Retail {
    public static void main(String[] args) {
        RopaComponenteConcreto ropaObjeto = new RopaComponenteConcreto(); // Los Decoradores se irán activando (O no) en el transcurso de la venta.
        ropaObjeto.vender();        
    }  
}
