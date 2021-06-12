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

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;




public class InclusaoExclusaoPaciente {static final String banco = "jdbc:mysql://localhost:3306/programaanamnese";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conexao = null;
        ResultSet resultados = null;
        PreparedStatement delete = null;
        PreparedStatement consulta = null;
        PreparedStatement cadastro = null;
         

    try {
        conexao = DriverManager.getConnection(banco,"root","");
        while(true){    
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a opção desejada"
                    + "\n 1 - Adicionar Paciente"
                    + "\n 2 - Deletar Paciente"
                    + "\n 3 - Consultar Paciente"
                    + "\n 4 - Sair do Programa"));
            while(opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4){
		opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira uma opção válida"
                        + "\nInsira a opção desejada"
                        + "\n 1 - Adicionar Paciente"
                        + "\n 2 - Deletar Paciente"
                        + "\n 3 - Consultar Paciente"
                        + "\n 4 - Sair do programa"));
            }
            if(opcao == 4){
                break;
            }
            if(opcao == 3){
                String codigo = JOptionPane.showInputDialog(null,"Informe o id do Paciente a ser consultado");
                
                consulta = conexao.prepareStatement("select *  from paciente where idPaciente = ?");
                consulta.setInt(1, Integer.parseInt(codigo));
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
            if(opcao == 2){
                String codigo = JOptionPane.showInputDialog(null,"Informe id do Paciente a ser deletado");
                
                delete = conexao.prepareStatement("delete from paciente where idPaciente = ?");
                delete.setInt(1, Integer.parseInt(codigo));
                delete.execute();
                consulta = conexao.prepareStatement("select *  from paciente");
                
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
            if(opcao == 1){
                int newCodigo = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe id do Paciente a ser inserido"));
                String newNome = JOptionPane.showInputDialog(null,"Informe Nome do Paciente a ser inserido");
                String newCargo = JOptionPane.showInputDialog(null,"Informe Cargo do Paciente a ser inserido");
                String newApto = JOptionPane.showInputDialog(null,"Informe a aptidao do Paciente a ser inserido");
                cadastro = conexao.prepareStatement("insert into paciente(idPaciente, nomePaciente, cargo, apto) VALUES (?,?,?,?)");
                cadastro.setInt(1, newCodigo);
                cadastro.setString(2, newNome);                
                cadastro.setString(3, newCargo);                
                cadastro.setString(4, newApto);
                cadastro.executeUpdate();
                
                consulta = conexao.prepareStatement("select *  from paciente");
                
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
            /*String codigo = JOptionPane.showInputDialog(null,"Informe o codigo a ser deletado");
            int codigoInt = Integer.parseInt(codigo);
            delete = conexao.prepareStatement("DELETE FROM turista WHERE codigo = ?");
            delete.setInt(1, codigoInt);
            delete.execute();
            consulta = conexao.prepareStatement("select *  from turista");*/
        
        
        
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
    

