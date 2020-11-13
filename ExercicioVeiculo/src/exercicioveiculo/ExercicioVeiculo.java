/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioveiculo;

/**
 *
 * @author andre
 */

import java.util.Scanner;

public class ExercicioVeiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        Scanner info2 = new Scanner(System.in);
        Aereo aereoUm = new Aereo("","","",0);
        Aquatico aquaticoUm = new Aquatico(0,"","",0);
        Terrestre terrestreUm = new Terrestre(0,"","",0);
        System.out.println("Digite Nome do Veiculo Aereo:");
        aereoUm.setNome(info.nextLine());
        System.out.println("Digite Fabricante do veiculo:");
        aereoUm.setFabricante(info.nextLine());
        System.out.println("Digite Altitude do veiculo:");
        aereoUm.setAltitude(info.nextLine());
        System.out.println("Digite Velocidade do veiculo:");
        aereoUm.setVelocidade(info.nextInt());
        
        System.out.println("Digite Nome do Veiculo Aquatico:");
        aquaticoUm.setNome(info2.nextLine());
        System.out.println("Digite Fabricante do veiculo:");
        aquaticoUm.setFabricante(info2.nextLine());
        System.out.println("Digite Profundidade do veiculo:");
        aquaticoUm.setProfundidade(info.nextInt());
        System.out.println("Digite Velocidade do veiculo:");
        aquaticoUm.setVelocidade(info.nextInt());
        
        System.out.println("Digite Nome do Veiculo Terrestre:");
        terrestreUm.setNome(info2.nextLine());
        System.out.println("Digite Fabricante do veiculo:");
        terrestreUm.setFabricante(info2.nextLine());
        System.out.println("Digite Quantidade de Eixos do veiculo:");
        terrestreUm.setQuantidadeDeEixos(info.nextInt());
        System.out.println("Digite Velocidade do veiculo:");
        terrestreUm.setVelocidade(info.nextInt());
        
        System.out.println(aereoUm);
        System.out.println(aquaticoUm);
        System.out.println(terrestreUm);
    }
    
}
