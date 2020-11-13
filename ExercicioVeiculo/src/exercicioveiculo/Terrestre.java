/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioveiculo;

/**
 *
 * @author andre
 */
public class Terrestre extends Veiculo {
    private int quantidadeDeEixos;

    public Terrestre(int quantidadeDeEixos, String fabricante, String nome, int velocidade) {
        super(fabricante, nome, velocidade);
        this.quantidadeDeEixos = quantidadeDeEixos;
    }

    public int getQuantidadeDeEixos() {
        return quantidadeDeEixos;
    }

    public void setQuantidadeDeEixos(int quantidadeDeEixos) {
        this.quantidadeDeEixos = quantidadeDeEixos;
    }

    @Override
    public String toString() {
        return "Terrestre{" + ' '+ super.toString()+ "quantidadeDeEixos=" + quantidadeDeEixos;
    }
    
}
