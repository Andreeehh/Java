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
public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double valor){
        System.out.println("Valor de "+valor+" depositado");
        this.setSaldo(valor + this.getSaldo());
    }
    public void sacar(double valor){
        if(valor>saldo){
            System.out.println("VALOR INDISPONÍVEL PARA SAQUE, MAXIMO P SAQUE DE "+ saldo+ " REAIS");
            this.setSaldo(saldo);
        }else{
            System.out.println("Valor de "+ valor +" sacado");
            this.setSaldo(this.getSaldo()-valor); 
        }
    }

    @Override
    public String toString() {
        return "ContaBancaria{" + "titular=" + titular + ", saldo=" + saldo + '}';
    }
    
}
