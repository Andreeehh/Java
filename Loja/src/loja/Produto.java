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
public class Produto {
    private double valor;
    private int quantidadeDisponivel;
    private String marca;    
    private String cor;

    public Produto(String cor,double valor, int quantidadeDisponivel,String marca) {
        this.cor = cor;
        this.valor = valor;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    @Override
    public String toString() {
        return "Produto{"+  "valor=" + valor +  ", quantidadeDisponivel=" + quantidadeDisponivel + ", marca=" + marca + ", cor=" + cor + '}';
    }

    

    
    
}
