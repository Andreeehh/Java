
package hospital;

class Paciente {
  private String nome;
  private String tipoEnfermidade;

  public Paciente(String nome, String tipoEnfermidade){
    this.nome = nome;
    this.tipoEnfermidade = tipoEnfermidade;
  }

  public void setTipoEnfermidade(String tipoEnfermidade){
    this.tipoEnfermidade = tipoEnfermidade;
  }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getTipoEnfermidade() {
        return tipoEnfermidade;
    }
    

  public String relatorioPaciente(){
    return "individuo " + getNome() +  "  doenca  " + getTipoEnfermidade() + "\n" ;
}
}