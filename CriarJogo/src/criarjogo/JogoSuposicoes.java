/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criarjogo;

/**
 *
 * @author andre
 */
import java.util.Scanner;
class JogoSuposicoes {
Jogador marcelo;
Jogador eliane;
Jogador pedro;
public void iniciarJogo(){
marcelo = new Jogador();
eliane = new Jogador();
pedro = new Jogador();

int suposicaoUm = 0;

    int suposicaoDois = 0;
    int suposicaoTres = 0;
int numeroAlvo = (int) (Math.random() * 3);
int contador=1;
while(contador <= 2) {
boolean mEstaCerto = false;
boolean eEstaCerto = false;
boolean pEstaCerto = false;

marcelo.palpite();
eliane.palpite();
pedro.palpite();
suposicaoUm = marcelo.numero;
System.out.println("\n O jogador um forneceu o numero..... " + suposicaoUm);
suposicaoDois = eliane.numero;
System.out.println(" O jogador dois forneceu o numero... " + suposicaoDois);
suposicaoTres = pedro.numero;
System.out.println(" O jogador tres forneceu o numero... " + suposicaoTres + "\n");
if (suposicaoUm == numeroAlvo){
mEstaCerto = true;
System.out.println("Jogador um acertou! " + mEstaCerto);
System.out.println("\n O numero a ser adivinhado era... " + numeroAlvo + "\n");
}
if (suposicaoDois == numeroAlvo){
eEstaCerto = true;
System.out.println("Jogador dois acertou! " + eEstaCerto);
System.out.println("\n O numero a ser adivinhado era... " + numeroAlvo + "\n");
}
if (suposicaoTres == numeroAlvo){
pEstaCerto = true;
System.out.println("Jogador tres acertou! " + pEstaCerto);
System.out.println("\n O numero a ser adivinhado era... " + numeroAlvo + "\n");
}
if (mEstaCerto&&eEstaCerto&&pEstaCerto){
System.out.println("Os tres jogadores acertaram!");
System.out.println("\n O numero a ser adivinhado era... " + numeroAlvo + "\n");
}
if ((suposicaoUm != numeroAlvo) && (suposicaoDois != numeroAlvo) && (suposicaoTres != numeroAlvo)){
System.out.println("Os tres jogadores erraram!");
}
contador = contador + 1;
}
}
}
