/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaagencia;

import java.util.Scanner; 

public class ProgramaAgencia {
    public static void main (String args[]){ // clase principal, onde o programa começa a ler
            
            Scanner entradaDados = new Scanner( System.in ); // imporado da classe java.until.Scanner, uma função que le os dados do teclado, armazenando numa variável entradaDados
            ContaBancaria contaUm = new ContaBancaria(); //Novo tipo de conta da classe ContaBancaria
                        
            System.out.println("Digite o Nome do titular: ");
            contaUm.titular = entradaDados.nextLine(); // le os dados do teclado pela função nextLine no objeto entradados, e armazena na objeto de string titular
            
            System.out.println("Digite o e-mail do titular: ");        
            contaUm.email = entradaDados.nextLine();
            
            System.out.println("Digite o Saldo da Conta: ");
            contaUm.saldo = entradaDados.nextDouble();
            
            System.out.println("Digite o valor do saque: ");// jeito q eu fiz
            contaUm.valor = entradaDados.nextDouble();
            
            contaUm.saque(contaUm.valor); // executa a função saque, armazenada na classe ContaBancaria, com o valor digitado na entrada de dados armazenado
            /* 
            System.out.println("Digite o valor do saque: ");
            contaUm.saque(entradaDados.nextDouble()); jeito que o professor fez, mais simples n precisa criar uma nova
            */
            System.out.println(contaUm.extratoSimples()); // função que exibe na tela, no caso exibindo uma função que esta dentro da classe ContaBancaria

            
        }
}
