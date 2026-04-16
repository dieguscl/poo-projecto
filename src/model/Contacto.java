package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe abstrata base para todos os tipos de contactos.
 */
public abstract class Contacto implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String nome;
    private List<DatoContacto> dados;

    public Contacto(String nome) {
        this.nome = nome;
        this.dados = new ArrayList<>();
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public List<DatoContacto> getDados() { return dados; }
    public void addDado(DatoContacto dado) { this.dados.add(dado); }

    /**
     * Método abstrato para apresentar a informação do contacto.
     * Deve ser implementado pelas subclasses para incluir dados específicos.
     */
    public abstract String presentarInfo();

    @Override
    public String toString() {
        return presentarInfo();
    }
}
