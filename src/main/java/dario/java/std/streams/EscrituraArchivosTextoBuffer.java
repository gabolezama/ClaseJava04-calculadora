package dario.java.std.streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EscrituraArchivosTextoBuffer {

    public static void main(String[] args) {
        
        String linea1 = "When I am king, you will be first against the wall";
        String linea2 = "With your opinion which is of no consequence at all";
        String linea3 = "What's that...? (I may be paranoid, but no android)";
        String linea4 = "What's that...? (I may be paranoid, but no android)";

        File destino = new File("salida-buffer.txt");
        try (FileWriter writer = new FileWriter(destino);
                BufferedWriter buffer = new BufferedWriter(writer)) {
            
            buffer.write(linea1);
            buffer.newLine();
            buffer.write(linea2);
            buffer.newLine();
            buffer.write(linea3);
            buffer.newLine();
            buffer.write(linea4);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EscrituraArchivosTextoBuffer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EscrituraArchivosTextoBuffer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
