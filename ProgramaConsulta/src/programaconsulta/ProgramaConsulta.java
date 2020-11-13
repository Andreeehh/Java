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
import java.util.Scanner;
public class ProgramaConsulta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        Empresa empresaUm = new Empresa("","","",null);
        System.out.println("Digite o Nome da empresa:");
        empresaUm.setNomeEmpresa(info.nextLine());
        System.out.println("Digite o CPNJ da empresa");
        empresaUm.setCnpj(info.nextLine());
        System.out.println("Digite o Endereco da Empresa");
        empresaUm.setEnderecoEmpresa(info.nextLine());
        
        Pacientes pacienteUm = new Pacientes(null,"","","","","","","","","","","");
        System.out.println("Digite nome paciente");
        pacienteUm.setNome(info.nextLine());
        System.out.println("Digite data Nasc");
        pacienteUm.setDataNasc(info.nextLine());
        System.out.println("Digite sexo do Paciente");
        pacienteUm.setSexo(info.nextLine());
        System.out.println("Digite cor do Paciente");
        pacienteUm.setCor(info.nextLine());
        System.out.println("Digite estado civil do Paciente");
        pacienteUm.setEstadoCivil(info.nextLine());
        System.out.println("Digite filiacao do Paciente");
        pacienteUm.setFiliacao(info.nextLine());
        System.out.println("Digite a Naturalidade do Paciente");
        pacienteUm.setNaturalidade(info.nextLine());
        System.out.println("Digite o RG do Paciente");
        pacienteUm.setRG(info.nextLine());
        System.out.println("Digite endereco do Paciente");
        pacienteUm.setEndereco(info.nextLine());
        System.out.println("Digite a cidade do Paciente");
        pacienteUm.setCidade(info.nextLine());
        System.out.println("Digite o cargo do Paciente");
        pacienteUm.setCargo(info.nextLine());
        
        Anamnese exameUm = new Anamnese("","","","","","","","","","","","","","","","","","","","","","","","","","","","",'A');
        System.out.println("Tipo Exame");
        exameUm.setTipoExame(info.nextLine());
        
        System.out.println("Visao (s/n)");
        exameUm.setVisao(info.nextLine());
        if(exameUm.getVisao().equals("s") ){
            System.out.println("Descreva: ");
            exameUm.setVisao(info.nextLine());
        }
       
        System.out.println("Audicao (s/n)");
        exameUm.setAudicao(info.nextLine());
        if(exameUm.getAudicao().equals("s") ){
            System.out.println("Descreva: ");
            exameUm.setAudicao(info.nextLine());
        }
       
        System.out.println("Neurologico (s/n)");
        exameUm.setNeuro(info.nextLine());
        if(exameUm.getNeuro().equals("s") || exameUm.getNeuro().equals("S") ){
            System.out.println("Descreva: ");
            exameUm.setNeuro(info.nextLine());
        }
       
        System.out.println("Equilibrio (s/n)");
        exameUm.setEquilibrio(info.nextLine());
        if(exameUm.getEquilibrio().equals("s") ){
            System.out.println("Descreva: ");
            exameUm.setEquilibrio(info.nextLine());
        }
        System.out.println("Cardiopulmonar (s/n)");
        exameUm.setCardioPulmonar(info.nextLine());
        if(exameUm.getCardioPulmonar().equals("s") ){
            System.out.println("Descreva: ");
            exameUm.setCardioPulmonar(info.nextLine());
        }
        System.out.println("Digestivo (s/n)");
        exameUm.setDigestivo(info.nextLine());
        if(exameUm.getDigestivo().equals("s") ){
            System.out.println("Descreva: ");
            exameUm.setDigestivo(info.nextLine());
        }
        System.out.println("Hormonal (s/n)");
        exameUm.setHormonal(info.nextLine());
        if(exameUm.getHormonal().equals("s") ){
            System.out.println("Descreva: ");
            exameUm.setHormonal(info.nextLine());
        }
        System.out.println("Motor (s/n)");
        exameUm.setMotor(info.nextLine());
        if(exameUm.getMotor().equals("s") ){
            System.out.println("Descreva: ");
            exameUm.setMotor(info.nextLine());
        }
        System.out.println("Infeccioso (s/n)");
        exameUm.setInfec(info.nextLine());
        if(exameUm.getInfec().equals("s") ){
            System.out.println("Descreva: ");
            exameUm.setInfec(info.nextLine());
        }
        System.out.println("Antecedentes cirurgicos (s/n)");
        exameUm.setAntecedenteCirurgico(info.nextLine());
        if(exameUm.getAntecedenteCirurgico().equals("s") ){
            System.out.println("Descreva: ");
            exameUm.setAntecedenteCirurgico(info.nextLine());
        }
        System.out.println("Acidentes (s/n)");
        exameUm.setAcidentes(info.nextLine());
        if(exameUm.getAcidentes().equals("s") ){
            System.out.println("Descreva: ");
            exameUm.setAcidentes(info.nextLine());
        }
        if(pacienteUm.getSexo().equals("feminino")){
            System.out.println("Obstetrico (s/n)");
            exameUm.setObste(info.nextLine());
            if(exameUm.getObste().equals("s") ){
                System.out.println("Descreva: ");
                exameUm.setObste(info.nextLine());
            }
            System.out.println("Ginecologico (s/n)");
            exameUm.setGine(info.nextLine());
            if(exameUm.getGine().equals("s") ){
                System.out.println("Descreva: ");
                exameUm.setGine(info.nextLine());
            }
        }else{
            exameUm.setObste("n");
            exameUm.setGine("n");
        }
        
        System.out.println("Antecedente Familiar (s/n)");
        exameUm.setAntecedenteFamiliar(info.nextLine());
        if(exameUm.getAntecedenteFamiliar().equals("s") ){
            System.out.println("Descreva: ");
            exameUm.setAntecedenteFamiliar(info.nextLine());
        }
        System.out.println("Habitos e Vicios (s/n)");
        exameUm.setHabVic(info.nextLine());
        if(exameUm.getHabVic().equals("s") ){
            System.out.println("Descreva: ");
            exameUm.setHabVic(info.nextLine());
        }
        System.out.println("Queixas? (s/n)");
        exameUm.setQueixas(info.nextLine());
        if(exameUm.getQueixas().equals("s") ){
            System.out.println("Descreva: ");
            exameUm.setQueixas(info.nextLine());
        }
        System.out.println("Pressão arterial:");
        exameUm.setPressaoArt(info.nextLine());
        
        System.out.println("Frequencia Cardiaca");
        exameUm.setFreqCard(info.nextLine());
        
        System.out.println("Aparelho respiratorio");
        exameUm.setApaResp(info.nextLine());
        
        System.out.println("Aparelho Circulatorio");
        exameUm.setApaCirc(info.nextLine());
        
        System.out.println("Abdomen ");
        exameUm.setAbd(info.nextLine());
        
        System.out.println("OssioArticular ");
        exameUm.setOssioArt(info.nextLine());
        
        System.out.println("Sistema Nervoso ");
        exameUm.setSistNerv(info.nextLine());
       
        System.out.println("Outros ");
        exameUm.setOutros(info.nextLine());
       
        System.out.println("Observacoes ");
        exameUm.setObs(info.nextLine());
        
        System.out.println("Paciente APTO? (s/n)");
        exameUm.setApto(info.next().charAt(0));
        
        empresaUm.setPaciente(pacienteUm);
        pacienteUm.setAnamnese(exameUm);
        
        System.out.println(empresaUm);
        
        
    }
    
}
