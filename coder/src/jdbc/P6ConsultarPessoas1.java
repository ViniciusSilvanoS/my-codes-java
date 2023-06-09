package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class P6ConsultarPessoas1 {

	public static void main(String[] args) throws SQLException{
		
		Connection conexao = P3FabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoas";
		
		Statement stmt = conexao.createStatement();
		ResultSet resultado = stmt.executeQuery(sql);
		
		List<P6Pessoa> pessoas = new ArrayList<>();
		
		while(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new P6Pessoa(codigo, nome));
		}
		
		for(P6Pessoa p : pessoas) {
			System.out.println(p.getCodigo() + " ==> " + p.getNome());
		}
		
		stmt.close();
		conexao.close();
		
		
	}
	
}
