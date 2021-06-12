/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2zoologico;

/**
 *
 * @author andre
 */
public class Mamiferos {
    private double peso;
    private int idade;
    private String especie;
    private int semanasDeGestacao;

    public Mamiferos(double peso, int idade, String especie, int semanasDeGestacao) {
        this.peso = peso;
        this.idade = idade;
        this.especie = especie;
        this.semanasDeGestacao = semanasDeGestacao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getSemanasDeGestacao() {
        return semanasDeGestacao;
    }

    public void setSemanasDeGestacao(int semanasDeGestacao) {
        this.semanasDeGestacao = semanasDeGestacao;
    }

    @Override
    public String toString() {
        return "Mamiferos{" + "peso=" + peso + ", idade=" + idade + ", especie=" + especie + ", semanasDeGestacao=" + semanasDeGestacao + '}';
    }
    
}
