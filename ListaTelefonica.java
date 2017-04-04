import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;

public class ListaTelefonica{

	
	private HashMap<String, String> listaTelefonica;

	public ListaTelefonica(){
		listaTelefonica = new HashMap<String, String>();
	}
	public void adiciona(String nome, String telefone){
		listaTelefonica.put(nome, telefone);
	}
	public void imprimeLista(){
		Set<String> keys = listaTelefonica.keySet();
		for (String key : keys ) {
			System.out.println("Nome:" + key + "\nTelefone:" + listaTelefonica.get(key));
		}
	}
}