package dario.java.std.herencia;

public class MainHerencia {

    public static void main(String[] args) {
        Vehiculo v1 = new Auto("Rojo", "Ford", "Modelo");
//        acelerarVehiculo(v1);
//        v1.frenar();
//        
        Vehiculo v2 = new Avion("Rojo", "Airbus", "777");
//        v2.acelerar();
//        v2.frenar();
//        acelerarVehiculo(v2);
//        
        Bicicleta b = new Bicicleta("Azul", "Aurora", "bla");
//        frenarBicicleta(b);
//        b.frenar();
//        
        Bicicleta b2 = new BicicletaPlayera("Azul", "Aurora", "bla");
//        frenarBicicleta(b2);
//        b2.frenar();
        
        
        hacerDesplazar(b);
        hacerDesplazar(b2);
        hacerDesplazar(v1);
        hacerDesplazar(v2);
        
    }
    
    private static void hacerDesplazar(Desplazable d) {
        d.acelerar();
        d.frenar();
    }
    
    
    private static void acelerarVehiculo(Vehiculo v) {
        v.acelerar();
    }
    
    private static void frenarBicicleta(Bicicleta b) {
        b.frenar();
    }
}
