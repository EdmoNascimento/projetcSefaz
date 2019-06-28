package br.com.sefaz.projeto.DAO;

import java.sql.*;

import javax.swing.JOptionPane;



public class ConexaoDB {
	
	public Statement stm;
	public ResultSet rs;
	private String driver = "org.hsqldb.jdbc.JDBCDriver";
	private String caminho = "jdbc:hsqldb:file:testando2";
	private String usuario = "SA";
	private String senha = "";
	public Connection con;
	
	public void conexao() {
		
		try {
			System.setProperty("jdbc.Drivers",driver);
			con = DriverManager.getConnection(driver,usuario,caminho);
			JOptionPane.showMessageDialog(null, "Conexão Efetuada com Sucesso!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados!" + e.getMessage());
		}
	}
	
	public void desconecta() {
		try {
			con.close();
			JOptionPane.showMessageDialog(null, "Desconectado!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro ao desconectar o banco!" + e.getMessage());
		}
	}
}
