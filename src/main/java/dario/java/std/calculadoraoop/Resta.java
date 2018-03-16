package dario.java.std.calculadoraoop;

public class Resta extends Operacion {

    @Override
    public Double operar() {
        return getOperandoA()-getOperandoB();
    }
    
}
