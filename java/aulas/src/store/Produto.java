package store;

public class Produto {

	private String nomeProduto;
	private String codigo;
	private double precoUnitario;
	private int qtdeProdutoEstoque;
	
	//Construtor
	public Produto(String nomeProduto, String codigo, double precoUnitario) {
		this.nomeProduto = nomeProduto;
		this.codigo = codigo;
		this.precoUnitario = precoUnitario;
	}
	
	public Produto(String nomeProduto, String codigo, double precoUnitario, int qtdeProdutoEstoque) {
		this.nomeProduto = nomeProduto;
		this.codigo = codigo;
		this.precoUnitario = precoUnitario;
		this.qtdeProdutoEstoque = qtdeProdutoEstoque;
	}
	
	//Getters and Setters
	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public int getQtdeProdutoEstoque() {
		return qtdeProdutoEstoque;
	}
	
	//Métodos
	public void tiraEstoque(int saida) {	//atualiza a saida toda vez que vc faz a saida, espera receber saida
		
		if(testarEstoque(saida)) {
			//se for true faz isso
			this.qtdeProdutoEstoque -= saida;
		} else {
			//se for false faz isso
			System.out.println("Estoque indisponível..");
		}
		
		//this.qtdeProdutoEstoque = this.qtdeProdutoEstoque - saida;
		
	}
	
	public void adicionaEstoque(int entrada) {
		//this.qtdeProdutoEstoque + this.qtdeProdutoEstoque + entrada;
		this.qtdeProdutoEstoque += entrada;
	}
	
	
	//comçea com o tipo e var q vai devolver
	public boolean testarEstoque(int valor) {
		if (valor > this.qtdeProdutoEstoque) {
			return false;	
		} else if(valor == 0){
			return false;
		} else if(this.qtdeProdutoEstoque == 0) {
			return false;
		} else if(this.qtdeProdutoEstoque < 0){
			return false;
		} else {
			return true;
		}
	}
		//retorna tipo double var venda e RECEBE um tipo int var qtdVendida 
	
	
	
	private double venda(int qtdeVendida) {
		
		if(testarEstoque(qtdeVendida)) {
			tiraEstoque(qtdeVendida);
			return qtdeVendida * this.precoUnitario;
		} else {
			System.out.println("Venda negada...");
			return 0;
		}
		
		
		
			
	}
	
}
