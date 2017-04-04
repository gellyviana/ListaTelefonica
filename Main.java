public class Main {
	public static void main(String[] args) {
			Dados pessoa1 = new Dados();
			pessoa1.setNome("Júlio");
			pessoa1.setTelefone("(84)98788-8888");
			Dados pessoa2 = new Dados();
			pessoa2.setNome("Antonia");
			pessoa2.setTelefone("(84)98788-8888");
			Dados pessoa3 = new Dados();
			pessoa3.setNome("Marcos");
			pessoa3.setTelefone("(84)98788-8888");
			Dados pessoa4 = new Dados();
			pessoa4.setNome("Gelly");
			pessoa4.setTelefone("(84)98788-8888");
			ListaTelefonica lista = new ListaTelefonica();
			lista.adiciona(pessoa1.getNome(), pessoa1.getTelefone());
			lista.adiciona(pessoa2.getNome(), pessoa2.getTelefone());
			lista.adiciona(pessoa3.getNome(), pessoa3.getTelefone());
			lista.adiciona(pessoa3.getNome(), pessoa3.getTelefone());
			lista.imprimeLista();
		}	
}