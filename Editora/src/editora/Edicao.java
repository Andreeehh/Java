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
public class Edicao {
    private String numero;
    private int tiragem;
    private Artigo artigo;

    public Edicao(String numero, int tiragem, Artigo artigo) {
        this.numero = numero;
        this.tiragem = tiragem;
        this.artigo = artigo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumeroEdicao(String numero) {
        this.numero = numero;
    }

    public int getTiragem() {
        return tiragem;
    }

    public void setTiragem(int tiragem) {
        this.tiragem = tiragem;
    }

    public Artigo getArtigo() {
        return artigo;
    }

    public void setArtigo(Artigo artigo) {
        this.artigo = artigo;
    }

    @Override
    public String toString() {
        return "Edicao{" + "numero=" + numero + ", tiragem=" + tiragem + ", artigo=" + artigo + '}';
    }
    
    
}
