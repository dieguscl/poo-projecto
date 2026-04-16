package controller;

import model.Contacto;
import java.util.ArrayList;
import java.util.List;

/**
 * Centraliza a lógica de negócio do sistema de gestão de contactos.
 */
public class GestorContactos {
    private List<Contacto> contactos;

    public GestorContactos() {
        this.contactos = new ArrayList<>();
    }

    public void adicionarContacto(Contacto c) {
        // TODO: Implementar lógica de validação de unicidade
        this.contactos.add(c);
    }

    public List<Contacto> getContactos() {
        return new ArrayList<>(contactos);
    }

    public List<Contacto> pesquisar(String criterio) {
        // TODO: Implementar pesquisa com Regex
        return new ArrayList<>();
    }

    public boolean removerContacto(Contacto c) {
        return contactos.remove(c);
    }

    public void gerarEstatisticas() {
        // TODO: Implementar contagem por tipo de contacto
    }

    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }
}
