package co.edu.ucentral.proydemo.utilidades;

import java.io.*;

public class UtilidadArchivos {
    public static boolean guardar(String archivo, Object objeto) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo));
            oos.writeObject(objeto);
        } catch (IOException e) {
            return false;
        }
        return true;
    }

    public static Object obtener(String archivo) {
        Object objetoConsultado;
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo));
            objetoConsultado = ois.readObject();
            return objetoConsultado;
        } catch (ClassNotFoundException e) {
            return null;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
