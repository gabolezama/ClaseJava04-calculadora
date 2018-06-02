package dario.java.std.calculadoraoop.newdesign;

public class Suma extends Operacion {

    public Suma(Operando a, Operando b) {
        super(a, b);
    }
    
    @Override
    public Double valor() {
        return a.valor() + b.valor();
    }
    
}
