package dario.java.std.herencia.maquina;

public class MainMaquina {

    public static void main(String[] args) {
        
        System.out.println("Preparando Té:");
        MaquinaDeInfusionesCalientes teMachine = new MaquinaDeTe();
        Infusion infusion = teMachine.preparar();
        System.out.println(infusion.getNombre());

        System.out.println("Preparando Café:");
        MaquinaDeInfusionesCalientes coffeMachine = new MaquinaDeCafe();
        Infusion infusion2 = coffeMachine.preparar();
        System.out.println(infusion2.getNombre());
        
    }
    
}
