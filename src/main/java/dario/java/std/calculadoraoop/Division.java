package dario.java.std.calculadoraoop;

public class Division extends Operacion {

    @Override
    public Double operar() {
        return getOperandoA()/getOperandoB();
    }

}
