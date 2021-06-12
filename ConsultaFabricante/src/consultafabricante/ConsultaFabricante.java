/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultafabricante;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;



public class ConsultaFabricante {static final String banco = "jdbc:mysql://localhost:3306/concessionaria";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        Connection conexao = null;
        ResultSet resultados = null;
        PreparedStatement consulta = null;
         

    try {
        conexao = DriverManager.getConnection(banco,"root","");     
        
        consulta = conexao.prepareStatement("select *  from veiculo where fabricante = ? "); 
        String fabricante = JOptionPane.showInputDialog(null,"Informe o fabricante a ser consultado");
        consulta.setString(1,fabricante);
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
}}

    

