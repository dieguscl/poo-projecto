package model;

/**
 * Representa um contacto de cariz pessoal.
 */
public class ContactoPersonal extends Contacto {
    private static final long serialVersionUID = 1L;

    public ContactoPersonal(String nome) {
        super(nome);
    }

    @Override
    public String presentarInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(getNome()).append("\n");
        for (DatoContacto d : getDados()) {
            sb.append(d.toString()).append("\n");
        }
        return sb.toString();
    }
}
