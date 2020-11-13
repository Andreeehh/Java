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
public class Revista {
    private String nome;
    private String issn;
    private Edicao edicao;

    public Revista(String nome, String issn, Edicao edicao) {
        this.nome = nome;
        this.issn = issn;
        this.edicao = edicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public Edicao getEdicao() {
        return edicao;
    }

    public void setEdicao(Edicao edicao) {
        this.edicao = edicao;
    }

    @Override
    public String toString() {
        return "Revista{" + "nome=" + nome + ", issn=" + issn + ", edicao=" + edicao + '}';
    }
    
}
