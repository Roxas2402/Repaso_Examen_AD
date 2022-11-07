package binarios.escrituraLectura;

import javax.xml.crypto.Data;
import java.io.*;

public class EscrituraBinarios {
    //TODO: Cómo escribir binario
    public static void main(String[] args) {
        File file = new File("binario.dat");
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream(file);
            DataOutputStream dos = new DataOutputStream(fos);
            for (int i = 0; i < 10; i++) {
                dos.writeInt(i);
            }
            dos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
