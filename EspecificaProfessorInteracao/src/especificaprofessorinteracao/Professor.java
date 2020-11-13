/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package especificaprofessorinteracao;

class Professor{
    private String nome;
    private int idade;
    private String cidade;
    public Professor(String nome, int idade, String cidade)
    {
    this.nome = nome;
    this.idade = idade;
    this.cidade = cidade;
    }
    public void setNomeProfessor(String nome)
    {
            this.nome = nome;
    } 
    public void setIdadeProfessor(int idade)
    {
            if (idade > 1 && idade < 100)  {  
                            this.idade = idade;  
                    } else {  
                    this. idade= 0;  
                   } 
    }
    public void setCidadeProfessor(String cidade)
    {
            this.cidade = cidade;
    }  


    public String getNomeProfessor()
    {
    return nome;
    }
    public int getIdadeProfessor()
    {
    return idade;
    }
    public String getCidadeProfessor()
    {
    return cidade;
    }
}