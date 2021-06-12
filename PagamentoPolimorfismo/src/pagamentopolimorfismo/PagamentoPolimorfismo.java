/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagamentopolimorfismo;

/**
 *
 * @author andre
 */
public class PagamentoPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Comissionado empregadoUm = new Comissionado (5000,0.1,"Pedro");
        Horista empregadoDois = new Horista (160,5,"Marta");
        System.out.println("Empregados processados individualmente:\n");
        System.out.printf("%s \n %s: $%,.2f\n \n",empregadoUm, "salário", empregadoUm.salarios());
        System.out.printf("%s \n %s: $%,.2f\n \n",empregadoDois, "salário", empregadoDois.salarios());
        
        Empregado empregados[] = new Empregado[2];
        empregados[0] = empregadoUm;
        empregados[1] = empregadoDois;
        
        System.out.println( "Empregados processados utilizando POLIMORFISMO \n" );
      // processa genericamente cada elemento
      for ( Empregado empregadoCorrente : empregados ) 
      {
         System.out.println(empregadoCorrente); // invoca toString

         System.out.printf("salario $%,.2f\n\n", empregadoCorrente.salarios());
      } 
    }   
    
}
