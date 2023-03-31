import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class App {

	public static void main(String[] args) throws IOException, InterruptedException {
		
//		https://api.chucknorris.io/jokes/random?category=animal (Pesquisa uma categoria específica)
//		https://api.chucknorris.io/jokes/categories (Ve as categorias que tem)
//		https://api.chucknorris.io/jokes/search?query={query}
		String url = "https://api.chucknorris.io/jokes/search?query=animal";
		HttpClient cliente = HttpClient.newHttpClient();
		HttpRequest requisicao = HttpRequest.newBuilder(URI.create(url)).GET().build();
		HttpResponse<String> resposta = cliente.send(requisicao, BodyHandlers.ofString());
		String json = resposta.body();
		System.out.println(json);
	}
	
}
