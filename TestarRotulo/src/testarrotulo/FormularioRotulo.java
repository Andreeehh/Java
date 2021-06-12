/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testarrotulo;

/**
 *
 * @author andre
 */
import java.awt.FlowLayout;//importa a classe de Layout
import javax.swing.JFrame;//importa a classe frame
import javax.swing.JLabel;//importa a classe de JLabel, com as propriedades do rótulo
import javax.swing.SwingConstants;//importa a classe que tem propriedades de posicionar o texto
import javax.swing.Icon;//importa a classe que tem as propriedas de configurar icones
import javax.swing.ImageIcon;//importa a classe que tem as propriedas de configurar as imagens

public class FormularioRotulo extends JFrame{//classe FormularioRotulo que herda propriedades do JFrame
    private JLabel rotulo1;//cria rótulo do tipo JLabel
    private JLabel rotulo2;//cria rótulo do tipo JLabel
    private JLabel rotulo3;//cria rótulo do tipo JLabel
    private JLabel rotulo4;//cria rótulo do tipo JLabel
    
    public FormularioRotulo(){//classe com as propriedades do FormularioRotulo
        super("Testando JLabel");//Da o nome ao formulário por parametro a herança da classe JFrame
        setLayout (new FlowLayout());//seta o layout com um objeto novo de classe FlowLayout passado por parametro
        setLocation(200,400);//posiciona o formulario com os parametros passados
        
        rotulo1 = new JLabel ("Rótulo com texto");//atribui um nome ao rótulo por parametro
        rotulo1.setToolTipText("Este é o rótulo 1");//atribui um texto de dica ao rótulo, que é mostrado quando o mouse passa e para por cima dele
        add(rotulo1);//adiciona o rotulo ao formulário
        
        Icon bug = new ImageIcon(getClass().getResource("bug1.gif"));//atribui a variável bug, de tipo Icon, o caminho da imagem ao qual ela tera
        
        rotulo2 = new JLabel ("Rótulo com texto e icone", bug, SwingConstants.LEFT);//atribui um nome ao rotulo, e a imagem bug posicionada a esquerda pela SwingConstants.LEFT
        rotulo2.setToolTipText("Este é o rótulo 2");//atribui um texto de dica ao rótulo, que é mostrado quando o mouse passa e para por cima dele
        add(rotulo2);//adiciona o rotulo ao formulário
        
        rotulo3 = new JLabel ("Rótulo com icone e texto na parte inferior");//atribui um nome ao rótulo por parametro
        rotulo3.setIcon (bug);//atribui um icone passado por parametro ao rótulo
        rotulo3.setHorizontalTextPosition(SwingConstants.CENTER);//seta a posição horizontal do texto ao centro do icone
        rotulo3.setVerticalTextPosition(SwingConstants.BOTTOM);//seta a posição vertical do texto a baixo do icone
        rotulo3.setToolTipText("Este é o rótulo 3");//atribui um texto de dica ao rótulo, que é mostrado quando o mouse passa e para por cima dele
        add(rotulo3);//adiciona o rotulo ao formulário
        
        Icon bug2 = new ImageIcon(getClass().getResource("bug2.gif"));//atribui a variável bug, de tipo Icon, o caminho da imagem ao qual ela tera
        
        rotulo4 = new JLabel ("Rótulo com icone2 e texto na parte superior");//atribui um nome ao rótulo por parametro
        rotulo4.setIcon (bug2);//atribui um icone passado por parametro ao rótulo
        rotulo4.setHorizontalTextPosition(SwingConstants.CENTER);//seta a posição horizontal do texto ao centro do icone
        rotulo4.setVerticalTextPosition(SwingConstants.TOP);//seta a posição vertical do texto a baixo do icone
        rotulo4.setToolTipText("Este é o rótulo 4");//atribui um texto de dica ao rótulo, que é mostrado quando o mouse passa e para por cima dele
        add(rotulo4);//adiciona o rotulo ao formulário
    }
}
