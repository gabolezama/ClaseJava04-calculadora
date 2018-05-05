package dario.java.std.herencia;

public class BicicletaPlayera extends Bicicleta {

    public BicicletaPlayera(String color, String marca, String modelo) {
        super(color, marca, modelo);
    }

    @Override
    public void frenar() {
        System.out.println("Contrapedalea!!! ...");
    }
    
    
    
}
