/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package especificaprofessor;

public class Professor{
    private String nome;
    private int idade;
    public Professor(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public void setNomeProfessor(String nome){
        this.nome = nome;
    }
    public void setIdadeProfessor(int idade){
        if (idade > 18 && idade < 100) {
            this.idade = idade;
        } else {
            this. idade= 0;
        }
    }
    public String getNomeProfessor(){
        return nome;
    }
    public int getIdadeProfessor(){
        return idade;
    }
}
