package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class P5NovaPessoa {

	public static void main(String[] args) throws SQLException {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		String nome = scanner.nextLine();
		
		Connection conexao = P3FabricaConexao.getConexao();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nome);
		
		stmt.execute();
		
		System.out.println("Conexão: " + sql);
		System.out.println("Encerrando!");
		scanner.close();
	}
	
}
