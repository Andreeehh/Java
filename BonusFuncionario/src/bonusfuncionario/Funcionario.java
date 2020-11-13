/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonusfuncionario;

/**
 *
 * @author andre
 */
public class Funcionario {
    private String nome;
    private String cargo;
    private Dependentes dependentes;

    public Funcionario(String nome, String cargo, Dependentes dependentes) {
        this.nome = nome;
        this.cargo = cargo;
        this.dependentes = dependentes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    

    public Dependentes getDependentes() {
        return dependentes;
    }

    public void setDependentes(Dependentes dependentes) {
        this.dependentes = dependentes;
    }

    
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", cargo=" + cargo +  ", dependentes=" + dependentes + '}';
    }

    
   
    
    
}
