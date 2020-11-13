/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaconsulta;

/**
 *
 * @author andre
 */
public class Pacientes {
    private Anamnese anamnese;
    private String nome;
    private String dataNasc;
    private String sexo;
    private String cor;
    private String estadoCivil;
    private String filiacao;
    private String naturalidade;
    private String RG;
    private String endereco;
    private String cidade;
    private String cargo;

    public Pacientes(Anamnese anamnese, String nome, String dataNasc, String sexo, String cor, String estadoCivil, String filiação, String naturalidade, String RG, String endereco, String cidade, String cargo) {
        this.anamnese = anamnese;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
        this.cor = cor;
        this.estadoCivil = estadoCivil;
        this.filiacao = filiacao;
        this.naturalidade = naturalidade;
        this.RG = RG;
        this.endereco = endereco;
        this.cidade = cidade;
        this.cargo = cargo;
    }

    public Anamnese getAnamnese() {
        return anamnese;
    }

    public void setAnamnese(Anamnese anamnese) {
        this.anamnese = anamnese;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getFiliação() {
        return filiacao;
    }

    public void setFiliacao(String filiação) {
        this.filiacao = filiacao;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Pacientes{"  + "\n nome=" + nome + "\n dataNasc=" + dataNasc + "\n sexo=" + sexo + "\n cor=" + cor + "\n estadoCivil=" + estadoCivil + "\n filiacao=" + filiacao + "\n naturalidade=" + naturalidade + "\n RG=" + RG + "\n endereco=" + endereco + "\n cidade=" + cidade + "\n cargo=" + cargo + "\n anamnese=" + anamnese + '}';
    }
    
    
}
