package escribirEnFicheros;

import java.io.*;

public class EscribirFicheros {
    public static void main(String[] args) {
        //TODO: Cómo escribir en ficheros
        File destino = new File("EjemploEscritura.txt");
        try {
            FileWriter fw = new FileWriter(destino, true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < 10; i++) {
                bw.write("Esta es la línea " + (i + 1));
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
