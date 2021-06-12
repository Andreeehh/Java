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
import java.awt.FlowLayout;//importa a classe de Layout
import java.awt.event.ActionListener;//importa a classe de ouvidor de evento
import java.awt.event.ActionEvent;//importa a classe de ação de evento
import javax.swing.JFrame;//importa a classe frame
import javax.swing.JTextField;//importa a classe de campo de texto
import javax.swing.JPasswordField;//importa a classe de campo de senha
import javax.swing.JOptionPane;//importa a classe de opções de mensagens

public class FormularioCaixaTexto extends JFrame {//classe de formulario herda propriedades do JFrame
    private JTextField caixaTextoUm;//caixa de texto
    private JTextField caixaTextoDois;//caixa de texto
    private JTextField caixaTextoTres;//caixa de texto
    private JPasswordField caixaSenha;//caixa de senha
    
    public FormularioCaixaTexto(){//propriedades da classe FormularioCaixaTexto
        super("Testando JTextField e o JPasswordField");//passa por herança o nome do Formulário
        setLayout (new FlowLayout());//seta o layout com a classe FlowLayout
        
        caixaTextoUm = new JTextField (15);//seta o comprimento do campo de texto
        add(caixaTextoUm);//adiciona o campo de texto
        
        caixaTextoDois = new JTextField ("Digite aqui");//preenche o campo de texto com uma mensagem passada por parametro
        add(caixaTextoDois);//adiciona o campo de texto
        
        caixaTextoTres = new JTextField ("texto fixo",10);//prenche o campo de texto com uma mensagem pessada por parametro e aumenta esse campo em 10
        caixaTextoTres.setEditable(false);//não permite a edição do campo de texto
        add(caixaTextoTres);//adiciona o campo de texto
        
        caixaSenha = new JPasswordField(8);//adiciona um campo de texto com propriedades de senha, que cobrem as palavras digitadas, com tamanho 8
        add(caixaSenha);//adiciona o campo de senha
        
        TextFieldHandler handler = new TextFieldHandler();//cria uma variavel com propriedades da classe TextFieldHandler
        caixaTextoUm.addActionListener(handler);//adiciona um ouvidor de evento passando por parametro o handler
        caixaTextoDois.addActionListener(handler);//adiciona um ouvidor de evento passando por parametro o handler
        caixaTextoTres.addActionListener(handler);//adiciona um ouvidor de evento passando por parametro o handler
        caixaSenha.addActionListener(handler);//adiciona um ouvidor de evento passando por parametro o handler
        
        
    }
    
    private class TextFieldHandler implements ActionListener{//cria a classe TextFieldHandler que implementa atributos da ActionListener
        public void actionPerformed(ActionEvent event){//cria uma função que passa por parametro uma variavel de classe ActionEvente
            String conteudotexto = "";//seta a variavel conteudotexto com uma string vazia
            
            if(event.getSource()== caixaTextoUm)//compara se o evento passado por parametro era da caixaTextoUm
                conteudotexto = String.format("caixa de texto 1: %s",event.getActionCommand());//concatena uma string digitada por parametro com a string recebida do evento, e a adiciona na variavel conteudotexto
            
            else if (event.getSource()== caixaTextoDois)//compara se o evento passado por parametro era da caixaTextoDois
                conteudotexto = String.format("caixa de texto 2: %s",event.getActionCommand());//concatena uma string digitada por parametro com a string recebida do evento, e a adiciona na variavel conteudotexto
            
            else if (event.getSource()== caixaTextoTres)//compara se o evento passado por parametro era da caixaTextoTres
                conteudotexto = String.format("caixa de texto 3: %s",event.getActionCommand());//concatena uma string digitada por parametro com a string recebida do evento, e a adiciona na variavel conteudotexto
            
            else if (event.getSource()== caixaSenha)//compara se o evento passado por parametro era da caixaSenha
                conteudotexto = String.format("caixa de senha: %s",event.getActionCommand());//concatena uma string digitada por parametro com a string recebida do evento, e a adiciona na variavel conteudotexto
            
            JOptionPane.showMessageDialog(null,conteudotexto);//aparece uma mensagem na tela com a string conteudotexto
        }
    }
}
