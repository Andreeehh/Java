/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaenderecos;

/**
 *
 * @author andre
 */
class Individuo { 
    private Endereco endereco; 
    private String nome;
    private String cpf;

    public Individuo(Endereco endereco, String nome, String cpf) {
        this.endereco = endereco;
        this.nome = nome;
        this.cpf = cpf;
    }
    

public String getNome() {
return nome;
}
public void setNome(String nome) {
this.nome = nome;
}
public String getCpf() {
return cpf;
}
public void setCpf(String cpf) {
this.cpf = cpf;
}
public Endereco getEndereco() {
return endereco;
} 
public void setEndereco(Endereco endereco) {
this.endereco = endereco;
} 
public String toString(){ 
    return "\nnome " + nome + "\ndoc " + cpf + "\nlogradouro " + endereco;
}
}