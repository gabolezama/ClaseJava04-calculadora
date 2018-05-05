package dario.java.std.herencia.maquina;

public class MaquinaDeTe extends MaquinaDeInfusionesCalientes {

    @Override
    protected Infusion agregarProducto() {
        System.out.println("Agrego hojas de té");
        return new Infusion("Té");
    }

    @Override
    protected void agregarCondimentos(Infusion infusion) {
        System.out.println("Agregar limón");
    }
    
}
