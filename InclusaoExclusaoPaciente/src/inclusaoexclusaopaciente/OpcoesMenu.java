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
public enum OpcoesMenu {
ADICIONAR(1), DELETAR(2), CONSULTAR(3), FECHAR(4);

private final int valor;
OpcoesMenu(int valorOpcao){
valor = valorOpcao;
}
public int getValor(){
return valor;
}
}