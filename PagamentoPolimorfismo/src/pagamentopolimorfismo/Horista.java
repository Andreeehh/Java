/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagamentopolimorfismo;

/**
 *
 * @author andre
 */
public class Horista extends Empregado {
    private double quantidadeHoras;
    private double valorHora;

    public Horista(double quantidadeHoras, double valorHora, String nome) {
        super(nome);
        this.quantidadeHoras = quantidadeHoras;
        this.valorHora = valorHora;
    }

    public double getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(double quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return "Horista{" + "quantidadeHoras=" + quantidadeHoras + ", valorHora=" + valorHora + '}';
    }
    @Override
    public double salarios(){
        return getQuantidadeHoras() * getValorHora();
    }
}
