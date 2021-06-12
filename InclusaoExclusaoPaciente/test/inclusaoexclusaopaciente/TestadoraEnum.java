/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclusaoexclusaopaciente;

/**
 *
 * @author andre
 */
public class TestadoraEnum {
public static void comparaEnum(OpcoesMenu opcao){
if(opcao.equals(OpcoesMenu.ADICIONAR)){
System.out.println("Foi escolhido a opção ADICIONAR");
}else if(opcao.equals(OpcoesMenu.DELETAR)){
System.out.println("Foi escolhido a opção DELETAR");
}else if(opcao.equals(OpcoesMenu.FECHAR)){
System.out.println("Foi escolhido a opção FECHAR");
}
}

public static void main(String[] args) {
comparaEnum(OpcoesMenu.DELETAR);
}
}