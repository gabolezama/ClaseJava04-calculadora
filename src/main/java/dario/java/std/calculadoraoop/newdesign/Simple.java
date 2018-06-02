package dario.java.std.calculadoraoop.newdesign;

public class Simple implements Operando {

    private Double valorsSimple;

    public Simple(Double valorsSimple) {
        this.valorsSimple = valorsSimple;
    }    
    
    @Override
    public Double valor() {
        return valorsSimple;
    }
    
}
