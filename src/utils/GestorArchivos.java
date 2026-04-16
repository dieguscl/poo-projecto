package utils;

import model.Contacto;
import java.io.*;
import java.util.List;

/**
 * Classe utilitária para operações de leitura e escrita em ficheiros.
 */
public class GestorArchivos {

    /**
     * Guarda o estado binário da lista de contactos.
     */
    public static void guardarDados(List<Contacto> contactos, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(contactos);
        } catch (IOException e) {
            System.err.println("Erro ao guardar dados: " + e.getMessage());
        }
    }

    /**
     * Carrega a lista de contactos a partir de um ficheiro binário.
     */
    @SuppressWarnings("unchecked")
    public static List<Contacto> carregarDados(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (List<Contacto>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return null;
        }
    }

    /**
     * Exporta uma listagem para um ficheiro de texto simples.
     */
    public static void exportarTexto(String conteudo, String filename) {
        try (PrintWriter out = new PrintWriter(new FileWriter(filename))) {
            out.println(conteudo);
        } catch (IOException e) {
            System.err.println("Erro ao exportar ficheiro: " + e.getMessage());
        }
    }
}
