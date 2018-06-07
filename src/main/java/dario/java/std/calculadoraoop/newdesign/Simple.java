package dario.java.std.calculadoraoop.newdesign;

public class Simple implements Operando {
    
    private Double valorSimple;

    public Simple(Double valorsSimple) {
        this.valorSimple = valorsSimple;
    }    
    
    @Override
    public Double valor() {
        return valorSimple;
    }
    
}
