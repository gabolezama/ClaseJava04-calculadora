package dario.java.std.calculadoraoop.newdesign;

public class Resta extends Operacion {

    public Resta(Operando a, Operando b) {
        super(a, b);
    }

    @Override
    public Double valor() {
        return a.valor()-b.valor();
    }    
    
}
