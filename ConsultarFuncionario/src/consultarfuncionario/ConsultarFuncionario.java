/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultarfuncionario;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

public class ConsultarFuncionario {static final String banco = "jdbc:mysql://localhost:3306/rhempresa";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conexao = null;
        ResultSet resultados = null;
        PreparedStatement consulta = null;
        PreparedStatement update = null;
         

    try {
        conexao = DriverManager.getConnection(banco,"root","");     
        
        consulta = conexao.prepareStatement("select id,nome,cargo,salario,faltas  from funcionario where id = ? "); 
        int id = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o id do funcionario a ser alterado"));
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a informação a ser alterada \n1 - Cargo \n2 - Salario \n3 - Faltas "));
        while (opcao != 1 && opcao != 2 && opcao != 3 ){
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe uma opcao valida \nInforme a informação a ser alterada \n1 - Cargo \n2 - Salario \n3 - Faltas "));
        }
        if (opcao == 1){
            String cargo = JOptionPane.showInputDialog(null,"Informe o novo cargo do funcionario");
            update = conexao.prepareStatement("UPDATE `funcionario` SET `cargo` = ? WHERE id = ? ");
            update.setString(1, cargo);
            update.setInt(2, id);
            update.executeUpdate();
        }
        if (opcao == 2){
            String salario = JOptionPane.showInputDialog(null,"Informe o novo salario do funcionario");
            float salarioCorrigido = Float.parseFloat(salario);
            update = conexao.prepareStatement("UPDATE `funcionario` SET `salario` = ? WHERE id = ? ");
            update.setFloat(1, salarioCorrigido);
            update.setInt(2, id);
            update.executeUpdate();
        }
        if (opcao == 3){
            String faltas = JOptionPane.showInputDialog(null,"Informe a quantidade de faltas do funcionario");
            update = conexao.prepareStatement("UPDATE `funcionario` SET `faltas` = ? WHERE id = ? ");
            update.setString(1, faltas);
            update.setInt(2, id);
            update.executeUpdate();
        }
        
        consulta.setInt(1,id);
        resultados = consulta.executeQuery();
        ResultSetMetaData colunas = resultados.getMetaData();
        int numeroColunas = colunas.getColumnCount();
        System.out.println("informações do Banco de dados");
        for (int i=1; i <=numeroColunas; i++ )
        System.out.println(colunas.getColumnName(i));
        while (resultados.next()){
            for (int i=1; i <=numeroColunas; i++ )
            System.out.println("dados " + resultados.getObject(i));
            System.out.println();
}
        }
    
catch (SQLException erro){
erro.printStackTrace();
}
finally {
try {
    resultados.close();
    consulta.close();
    conexao.close();
}
catch (Exception erronovo) {
erronovo.printStackTrace();
}
}
}
}
