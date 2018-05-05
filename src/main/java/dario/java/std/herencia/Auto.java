package dario.java.std.herencia;


public class Auto extends VehiculoMotorizado {
    
    public Auto(String color, String marca, String modelo) {
        super(color, marca, modelo);
    }
    
    public void abrirBaul() {
        System.out.println("Abriendo baúl ...");
    }

    @Override
    public void acelerar() {
        System.out.println("Apretando el acelerador ...");
    }

    @Override
    public void frenar() {
        System.out.println("Pizando el freno ...");
    }
    
    
    
}
