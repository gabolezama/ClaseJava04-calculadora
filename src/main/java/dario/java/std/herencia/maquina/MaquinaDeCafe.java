package dario.java.std.herencia.maquina;

public class MaquinaDeCafe extends MaquinaDeInfusionesCalientes {

    @Override
    protected Infusion agregarProducto() {
        System.out.println("Agregando granos de café");
        return new Infusion("Café");
    }

    @Override
    protected void agregarCondimentos(Infusion infusion) {
        System.err.println("Agregando Leche y azucar");
    }
    
}
