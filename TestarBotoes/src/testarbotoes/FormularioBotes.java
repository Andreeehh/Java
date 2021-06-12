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

import java.awt.event.ActionListener;//importa a classe de ouvidor de evento
import java.awt.event.ActionEvent;//importa a classe de ação de evento
import javax.swing.JButton;//importa a classe que tem as propriedades de botão
import java.awt.FlowLayout;//importa a classe de Layout
import javax.swing.JFrame;//importa a classe frame
import javax.swing.Icon;//importa a classe que tem as propriedas de configurar icones
import javax.swing.ImageIcon;//importa a classe que tem as propriedas de configurar as imagens
import javax.swing.JOptionPane;//importa a classe que tem propriedades de aparecer caixas de texto

public class FormularioBotes extends JFrame {//classe que tera os botões dos formulários e que herda propriedades da classe JFRAME
    private JButton simplesJbutton; // botão com texto
    private JButton elaboradoJButton; //botão com ícone
    private JButton correrJButton;//botão com ícone correndo
    
    //construtor
    public FormularioBotes(){//classe com os botões do formulário
        super("Testando botões");//adiciona o nome ao formulário por herança
        setLayout(new FlowLayout()); //Configurar o frame Layout
        
        simplesJbutton = new JButton("Botão Simples");//adiciona ao botão com texto nome Botão Simples
        add(simplesJbutton);//adiciona o botão ao formulário
        
        Icon bug1 = new ImageIcon (getClass().getResource("bug1.gif"));//adiciona o caminho da imagem ao ícone
        Icon bug2 = new ImageIcon (getClass().getResource("bug2.gif"));//adiciona o caminho da imagem ao ícone
        Icon correr = new ImageIcon (getClass().getResource("correr.gif"));//adiciona o caminho da imagem ao ícone
        elaboradoJButton = new JButton ("Botão Elaborado", bug1);//adiciona nome e o ícone ao botão
        elaboradoJButton.setRolloverIcon(bug2);//adiciona o ícone bug2 ao botão quando o mouse estiver por cima dele
        add(elaboradoJButton);//adiciona o botão ao formulário
        
        correrJButton = new JButton ("Botão Correr", correr);//adiciona o 
        add(correrJButton);//adiciona o botão ao formulário
        
        ButtonHandler handler = new ButtonHandler();//adiciona um handler de tipo classe ButtonHandler
        elaboradoJButton.addActionListener(handler);//adiciona um ouvidor de ação, que exercutara o handler passado por parametro, ao botão
        simplesJbutton.addActionListener(handler);//adiciona um ouvidor de ação, que exercutara o handler passado por parametro, ao botão
        correrJButton.addActionListener(handler);//adiciona um ouvidor de ação, que exercutara o handler passado por parametro, ao botão
        
    }
    
    private class ButtonHandler implements ActionListener{//cria a classe ButtonHandler que implementa a classe importada ActionListener, que é uma ouvidora de ação, aguarda uma ação
        public void actionPerformed(ActionEvent evento){//função de tipo void, que não retorna nada e recebe por parametro um Evento ouvidor,
            JOptionPane.showMessageDialog(FormularioBotes.this, String.format("Voce pressionou : %s", evento.getActionCommand()));//executa uma mensagem na tela pelo JOption pane, do formulário, que exibe a String "Voce Pressionou", mais a propriedade do evento(passado por parâmetro).GetActionComand(), que passa o comando pressionado
        }
    }
}
