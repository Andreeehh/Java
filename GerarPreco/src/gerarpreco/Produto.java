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
public abstract class Produto {
    private String marca;
    private double qtdEstoque;
    private String cor;
    private double preco;

    public Produto(String marca, double qtdEstoque, String cor, double preco) {
        this.marca = marca;
        this.qtdEstoque = qtdEstoque;
        this.cor = cor;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(double qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Produto{" + "marca=" + marca + ", qtdEstoque=" + qtdEstoque + ", cor=" + cor + ", preco=" + preco + '}';
    }

    
    public abstract double calcularPreco();
}
