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
        
        String a = "Juan";
        String a1 = "Juan";
        
        String c = new String("Juan");
        String c1 = new String("Juan");
        
        System.out.println("a == a1: " + (a==a1));
        System.out.println("c == c1: " + (c==c1));

        System.out.println(b);
        
        System.out.println("Fin");
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
