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
public class Camisa extends Produto {
    private String estilo;
    private double precoCompra;

    public Camisa(String estilo, double precoCompra, String marca, double qtdEstoque, String cor, double preco) {
        super(marca, qtdEstoque, cor, preco);
        this.estilo = estilo;
        this.precoCompra = precoCompra;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    @Override
    public String toString() {
        return "Camisa{" + "estilo=" + estilo + ", precoCompra=" + precoCompra + '}'+super.toString();
    }
    
    @Override
    public double calcularPreco(){
        setPreco((getPrecoCompra() * .4) + getPrecoCompra());
        return getPreco();
    };
    
}
