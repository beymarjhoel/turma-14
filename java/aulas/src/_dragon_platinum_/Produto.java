package _dragon_platinum_;

public class Produto {
	private String nomeProduto;
	private String codigoProduto;
	private double precoUnitario;
	private int quantidadeProdutoEstoque;
	
	public Produto(String nomeProduto, String codigoProduto, double precoUnitario, int quantidadeProdutoEstoque) {
		this.nomeProduto = nomeProduto;
		this.codigoProduto = codigoProduto;
		this.precoUnitario = precoUnitario;
		this.quantidadeProdutoEstoque = quantidadeProdutoEstoque;
	}	

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public int getQuantidadeProdutoEstoque() {
		return quantidadeProdutoEstoque;
	}

	public void setQuantidadeProdutoEstoque(int quantidadeProdutoEstoque) {
		this.quantidadeProdutoEstoque = quantidadeProdutoEstoque;
	}
	
	public void adicionaEstoque(int entrada) {
		this.quantidadeProdutoEstoque = this.quantidadeProdutoEstoque + entrada;
	}
	
	public void retiraEstoque(int saida) {
		this.quantidadeProdutoEstoque = this.quantidadeProdutoEstoque - saida;
	}
	
} 
