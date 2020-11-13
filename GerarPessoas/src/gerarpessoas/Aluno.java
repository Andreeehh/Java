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
class Aluno extends Pessoa {
    private double notaFinal;
    
    public Aluno(double notaFinal,  String nome, int idade) {
        super(nome, idade);
        this.notaFinal = notaFinal;
    }
    
    
    public double getNotaFinal() {
        return notaFinal;
    }
    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }
    @Override
    public String toString() {
        return "Aluno{" + " notaFinal= " + notaFinal + '}' + super.toString();
    }
}