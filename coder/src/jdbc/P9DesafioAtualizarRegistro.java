package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class P9DesafioAtualizarRegistro {

	public static void main(String[] args) {
		
		Connection conexao = P3FabricaConexao.getConexao();
		String sql = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
		
		Scanner scanner = new Scanner(System.in);
		
	}
	
}
