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
import java.util.Scanner;
public class Loja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner info1 = new Scanner(System.in);
        Scanner info2 = new Scanner(System.in);
        Scanner info3 = new Scanner(System.in);
        
        Tenis tenisUm = new Tenis(0,"","","",0,0,"");
        System.out.println("Digite quantidade disponivel de Tenis");
        tenisUm.setQuantidadeDisponivel(info2.nextInt());
        System.out.println("Digite marca do Tenis");
        tenisUm.setMarca(info1.nextLine());
        System.out.println("Digite preco do Tenis");
        tenisUm.setValor(info3.nextDouble());
        System.out.println("Digite cor do Tenis");
        tenisUm.setCor(info1.nextLine());
        System.out.println("Digite tamanho do Tenis");
        tenisUm.setNumero(info2.nextInt());
        System.out.println("Digite tipo do cano do Tenis(Alto,medio,Baixo)");
        tenisUm.setTipoDoCano(info1.nextLine());
        System.out.println("Digite o tipo da sola do tenis");
        tenisUm.setTipoDaSola(info1.nextLine());
        
        
        System.out.println("#############################");
        
        Camiseta camisetaUm = new Camiseta("","","","",0,0,"");
        System.out.println("Digite quantidade disponivel de Camiseta");
        camisetaUm.setQuantidadeDisponivel(info2.nextInt());
        System.out.println("Digite marca da Camiseta");
        camisetaUm.setMarca(info1.nextLine());
        System.out.println("Digite preco da Camiseta");
        camisetaUm.setValor(info3.nextDouble());
        System.out.println("Digite cor da Camiseta");
        camisetaUm.setCor(info1.nextLine());
        System.out.println("Digite tamanho da Camiseta");
        camisetaUm.setTamanho(info1.nextLine());
        System.out.println("Digite o modelo da Camiseta(Regata, manga longa, manga 3/4, polo, gola V)");
        camisetaUm.setModelo(info1.nextLine());
        System.out.println("Digite o tipo do tecido da Camiseta(tectel, algodao,malha)");
        camisetaUm.setTecido(info1.nextLine());
        
        
        System.out.println("#############################");
        
        Bolas bolaUm = new Bolas("","",0,0,"");
        System.out.println("Digite quantidade disponivel de Bolas");
        bolaUm.setQuantidadeDisponivel(info2.nextInt());
        System.out.println("Digite marca da Bola");
        bolaUm.setMarca(info1.nextLine());
        System.out.println("Digite preco da Bola");
        bolaUm.setValor(info3.nextDouble());
        System.out.println("Digite cor da Bola");
        bolaUm.setCor(info1.nextLine());
        System.out.println("Digite o esporte da Bola");
        bolaUm.setEsporte(info1.nextLine());
        System.out.println("#############################");
        System.out.println(tenisUm.toString());
        System.out.println("#############################");
        System.out.println(camisetaUm.toString());
        System.out.println("#############################");
        System.out.println(bolaUm.toString());
    }
    
}
