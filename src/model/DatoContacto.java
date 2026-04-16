package model;

import java.io.Serializable;

/**
 * Representa um par tipo de contacto e o seu respetivo valor (ex: TELEFONE, "211111111").
 */
public class DatoContacto implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private TipoContacto tipo;
    private String valor;

    public DatoContacto(TipoContacto tipo, String valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    // Getters e Setters
    public TipoContacto getTipo() { return tipo; }
    public void setTipo(TipoContacto tipo) { this.tipo = tipo; }
    public String getValor() { return valor; }
    public void setValor(String valor) { this.valor = valor; }

    @Override
    public String toString() {
        return tipo + ": " + valor;
    }
}
