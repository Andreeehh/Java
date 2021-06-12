/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testarcaixatexto;

/**
 *
 * @author andre
 */
import javax.swing.JFrame;//importa pacote JFrame
public class TestarCaixaTexto {//classe com main que executa o código

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//classe que executa o código
        // TODO code application logic here
        
        FormularioCaixaTexto objetoFormCaixas = new FormularioCaixaTexto();//cria objetoFormCaixas do tipo FormularioCaixaTexto
        objetoFormCaixas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//seta a operação default de fechar na propriedade EXIT_ON_CLOSE do JFrame, que fecha o programa ao clicar no X
        objetoFormCaixas.setSize(350,100);//seta o tamanho do formulário com os valores horizontais e verticais passados por parametro, respectivamente
        objetoFormCaixas.setVisible(true);//deixa o formulario visivel
        objetoFormCaixas.setLocation(200,300);//seta a localização do formulário com os valores horizontais e verticais passados por parametro, respectivamente
    }
    
}
