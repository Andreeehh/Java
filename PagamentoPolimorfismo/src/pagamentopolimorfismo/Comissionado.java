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
public class Comissionado extends Empregado {
    private double vendasBrutas;
    private double comissao;

    public Comissionado(double vendasBrutas, double comissao, String nome) {
        super(nome);
        this.vendasBrutas = vendasBrutas;
        this.comissao = comissao;
    }

    public double getVendasBrutas() {
        return vendasBrutas;
    }

    public void setVendasBrutas(double vendasBrutas) {
        this.vendasBrutas = vendasBrutas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return "Comissionado{" + "vendasBrutas=" + vendasBrutas + ", comissao=" + comissao + '}' + super.toString();
    }
    
    @Override
    public double salarios(){
        return getVendasBrutas() * getComissao(); 
    }
    
    
}
