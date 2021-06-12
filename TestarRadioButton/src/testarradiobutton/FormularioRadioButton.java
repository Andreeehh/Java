/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testarradiobutton;

import java.awt.FlowLayout;//importa classe layout
import java.awt.Font;//importa classe de fontes
import java.awt.event.ItemListener;//importa classe de ouvidor de eventos de item
import java.awt.event.ItemEvent;//importa classe de item evento
import javax.swing.JFrame;//importa classe de formulário
import javax.swing.JTextField;//importa classe de campo de texto
import javax.swing.JRadioButton;//importa classe de radio button
import javax.swing.ButtonGroup;//importa classe q agrupa botões

public class FormularioRadioButton extends JFrame  {//classe FormulárioRadioButton que herda classe Jframe
  
   private JTextField textField; //cria variável tipo campo de texto
   private Font simplesFont; //cria variável tipo de fonte
   private Font negritoFont; //cria variável tipo de fonte
   private Font italicoFont; //cria variável tipo de fonte
   private Font negritoItalico; //cria variável tipo de fonte
   private JRadioButton simplesJRadioButton; //cria variável de tipo radiobutton
   private JRadioButton negritoJRadioButton; //cria variável de tipo radiobutton
   private JRadioButton italicoJRadioButton; //cria variável de tipo radiobutton
   private JRadioButton negritoItalicoJRadioButton;//cria variável de tipo radiobutton 
   private ButtonGroup grupoRadio; //cria variável de tipo agrupador de botões

      public FormularioRadioButton()//classe formulario de botões
   {
      super( "RadioButton Teste" );//nome do formulário por herança
      setLayout( new FlowLayout() ); // tipo de formulário

      textField = new JTextField( "Ver a alteração do estilo da fonte", 25 );//Texto com tamanho 25
      add( textField ); //adiciona a caixa de texto no form

      // criar radio buttons
      simplesJRadioButton = new JRadioButton( "simples", true );// criar radio buttons
      negritoJRadioButton = new JRadioButton( "Negrito", false );// criar radio buttons
      italicoJRadioButton = new JRadioButton( "Italico", false );// criar radio buttons
      negritoItalicoJRadioButton = new JRadioButton( "Negrito/Italico", false );// criar radio buttons
      add( simplesJRadioButton ); //adiciona radio button
      add( negritoJRadioButton ); //adiciona radio button
      add( italicoJRadioButton ); //adiciona radio button
      add( negritoItalicoJRadioButton ); //adiciona radio button
      
      grupoRadio = new ButtonGroup(); //cria agrupador de botões
      grupoRadio.add( simplesJRadioButton ); //adiciona radio button ao agrupador
      grupoRadio.add( negritoJRadioButton ); //adiciona radio button ao agrupador
      grupoRadio.add( italicoJRadioButton ); //adiciona radio button ao agrupador
      grupoRadio.add( negritoItalicoJRadioButton );//adiciona radio button ao agrupador 

      simplesFont = new Font( "Serif", Font.PLAIN, 14 );//seta tipo de fonte
      negritoFont = new Font( "Serif", Font.BOLD, 14 );//seta tipo de fonte
      italicoFont = new Font( "Serif", Font.ITALIC, 14 );//seta tipo de fonte
      negritoItalico = new Font( "Serif", Font.BOLD + Font.ITALIC, 14 );//seta tipo de fonte
      textField.setFont( simplesFont ); //seta fonte da caixa de texto com tipo passado por parametro
      
      
      simplesJRadioButton.addItemListener( 
         new RadioButtonHandler( simplesFont ) );//adiciona ouvidor que recebe o tipo de fonte
      negritoJRadioButton.addItemListener(
         new RadioButtonHandler( negritoFont ) );//adiciona ouvidor que recebe o tipo de fonte
      italicoJRadioButton.addItemListener( 
         new RadioButtonHandler( italicoFont ) );//adiciona ouvidor que recebe o tipo de fonte
      negritoItalicoJRadioButton.addItemListener( 
         new RadioButtonHandler( negritoItalico ) );//adiciona ouvidor que recebe o tipo de fonte
   } 

   
   private class RadioButtonHandler implements ItemListener //classe implementando ouvidores
   {
      private Font fonte; //cria variável de tipo font

      public RadioButtonHandler( Font f )//função passando fonte por parametro
      {
         fonte = f; //retorna fonte recebe o parametro
      } 
      public void itemStateChanged( ItemEvent event )//função que recebe evento ouvidor
      {
         textField.setFont( fonte ); //seta a fonte da caixa de texto para fonte recebida por parametro
      } 
   } 
    }


