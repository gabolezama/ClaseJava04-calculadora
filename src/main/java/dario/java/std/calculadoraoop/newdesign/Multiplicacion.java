package dario.java.std.calculadoraoop.newdesign;

public class Multiplicacion extends Operacion {

    public Multiplicacion(Operando a, Operando b) {
        super(a, b);
    }

    @Override
    public Double valor() {
        return a.valor()*b.valor();
    }

}
