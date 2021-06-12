/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testarcheckbox;

/**
 *
 * @author andre
 */
import javax.swing.JFrame;//importa pacote JFrame
public class TestarCheckBox extends JFrame {//classe com main que executa o código

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//classe que executa o código
        // TODO code application logic here
        
       
        FormCheckBox objcheckBox = new FormCheckBox(); //cria objcheckBox do tipo FormCheckBox
        objcheckBox.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );//seta a operação default de fechar na propriedade EXIT_ON_CLOSE do JFrame, que fecha o programa ao clicar no X
        objcheckBox.setSize( 275, 100 ); //seta o tamanho do formulário com os valores horizontais e verticais passados por parametro, respectivamente
        objcheckBox.setVisible( true ); //recebe um booleano que deixa o formulário visível
        objcheckBox.setLocation(200, 300);//seta a posição do formulário com os valores horizontais e verticais passados por parametro, respectivamente

    }
    
}
