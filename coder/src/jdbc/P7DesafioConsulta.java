package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P7DesafioConsulta {

	public static void main(String[] args) throws SQLException {
		
		Scanner scanner = new Scanner(System.in);
		
		Connection conexao = P3FabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";
		
		System.out.println("Digite o nome a procurar: ");
		String valor = scanner.nextLine();
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%" + valor + "%");
		ResultSet resultado = stmt.executeQuery();
		
		List<P6Pessoa> pessoas = new ArrayList<>();
		
		while(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new P6Pessoa(codigo, nome));
		}
		
		for(P6Pessoa p: pessoas) {
			System.out.println(p.getCodigo() + " ==> " + p.getNome());
		}
		
		stmt.close();
		conexao.close();
		scanner.close();
		
	}
	
}
