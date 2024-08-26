package Model;


public abstract class RopaDecorator implements IComponent{
    
    private IComponent componente;

    public RopaDecorator(IComponent componente) {
        this.componente = componente;
    }

    public RopaDecorator() {
    }
    
    
    protected IComponent getComponent(){
    return componente;
    }
    
}
