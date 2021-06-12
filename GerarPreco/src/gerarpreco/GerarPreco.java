/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerarpreco;

/**
 *
 * @author andre
 */
public class GerarPreco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tenis tenisUm = new Tenis(42,"Nike",200,"Branco",0);
        Camisa camisaUm = new Camisa("Regata",90,"Adidas",50,"Preta",0);
        tenisUm.calcularPreco();
        camisaUm.calcularPreco();
        System.out.println(tenisUm);
        System.out.println(camisaUm);
        
        System.out.println("\n Precos gerados com Polimorfismo \n");
        Produto produtos[] = new Produto[2];
        produtos[0] = tenisUm;
        produtos[1] = camisaUm;
        
        for (Produto produtoCorrente : produtos){
            produtoCorrente.calcularPreco();
            System.out.println(produtoCorrente);
        }
    }
    
}
