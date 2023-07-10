package jdbc;

public class P12DAOTeste {

	public static void main(String[] args) {
		
		P11DAO dao = new P11DAO();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		System.out.println(dao.incluir(sql, "Bia Silva"));
		System.out.println(dao.incluir(sql, "Ana Julia"));
		System.out.println(dao.incluir(sql, "Gui Avila"));

		dao.close();
	}
	
}
