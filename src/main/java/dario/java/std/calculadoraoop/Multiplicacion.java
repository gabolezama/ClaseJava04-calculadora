package dario.java.std.calculadoraoop;

public class Multiplicacion extends Operacion {

    @Override
    public Double operar() {
        return getOperandoA()*getOperandoB();
    }
       
}
