/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author andre
 */
import java.util.Scanner;
public class Game {
    public static void main (String args[]) {
        Scanner info = new Scanner( System.in );
        Player playerUm = new Player("","");
        System.out.println("Digite o nome do player");
        playerUm.setNick(info.nextLine());
        System.out.println("Digite o tipo de game");
        playerUm.setTipoGame(info.nextLine());
        
while(true) {
    Scanner entradaDados = new Scanner( System.in );
    System.out.println("Digite uma opcao do Menu, sendo: \n [1] Relatorio \n [2] Alterar Jogo \n");
int opcao = entradaDados.nextInt();
if (opcao==1){
     System.out.println("" + playerUm.relatorioPlayer());
    
}
else
if (opcao==2){
    System.out.println("Digite o novo tipo de game");
    playerUm.setTipoGame(info.nextLine());
    
}
else
{
    System.out.println("Fim");
    break;
}
} } }
