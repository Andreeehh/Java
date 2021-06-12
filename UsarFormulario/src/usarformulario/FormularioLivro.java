/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usarformulario;

/**
 *
 * @author andre
 */
import java.awt.*;
public class FormularioLivro extends Frame {
protected Dimension dQuadro, dRotulo, dCaixaTexto, dBotao;
protected Button bCadastrar, bSair;
protected TextField tfTitulo, tfAutor;
protected Label lTitulo, lAutor;

public FormularioLivro(){
    Dimension dQuadro = new Dimension(290,200);
    Dimension dRotulo = new Dimension(45,25);
    Dimension dCaixaTexto = new Dimension(180,25);
    Dimension dBotao = new Dimension(100,25);
    setTitle("Cadastrar Livro");
    setResizable(false);
    setSize(dQuadro);
    setLocation(400,200);
    setLayout(null);
    lTitulo = new Label("Titulo");
    lTitulo.setSize(dRotulo);
    lTitulo.setLocation(25,50);
    lAutor = new Label("Autor");
    lAutor.setSize(dRotulo);
    lAutor.setLocation(25,100);
    tfTitulo = new TextField();
    tfTitulo.setSize(dCaixaTexto);
    tfTitulo.setLocation(80,50);
    tfAutor = new TextField();
    tfAutor.setSize(dCaixaTexto);
    tfAutor.setLocation(80,100);
    bCadastrar = new Button("Cadastrar");
    bCadastrar.setSize(dBotao);
    bCadastrar.setLocation(25,150);
    bSair = new Button("Sair");
    bSair.setSize(dBotao);
    bSair.setLocation(130,150);
    add(lTitulo);
    add(lAutor);
    add(tfTitulo);
    add(tfAutor);
    add(bCadastrar);
    add(bSair);
    }
}
    

