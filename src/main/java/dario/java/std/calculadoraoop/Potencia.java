package dario.java.std.calculadoraoop;

public class Potencia extends Operacion {

    @Override
    public Double operar() {
        return Math.pow(getOperandoA(), getOperandoB());
    }
    
}
