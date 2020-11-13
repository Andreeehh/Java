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
public class Veiculo {
    private String fabricante;
    private String nome;
    private int velocidade;

    public Veiculo(String fabricante, String nome, int velocidade) {
        this.fabricante = fabricante;
        this.nome = nome;
        this.velocidade = velocidade;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "fabricante=" + fabricante + ", nome=" + nome + ", velocidade(km/h)=" + velocidade + '}';
    }
    
}
