/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerarpessoas;

/**
 *
 * @author andre
 */
public class GerarPessoas {

    public static void main(String[] args) {
        
        Pessoa pessoaUm = new Pessoa("Marta",62);
        System.out.println(pessoaUm);
        
        Aluno alunoUm = new Aluno(10,"Mario",21);
        System.out.println(alunoUm);
        alunoUm.setIdade(23); System.out.println("nova idade do individuo " + alunoUm.getIdade());
        
    }
}
