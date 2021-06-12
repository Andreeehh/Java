/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerarpreco;

/**
 *
 * @author andre
 */
public class Tenis extends Produto {
    private int tamanho;

    public Tenis(int tamanho, String marca, double qtdEstoque, String cor, double preco) {
        super(marca, qtdEstoque, cor, preco);
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Tenis{" + "tamanho=" + tamanho + '}'+ super.toString();
    }
    @Override
    public double calcularPreco(){
        setPreco((getQtdEstoque() * .1) + 100);
        return getPreco();
    };
}
