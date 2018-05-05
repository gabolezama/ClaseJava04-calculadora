package dario.java.std.herencia;

public class Avion extends VehiculoMotorizado {
    
    public Avion(String color, String marca, String modelo) {
        super(color, marca, modelo);
    }

    @Override
    public void acelerar() {
        System.out.println("Moviendo palanca para acelerar ...");
    }

    @Override
    public void frenar() {
        System.out.println("Moviendo palanca para frenar ...");
    }
    
    
    
}
