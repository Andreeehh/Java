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
public class Empresa {
    private String nomeEmpresa;
    private String cnpj;
    private String enderecoEmpresa;
    private Pacientes paciente;

    public Empresa(String nomeEmpresa, String cnpj, String enderecoEmpresa, Pacientes paciente) {
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
        this.enderecoEmpresa = enderecoEmpresa;
        this.paciente = paciente;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEnderecoEmpresa() {
        return enderecoEmpresa;
    }

    public void setEnderecoEmpresa(String enderecoEmpresa) {
        this.enderecoEmpresa = enderecoEmpresa;
    }

    public Pacientes getPaciente() {
        return paciente;
    }

    public void setPaciente(Pacientes paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Empresa{" + "\n nomeEmpresa=" + nomeEmpresa + "\n cnpj=" + cnpj + "\n enderecoEmpresa=" + enderecoEmpresa + "\n paciente=" + paciente + '}';
    }

    
    
    
    
}
