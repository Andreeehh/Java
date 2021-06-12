/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerarseresvivos;

/**
 *
 * @author andre
 */
public class Pessoas extends SeresVivos {
    private int anoNascimento;

    public Pessoas(int anoNascimento, String nome, int idade) {
        super(nome, idade);
        this.anoNascimento = anoNascimento;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    @Override
    public String toString() {
        return "Pessoas{" + "anoNascimento=" + anoNascimento + '}'+ super.toString();
    }
    @Override
    public void gerarIdade(int anoAtual){
        setIdade(anoAtual - getAnoNascimento());
        
    };
}
