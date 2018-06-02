package dario.java.std.calculadoraoop.newdesign;


public abstract class Operacion implements Operando {

    protected Operando a;
    protected Operando b;
    
    public Operacion(Operando a, Operando b) {
        this.a = a;
        this.b = b;
    }
    
    
}
