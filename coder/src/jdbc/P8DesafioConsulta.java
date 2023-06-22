package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P8DesafioConsulta {

	public static void main(String[] args) {
		
		Connection conexao = P3FabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o nome desejado: ");
		String nome = scanner.nextLine();
		
		List<P6Pessoa> pessoas = new ArrayList<>();
		
		try {
			
			PreparedStatement pstmt = conexao.prepareStatement(sql);
			pstmt.setString(1, "%" + nome + "%");
			
			ResultSet resultado = pstmt.executeQuery();
			
			
			while(resultado.next()) {
				int idResult = resultado.getInt("codigo");
				String nomeResult = resultado.getString("nome");
				pessoas.add(new P6Pessoa(idResult, nomeResult));
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		for (P6Pessoa p : pessoas) {
			System.out.println(p.getCodigo() + " --> " + p.getNome());
		}
		

		
	}
	
}
