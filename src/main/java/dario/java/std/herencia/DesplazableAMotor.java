package dario.java.std.herencia;

public class DesplazableAMotor implements Desplazable {

    @Override
    public void acelerar() {
        System.out.println("Acelando el motor ...");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando el motor ...");
    }
    
    
    
}
