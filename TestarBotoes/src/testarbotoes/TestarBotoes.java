/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testarbotoes;

/**
 *
 * @author andre
 */
import javax.swing.JFrame;//importando o pacote de itens gráficos
public class TestarBotoes {//criando a classe principal

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {//método que inicia o programa
        // TODO code application logic here
        FormularioBotes objetoFormulario = new FormularioBotes();//cria uma variável da classe FormularioBotes()
        objetoFormulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//seta o botão X para fechar o formulario
        objetoFormulario.setSize(450,250);//deixa o tamanho do formulário em um quadrado de 450horizontal e 250 vertical
        objetoFormulario.setLocation(200,300);//posiciona o formulario em 200 no horizontal e 300 vertical, a partir do 0|0 que é o canto superior esquerdo da tela
        objetoFormulario.setVisible(true);//deixa o formulário visível
    }
    
}
