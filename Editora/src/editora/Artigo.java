/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editora;

/**
 *
 * @author andre
 */
public class Artigo {
    private String nomeArtigo;
    private int numeroPaginas;

    public Artigo(String nomeArtigo, int numeroPaginas) {
        this.nomeArtigo = nomeArtigo;
        this.numeroPaginas = numeroPaginas;
    }

    public String getNomeArtigo() {
        return nomeArtigo;
    }

    public void setNomeArtigo(String nomeArtigo) {
        this.nomeArtigo = nomeArtigo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Artigo{" + "nomeArtigo=" + nomeArtigo + ", numeroPaginas=" + numeroPaginas + '}';
    }
    
    
}
