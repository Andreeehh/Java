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
import java.util.Scanner;
public class GerarContasBancarias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner info = new Scanner(System.in);
        Scanner info2 = new Scanner(System.in);
        ContaBancaria contaUm = new ContaBancaria(" ",0);
        System.out.println("Digite nome do Cliente");
        contaUm.setTitular(info.nextLine());
        
        System.out.println("Digite o saldo do Cliente");
        contaUm.setSaldo(info2.nextDouble());
        
        System.out.println("Digite o valor do deposito");
        contaUm.depositar(info2.nextDouble());
        System.out.println(contaUm.toString());
        
        while(true){
            System.out.println("Digite o valor de saque ou 0 p/ fechar operacao:");
            double valor = info2.nextDouble();
            if(valor == 0){
                System.out.println(contaUm.toString());
                break;
            }
            contaUm.sacar(valor);
            System.out.println(contaUm.toString());
        }
        
        ContaEspecial contaDois = new ContaEspecial(0," ",0);
        System.out.println("Digite o Nome do cliente");
        contaDois.setTitular(info.nextLine());
        
        System.out.println("Digite o saldo da Conta");
        contaDois.setSaldo(info2.nextDouble());
        
        System.out.println("Digite o Limite da Conta Especial");
        contaDois.setLimite(info2.nextDouble());
        
        System.out.println("Digite o valor do deposito");
        contaDois.depositar(info2.nextDouble());
        System.out.println(contaDois.toString());
        
        while(true){
            System.out.println("Digite o valor de saque ou 0 p/ fechar operacao:");
            double valor = info2.nextDouble();
            if(valor == 0){
                System.out.println(contaDois.toString());
                break;
            }
            contaDois.sacar(valor);
            System.out.println(contaDois.toString());
        }
    }
    
}
