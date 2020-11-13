/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editora;

/**
 *
 * @author andre
 */
import java.util.Scanner;

public class Editora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner info = new Scanner(System.in);
        Scanner entraDados = new Scanner (System.in);
        
        Artigo artigoUm = new Artigo(" ",0);
        System.out.println("Digite o Nome do artigo:");
        artigoUm.setNomeArtigo(info.nextLine());
        System.out.println("Digite a quantidade de paginas do artigo:");
        artigoUm.setNumeroPaginas(info.nextInt());
        
        Edicao edicaoUm = new Edicao(" ",0,null);
        edicaoUm.setArtigo(artigoUm);
        System.out.println("Digite o numero da Edicao:");
        edicaoUm.setNumeroEdicao(entraDados.nextLine());
        System.out.println("Digite a tiragem da Edicao: ");
        edicaoUm.setTiragem(info.nextInt());
        
        Revista revistaUm = new Revista(" "," ",null);
        revistaUm.setEdicao(edicaoUm);
        System.out.println("Digite o nome da Revista: ");
        revistaUm.setNome(entraDados.nextLine());
        System.out.println("Digite o issn da revista: ");
        revistaUm.setIssn(entraDados.nextLine());
        
        System.out.println(revistaUm);
        
    }
    
}
