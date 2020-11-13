/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaagencia;

/**
 *
 * @author andre
 */
public class ContaBancaria { //declarando a classe conta bancaria
    public String titular; //declarando o tipo atributo, da classe ContaBancaria, de tipo texto
    public double saldo;
    public String email;
    public double valor;
    
        public void saque (double valor){
            if (saldo >= valor ){
                System.out.println("Retirada de " + valor);
                saldo = saldo - valor;
            } else {
                System.out.println("Saldo insuficiente para retirada de " + valor);
            }
        }
        public void deposito (double valor){ //função dentro da classe ContaBancaria, recebe um valor por parametro e executa uma ação, sem retornar nada por ser void
            System.out.println("Deposito de " + valor);
            saldo = saldo + valor;
        }
        
        public String extratoSimples(){ // uma função de tipo texto, que retorna os dados concatenados com texto previamente escrito
            return "Correntista " + titular + "\nValor atual da conta " + saldo + "\nEmail " + email;
        }
}
