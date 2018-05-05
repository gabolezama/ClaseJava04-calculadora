package dario.java.std.herencia;

public class Moto extends VehiculoMotorizado {

    public Moto(String color, String marca, String modelo) {
        super(color, marca, modelo);
    }

    @Override
    public void acelerar() {
        System.out.println("Moviendo manija ...");
    }

    @Override
    public void frenar() {
        System.out.println("Apretando freno ...");
    }
    
    
}
