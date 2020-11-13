/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerarcontasbancarias;

/**
 *
 * @author andre
 */
public class ContaEspecial extends ContaBancaria{
    private double limite;

    public ContaEspecial(double limite, String titular, double saldo) {
        super(titular, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
        this.setSaldo(limite+this.getSaldo());
    }

    @Override
    public String toString() {
        return "ContaEspecial{" + "limite=" + limite + '}'+ super.toString();
    }
    
}
