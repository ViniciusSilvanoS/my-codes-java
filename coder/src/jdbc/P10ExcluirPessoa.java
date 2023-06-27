package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class P10ExcluirPessoa {

	public static void main(String[] args) throws SQLException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o ID de que deseja excluir: ");
		int id = scanner.nextInt();
		
		Connection conexao = P3FabricaConexao.getConexao();
		String sql = "DELETE FROM pessoas WHERE codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, id);
		
		if(stmt.executeUpdate() > 0) {
			System.out.println("Operação bem sucedida!");
		}else {
			System.out.println("Nada ocorreu!");
		}
		
		stmt.close();
		conexao.close();
		scanner.close();
		
	}
	
}
