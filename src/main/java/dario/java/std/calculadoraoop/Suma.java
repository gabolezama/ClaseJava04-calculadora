package dario.java.std.calculadoraoop;

public class Suma extends Operacion {

    @Override
    public Double operar() {
        return getOperandoA()+getOperandoB();
    }
    
}
