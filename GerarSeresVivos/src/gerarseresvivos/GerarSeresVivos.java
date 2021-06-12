/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerarseresvivos;

/**
 *
 * @author andre
 */
public class GerarSeresVivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoas serVivoUm = new Pessoas(1995, "Andre",0);
        Arvores serVivoDois = new Arvores(1955,0, "Carvalho",0);
        serVivoUm.gerarIdade(2021);
        System.out.println(serVivoUm);
        serVivoDois.gerarIdade(2021);
        System.out.println(serVivoDois);
        
        SeresVivos seres[] = new SeresVivos [2];
        seres[0] = serVivoUm;
        seres[1] = serVivoDois;
        
        System.out.println("\n Seres Vivos processados utilizando POLIMORFISMO \n");
        
        for (SeresVivos serCorrente : seres){
            serCorrente.gerarIdade(2020);
            System.out.println(serCorrente);
        }
        
    }
    
}
