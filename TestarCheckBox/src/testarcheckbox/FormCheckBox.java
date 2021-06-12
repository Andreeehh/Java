/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testarcheckbox;

import java.awt.FlowLayout;//importa a classe de Layout
import java.awt.Font;//Importa a classe Font
import java.awt.event.ItemListener;//importa a classe de ouvidor de item
import java.awt.event.ItemEvent;//Importa a classe de evento de item
import javax.swing.JFrame;//importa a classe frame
import javax.swing.JTextField;//importa a classe de campo de texto
import javax.swing.JCheckBox;//importa a classe CheckBox


public class FormCheckBox extends JFrame {//classe CheckBox que herda propriedades da classe JFrame
     private JTextField caixatexto; //cria variavel do tipo JTextField
   private JCheckBox negritoJCheckBox; //cria variavel do tipo CheckBox
   private JCheckBox italicoJCheckBox; //cria variavel do tipo CheckBox 

   
   public FormCheckBox()//propriedades da classe FormCheckBox
   {
      super( "JCheckBox Teste" );//passa por parametro a classe herdada o nome do formulário
      setLayout( new FlowLayout() ); //seta o layout com a Classe FlowLayout

      caixatexto = new JTextField( "Ver a alteração do estilo da fonte", 20 );//Passa por parametro o texto dentro do TextField e seu tamanho
      caixatexto.setFont( new Font( "Serif", Font.PLAIN, 14 ) );//seta o tipo da fonte da caixa de texto e seu tamanho
      add( caixatexto ); //adiciona a caixa de texto ao formulário

      negritoJCheckBox = new JCheckBox( "Negrito" );//da o nome ao checkbox  
      italicoJCheckBox = new JCheckBox( "Italico" );//da o nome ao checkbox  
      add( negritoJCheckBox );//adiciona o checkbox ao formulário   
      add( italicoJCheckBox );//adiciona o checkbox ao formulário  

       
      CheckBoxHandler handler = new CheckBoxHandler();//cria um handler do tipo Classe CheckBoxHandler
      negritoJCheckBox.addItemListener( handler );//adiciona um evento ouvidor passando o handler por parametro
      italicoJCheckBox.addItemListener( handler );//adiciona um evento ouvidor passando o handler por parametro
   } 

      private class CheckBoxHandler implements ItemListener //classe CheckBoxHandler que implementa a classe ItemListener
   {
      
      public void itemStateChanged( ItemEvent event )//função da classe Passando um handler por parametro
      {
         Font font = null; //seta a fonte para nulo

         
         if ( negritoJCheckBox.isSelected() && italicoJCheckBox.isSelected() )//condição de ambos negrito e italico selecionados
            font = new Font( "Serif", Font.BOLD + Font.ITALIC, 14 );////mudando a fonte para negrito + italico
         else if ( negritoJCheckBox.isSelected() )//condição de negrito selecionado
            font = new Font( "Serif", Font.BOLD, 14 );//seta fonte em negrito
         else if ( italicoJCheckBox.isSelected() )//condição de italico selecionado
            font = new Font( "Serif", Font.ITALIC, 14 );//seta fonte para italico
         else//nenhuma das condições acima
            font = new Font( "Serif", Font.PLAIN, 14 );//deixa a fonte do jeito que estava antes

         caixatexto.setFont( font ); //seta a fonte da caixa de texto com a variável que sofreu alterações acima 
      } 
   } 
}