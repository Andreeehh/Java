/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criarlivros;

/**
 *
 * @author andre
 */
public class Livro {
    public String titulo;
    public String autor;
    public int numeroPaginas;
	
    public String exibirLivro(){
        return "dados Livro  " + titulo + " escritor " + autor + "  " + numeroPaginas + " paginas \n";
       }
}
