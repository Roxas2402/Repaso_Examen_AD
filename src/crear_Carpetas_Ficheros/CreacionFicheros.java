package crear_Carpetas_Ficheros;

import java.io.File;
import java.io.IOException;

public class CreacionFicheros {
    public static void main(String[] args) {
        //TODO: Cómo crear una carpeta
        File directorio = new File("PRUEBAS");
        directorio.mkdir();

        //TODO: Cómo crear ficheros
        File f1 = new File(directorio, "f1.txt");
        File f2 = new File(directorio, "f2.txt");


        try {
            boolean f1Created = f1.createNewFile();
            boolean f2Created = f2.createNewFile();

            if (f1Created) {
                System.out.println("Fichero 1 creado");
            } else {
                System.out.println("Fichero 1 no creado");
            }

            if (f2Created) {
                System.out.println("Fichero 2 creado");
            } else {
                System.out.println("Fichero 2 no creado");
            }

            //TODO: Cómo renombrar ficheros
            if (f1Created) {
                boolean renombrado = f1.renameTo(new File(directorio, "f1NEW.txt"));
                if (renombrado) {
                    System.out.println("Fichero renombrado");
                } else {
                    System.out.println("Fichero NO renombrado");
                }
            }

            //TODO: Cómo borrar ficheros o directorios
            boolean borrado = f2.delete();
            if (borrado) {
                System.out.println("Archivo borrado");
            } else {
                System.out.println("Archivo NO borrado");
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
