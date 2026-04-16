package model;

/**
 * Representa um contacto de cariz profissional, incluindo o nome da empresa.
 */
public class ContactoProfesional extends Contacto {
    private static final long serialVersionUID = 1L;
    
    private String empresa;

    public ContactoProfesional(String nome, String empresa) {
        super(nome);
        this.empresa = empresa;
    }

    public String getEmpresa() { return empresa; }
    public void setEmpresa(String empresa) { this.empresa = empresa; }

    @Override
    public String presentarInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(getNome()).append("\n");
        sb.append(empresa).append("\n");
        for (DatoContacto d : getDados()) {
            sb.append(d.toString()).append("\n");
        }
        return sb.toString();
    }
}
