import controller.GestorContactos;
import model.Contacto;
import utils.GestorArchivos;
import view.Consola;
import java.util.List;

/**
 * Ponto de entrada da aplicação de Gestão de Contactos.
 */
public class Main {
    private static final String FILE_NAME = "contactos.dat";

    public static void main(String[] args) {
        GestorContactos gestor = new GestorContactos();
        
        // Carregar dados iniciais
        List<Contacto> carregados = GestorArchivos.carregarDados(FILE_NAME);
        if (carregados != null) {
            gestor.setContactos(carregados);
        }

        // Iniciar Interface
        Consola consola = new Consola(gestor);
        consola.iniciar();

        // Guardar dados antes de sair
        GestorArchivos.guardarDados(gestor.getContactos(), FILE_NAME);
    }
}
