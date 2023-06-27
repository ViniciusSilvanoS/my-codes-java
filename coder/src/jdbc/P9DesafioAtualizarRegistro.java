package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class P9DesafioAtualizarRegistro {

	public static void main(String[] args) throws SQLException {
		
//		String sqlUpdate = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite as informações para alteração: ");
		System.out.println("ID: ");
		int id = scanner.nextInt();
		scanner.nextLine();
		
		Connection conexao = P3FabricaConexao.getConexao();
		String sql = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, id);
		ResultSet r = stmt.executeQuery();
		
		if(r.next()) {
			P6Pessoa p = new P6Pessoa(r.getInt(1), r.getString(2));
			
			System.out.println("O nome atual é: " + p.getNome());
			
			System.out.println("Informe o novo nome: ");
			String novoNome = scanner.nextLine();
			
			
			sql = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
			
			stmt.close();
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, novoNome);
			stmt.setInt(2, id);
			stmt.execute();
			
			System.out.println("Pessoa alterada com sucesso!");
		}
		
//		scanner.nextLine();
//		System.out.println("Novo nome: ");
//		String novoNome = scanner.nextLine();
		
//		pstmt.setInt(1, id);
//		pstmt.setString(2, novoNome);
//		
//		pstmt.execute();
		
		stmt.close();
		conexao.close();
		scanner.close();
		
//		ResultSet resultado = pstmt.executeQuery();
		
//		System.out.println(select);

		
	}
	
}
