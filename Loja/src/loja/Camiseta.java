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
public class Camiseta extends Produto {
    private String modelo;
    private String tamanho;
    private String tecido;

    public Camiseta(String modelo, String tamanho, String tecido, String cor, double valor, int quantidadeDisponivel, String marca) {
        super(cor, valor, quantidadeDisponivel, marca);
        this.modelo = modelo;
        this.tamanho = tamanho;
        this.tecido = tecido;
    }

    

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTecido() {
        return tecido;
    }

    public void setTecido(String tecido) {
        this.tecido = tecido;
    }

    @Override
    public String toString() {
        return "Camiseta{" + "modelo=" + modelo + ", tamanho=" + tamanho + ", tecido=" + tecido + super.toString()+ '}';
    }
    
}
