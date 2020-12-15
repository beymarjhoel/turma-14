package poo;

public class Pessoa {
	//private quer dizer que só a classe Pessoa pode manipula-los
	private String primeiroNome;
	private String ultimoNome;
	private String nomesDoMeio;
	
	//QUEM CRIA É O NEW, QUEM EXECUTA É O CONSTRUTOR
	//CONSTRUTOR PUBLICO, EXECUTAR ALGUM PROCEDIMENTO SOB O OBJETO CRIADO PELO OBJETO NEW
	public Pessoa(String primeiro, String ultimo, String meio) {
		primeiroNome = primeiro;
		ultimoNome = ultimo;
		nomesDoMeio = meio;
	}
	
	public String getNomeCompleto() {
		String nomeCompleto = primeiroNome + " " + nomesDoMeio + " " + ultimoNome;
		return nomeCompleto;
	}
	
}
