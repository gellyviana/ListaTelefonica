public class Main {
	public static void main(String[] args) {
			Dados pessoa1 = new Dados();
			pessoa1.setNome("Eucharles");
			pessoa1.setTelefone("(84)98788-8888");
			ListaTelefonica lista = new ListaTelefonica();
			lista.adiciona(pessoa1.getNome(), pessoa1.getTelefone());
			lista.imprimeLista();
		}	
}