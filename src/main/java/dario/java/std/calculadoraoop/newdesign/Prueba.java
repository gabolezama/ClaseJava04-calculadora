package dario.java.std.calculadoraoop.newdesign;

public class Prueba {

    public static void main(String[] args) {
        
        Operando a = new Simple(5.0);
        Operando b = new Suma(a, a);
        Operando c = new Suma(b, a);
        Operando d = new Suma(c, b);
        Operando e = new Suma(d, new Simple(10.0));
        
        System.out.println("resulado: "+e.valor());
        
    }
    
}
