/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testarradiobutton;
import javax.swing.JFrame;//importa classe jframe, 
public class TestarRadioButton {//classe principal
    
    public static void main(String[] args) {//codigo executavel
      FormularioRadioButton objetoRadioButton = new FormularioRadioButton();//cria objeto de classe formularioRadioButton
      objetoRadioButton.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );//sair na opção X do formulário
      objetoRadioButton.setSize( 350, 150 ); //tamanho do formulário
      objetoRadioButton.setVisible( true ); //formulário visível
 
        
    }
}
