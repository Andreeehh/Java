/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listaenderecos;


/**
 *
 * @author andre
 */
import java.util.Scanner;

public class ListaEnderecos { public static void main(String[] args) {
    Scanner entraDados = new Scanner(System.in);
    
            Individuo individuoUm = new Individuo(null," "," ");
            System.out.println("Digite seu nome: ");
            individuoUm.setNome(entraDados.nextLine());
            System.out.println("Digite seu cpf: ");
            individuoUm.setCpf(entraDados.nextLine());
            Endereco enderecoUm = new Endereco(" "," "," "); 
            System.out.println("Digite sua Cidade: ");
            enderecoUm.setCidade(entraDados.nextLine()); 
            System.out.println("Digite o Nome da rua: ");
            enderecoUm.setRua(entraDados.nextLine()); 
            System.out.println("Digite o Numero: ");
            enderecoUm.setNumero(entraDados.nextLine());
    //vincula o endereço 
    individuoUm.setEndereco(enderecoUm); 
    System.out.println(individuoUm);
}
}