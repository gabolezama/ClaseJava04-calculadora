package dario.java.std.calculadoraoop.newdesign;

public class Division extends Operacion {

    public Division(Operando a, Operando b) {
        super(a, b);
    }

    @Override
    public Double valor() {
        return a.valor()/b.valor();
    }

}
