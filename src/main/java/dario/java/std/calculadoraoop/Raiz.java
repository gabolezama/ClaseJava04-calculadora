package dario.java.std.calculadoraoop;

public class Raiz extends Operacion {

    @Override
    public Double operar() {
        return Math.pow(getOperandoA(), 1/getOperandoB());
    }
    
}
