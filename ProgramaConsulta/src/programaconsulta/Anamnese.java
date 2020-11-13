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
public class Anamnese {
    private String tipoExame;
    private String dataExame;
    private String antecedentes;
    private String neuro;
    private String visao;
    private String audicao;
    private String equilibrio;
    private String cardioPulmonar;
    private String digestivo;
    private String hormonal;
    private String motor;
    private String infec;
    private String antecedenteCirurgico;
    private String acidentes;
    private String obste;
    private String gine;
    private String antecedenteFamiliar;
    private String habVic;
    private String queixas;
    private String pressaoArt;
    private String freqCard;
    private String apaResp;
    private String apaCirc;
    private String abd;
    private String ossioArt;
    private String sistNerv;
    private String outros;
    private String obs;
    private char apto;

    public Anamnese(String tipoExame, String dataExame, String antecedentes, String neuro, String visao, String audicao, String equilibrio, String cardioPulmonar, String digestivo, String hormonal, String motor, String infec, String antecedenteCirurgico, String acidentes, String obste, String gine, String antecedenteFamiliar, String habVic, String queixas, String pressaoArt, String freqCard, String apaResp, String apaCirc, String abd, String ossioArt, String sistNerv, String outros, String obs, char apto) {
        this.tipoExame = tipoExame;
        this.dataExame = dataExame;
        this.antecedentes = antecedentes;
        this.neuro = neuro;
        this.visao = visao;
        this.audicao = audicao;
        this.equilibrio = equilibrio;
        this.cardioPulmonar = cardioPulmonar;
        this.digestivo = digestivo;
        this.hormonal = hormonal;
        this.motor = motor;
        this.infec = infec;
        this.antecedenteCirurgico = antecedenteCirurgico;
        this.acidentes = acidentes;
        this.obste = obste;
        this.gine = gine;
        this.antecedenteFamiliar = antecedenteFamiliar;
        this.habVic = habVic;
        this.queixas = queixas;
        this.pressaoArt = pressaoArt;
        this.freqCard = freqCard;
        this.apaResp = apaResp;
        this.apaCirc = apaCirc;
        this.abd = abd;
        this.ossioArt = ossioArt;
        this.sistNerv = sistNerv;
        this.outros = outros;
        this.obs = obs;
        this.apto = apto;
    }

    public String getTipoExame() {
        return tipoExame;
    }

    public void setTipoExame(String tipoExame) {
        this.tipoExame = tipoExame;
    }

    public String getDataExame() {
        return dataExame;
    }

    public void setDataExame(String dataExame) {
        this.dataExame = dataExame;
    }

    public String getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(String antecedentes) {
        this.antecedentes = antecedentes;
    }

    public String getNeuro() {
        return neuro;
    }

    public void setNeuro(String neuro) {
        this.neuro = neuro;
    }

    public String getVisao() {
        return visao;
    }

    public void setVisao(String visao) {
        this.visao = visao;
    }

    public String getAudicao() {
        return audicao;
    }

    public void setAudicao(String audicao) {
        this.audicao = audicao;
    }

    public String getEquilibrio() {
        return equilibrio;
    }

    public void setEquilibrio(String equilibrio) {
        this.equilibrio = equilibrio;
    }

    public String getCardioPulmonar() {
        return cardioPulmonar;
    }

    public void setCardioPulmonar(String cardioPulmonar) {
        this.cardioPulmonar = cardioPulmonar;
    }

    public String getDigestivo() {
        return digestivo;
    }

    public void setDigestivo(String digestivo) {
        this.digestivo = digestivo;
    }

    public String getHormonal() {
        return hormonal;
    }

    public void setHormonal(String hormonal) {
        this.hormonal = hormonal;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getInfec() {
        return infec;
    }

    public void setInfec(String infec) {
        this.infec = infec;
    }

    public String getAntecedenteCirurgico() {
        return antecedenteCirurgico;
    }

    public void setAntecedenteCirurgico(String antecedenteCirurgico) {
        this.antecedenteCirurgico = antecedenteCirurgico;
    }

    public String getAcidentes() {
        return acidentes;
    }

    public void setAcidentes(String acidentes) {
        this.acidentes = acidentes;
    }

    public String getObste() {
        return obste;
    }

    public void setObste(String obste) {
        this.obste = obste;
    }

    public String getGine() {
        return gine;
    }

    public void setGine(String gine) {
        this.gine = gine;
    }

    public String getAntecedenteFamiliar() {
        return antecedenteFamiliar;
    }

    public void setAntecedenteFamiliar(String antecedenteFamiliar) {
        this.antecedenteFamiliar = antecedenteFamiliar;
    }

    public String getHabVic() {
        return habVic;
    }

    public void setHabVic(String habVic) {
        this.habVic = habVic;
    }

    public String getQueixas() {
        return queixas;
    }

    public void setQueixas(String queixas) {
        this.queixas = queixas;
    }

    public String getPressaoArt() {
        return pressaoArt;
    }

    public void setPressaoArt(String pressaoArt) {
        this.pressaoArt = pressaoArt;
    }

    public String getFreqCard() {
        return freqCard;
    }

    public void setFreqCard(String freqCard) {
        this.freqCard = freqCard;
    }

    public String getApaResp() {
        return apaResp;
    }

    public void setApaResp(String apaResp) {
        this.apaResp = apaResp;
    }

    public String getApaCirc() {
        return apaCirc;
    }

    public void setApaCirc(String apaCirc) {
        this.apaCirc = apaCirc;
    }

    public String getAbd() {
        return abd;
    }

    public void setAbd(String abd) {
        this.abd = abd;
    }

    public String getOssioArt() {
        return ossioArt;
    }

    public void setOssioArt(String ossioArt) {
        this.ossioArt = ossioArt;
    }

    public String getSistNerv() {
        return sistNerv;
    }

    public void setSistNerv(String sistNerv) {
        this.sistNerv = sistNerv;
    }

    public String getOutros() {
        return outros;
    }

    public void setOutros(String outros) {
        this.outros = outros;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public char getApto() {
        return apto;
    }

    public void setApto(char apto) {
        this.apto = apto;
    }

    @Override
    public String toString() {
        return "Anamnese{" + " tipoExame= " + tipoExame + "\n dataExame= " + dataExame + "\n antecedentes= " + antecedentes + "\n neuro= " + neuro + "\n visao= " + visao + "\n audicao= " + audicao + "\n equilibrio= " + equilibrio + "\n cardioPulmonar= " + cardioPulmonar + "\n digestivo= " + digestivo + "\n hormonal= " + hormonal + "\n motor= " + motor + "\n infec= " + infec + "\n antecedenteCirurgico= " + antecedenteCirurgico + "\n acidentes= " + acidentes + "\n obste= " + obste + "\n gine= " + gine + "\n antecedenteFamiliar= " + antecedenteFamiliar + "\n habVic= " + habVic + "\n queixas= " + queixas + "\n pressaoArt= " + pressaoArt + "\n freqCard= " + freqCard + "\n apaResp= " + apaResp + "\n apaCirc= " + apaCirc + "\n abd= " + abd + "\n ossioArt= " + ossioArt + "\n sistNerv= " + sistNerv + "\n outros= " + outros + "\n obs= " + obs + "\n apto?= " + apto + '}';
    }
    
    
    
}
