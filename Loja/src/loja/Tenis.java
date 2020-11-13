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
public class Tenis extends Produto{
    private int numero;
    private String tipoDoCano;
    private String tipoDaSola;

    public Tenis(int numero, String tipoDoCano, String tipoDaSola, String cor, double valor,int quantidadeDisponivel, String marca) {
        super(cor, valor,quantidadeDisponivel, marca);
        this.numero = numero;
        this.tipoDoCano = tipoDoCano;
        this.tipoDaSola = tipoDaSola;
    }

    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipoDoCano() {
        return tipoDoCano;
    }

    public void setTipoDoCano(String tipoDoCano) {
        this.tipoDoCano = tipoDoCano;
    }

    public String getTipoDaSola() {
        return tipoDaSola;
    }

    public void setTipoDaSola(String tipoDaSola) {
        this.tipoDaSola = tipoDaSola;
    }

    @Override
    public String toString() {
        return "Tenis{" + "numero=" + numero + ", tipoDoCano=" + tipoDoCano + ", tipoDaSola=" + tipoDaSola +" "+ super.toString()+ '}';
    }
    
}
