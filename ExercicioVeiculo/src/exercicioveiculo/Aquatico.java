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
public class Aquatico extends Veiculo {
    private int profundidade;

    public Aquatico(int profundidade, String fabricante, String nome, int velocidade) {
        super(fabricante, nome, velocidade);
        this.profundidade = profundidade;
    }

    public int getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(int profundidade) {
        this.profundidade = profundidade;
    }

    @Override
    public String toString() {
        return "Aquatico{" +' '+ super.toString()+ "profundidade(em m)=" + profundidade;
    }
    
}
