/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonusfuncionario;



import java.util.Scanner;


public class BonusFuncionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        Funcionario funcionarioUm = new Funcionario(" "," ",null);
        System.out.println("Digite o Nome do funcionario:");
        funcionarioUm.setNome(info.nextLine());
        System.out.println("Digite o cargo do funcionario:");
        funcionarioUm.setCargo(info.nextLine());
                
        Dependentes dependenteUm = new Dependentes("","",0);
        System.out.println("Digite o Nome do dependente:");
        dependenteUm.setNome(info.nextLine());
        System.out.println("Digite o Sexo do dependente(Masculino ou Feminino):");
        dependenteUm.setSexo(info.nextLine());
        System.out.println("Digite a idade do Dependente:");
        dependenteUm.setIdade(info.nextInt());
        funcionarioUm.setDependentes(dependenteUm);
        System.out.println(funcionarioUm);
        
        
        
        
    }
    
}
