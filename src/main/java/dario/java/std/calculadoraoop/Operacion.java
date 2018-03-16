package dario.java.std.calculadoraoop;


public abstract class Operacion {
    
    private Double operandoA;
    private Double operandoB;
    
    public abstract Double operar();

    public Double getOperandoA() {
        return operandoA;
    }

    public void setOperandoA(Double operandoA) {
        this.operandoA = operandoA;
    }

    public Double getOperandoB() {
        return operandoB;
    }

    public void setOperandoB(Double operandoB) {
        this.operandoB = operandoB;
    }


    
    
}
