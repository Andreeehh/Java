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
import java.util.Scanner; 
public class CriarLivros{
	public static void main (String args[])  {
	
	Scanner entradaDados = new Scanner( System.in );
	Livro livroUm = new Livro();
	
	System.out.print( "Digite o titulo do livro:  "); 
	livroUm.titulo = entradaDados.nextLine(); 

	System.out.print( "Digite o nome do autor:  "); 
	livroUm.autor = entradaDados.nextLine(); 
	
	System.out.print( "Digite o numero de paginas:  "); 
	livroUm.numeroPaginas = entradaDados.nextInt();
 
	System.out.println(livroUm.exibirLivro());
        

}
}
    

