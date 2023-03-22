public class MinhaClassNome {

public static void main (String[] args){
	String primeiroNome = "Joyce";
	String segundoNome = "Cabral";
	
	String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);

	System.out.println(nomeCompleto);
}

	public static String nomeCompleto (String primeiroNome, String segundoNome){
	return primeiroNome.concat(" ").concat(segundoNome);

	}

}
