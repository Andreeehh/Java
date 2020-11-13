
package especificaprofessorinteracao;

import java.util.Scanner;
public class EspecificaProfessorInteracao {    
    
    public static void main(String[] args) {
        
        Professor professorUm = new Professor("",0,"");
        Scanner entrada = new Scanner(System.in);

        System.out.println ("Digite o nome do professor: ");
        professorUm.setNomeProfessor(entrada.nextLine());
        System.out.println ("Digite a cidade do professor: ");
        professorUm.setCidadeProfessor(entrada.nextLine());
        System.out.println ("Digite a idade do professor: ");
        professorUm.setIdadeProfessor(entrada.nextInt());
        System.out.println ("nome do professor: " + professorUm.getNomeProfessor());
        System.out.println ("Cidade do prof: " + professorUm.getCidadeProfessor());
        System.out.println ("idade do prof: " + professorUm.getIdadeProfessor());
        
  
}
}

