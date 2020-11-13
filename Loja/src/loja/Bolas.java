/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

/**
 *
 * @author andre
 */
public class Bolas extends Produto {
    private String esporte;

    public Bolas(String esporte, String cor, double valor, int quantidadeDisponivel, String marca) {
        super(cor, valor,  quantidadeDisponivel, marca);
        this.esporte = esporte;
    }

    public String getEsporte() {
        return esporte;
    }

    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }

    @Override
    public String toString() {
        return "Bolas{" + "esporte=" + esporte + super.toString()+ '}';
    }
    
    
}
