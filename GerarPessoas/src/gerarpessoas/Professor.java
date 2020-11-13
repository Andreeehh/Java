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
class Professor extends Pessoa {
    private String disciplina;

    public Professor(String disciplina, String nome, int idade) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Professor{" + "disciplina=" + disciplina + '}'+ super.toString();
    }
    
    
}
