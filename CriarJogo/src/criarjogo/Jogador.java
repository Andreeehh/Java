/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criarjogo;
import java.util.Scanner;

class Jogador {
int numero=0;
Scanner info = new Scanner(System.in);
public void palpite(){
    System.out.println("Numero Pensado:");
    numero = info.nextInt();
System.out.println("Estou pensando no numero...... " + numero);
}
}