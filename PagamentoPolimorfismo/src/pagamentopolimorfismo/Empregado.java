/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagamentopolimorfismo;

/**
 *
 * @author andre
 */
public abstract class Empregado {
    private String nome;

    public Empregado(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Empregado{" + "nome=" + nome + '}';
    }
    //método abstrato sobrescrito pelas subclasses
    public abstract double salarios();//nenhuma implementação aqui
}
