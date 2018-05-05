package dario.java.std.herencia.maquina;

public abstract class MaquinaDeInfusionesCalientes {
    
    public Infusion preparar() {
        Infusion infusion = agregarProducto();
        hervirAguar(infusion);
        servirEnTasa(infusion);
        agregarCondimentos(infusion);
        return infusion;
    }

    protected abstract Infusion agregarProducto();
    protected abstract void agregarCondimentos(Infusion infusion);
    
    private void hervirAguar(Infusion infusion) {
        System.out.println("Hiervo el agua");
    }

    private void servirEnTasa(Infusion infusion) {
        System.out.println("Sirvo en la tasa");
    }

}
