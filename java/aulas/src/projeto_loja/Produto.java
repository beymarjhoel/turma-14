package projeto_loja;

public class Produto {
	private String nomeProduto;
	private String codigoProduto;
	private double precoUnitario;
	private int    qtdeProdutoEstoque;

	public Produto(String nomeProduto, String codigoProduto, double precoUnitario, int qtdeProdutoEstoque) {
		this.nomeProduto = nomeProduto;
		this.codigoProduto = codigoProduto;
		this.precoUnitario = precoUnitario;
		this.qtdeProdutoEstoque = qtdeProdutoEstoque;
	}

	public boolean testarEstoque(int valor) {
		if (valor > this.qtdeProdutoEstoque) {
			return false;
		} else if (valor == 0) {
			return false;
		} else if (this.qtdeProdutoEstoque == 0) {
			return false;
		} else if (this.qtdeProdutoEstoque < 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public void tiraEstoque(int saida) {
		if (testarEstoque(saida)) {
			this.qtdeProdutoEstoque = this.qtdeProdutoEstoque - saida;
		} else {
			System.out.println("Estoque indisponível..");
		}
	}
	
	public void adicionaEstoque(int entrada) {
		this.qtdeProdutoEstoque = this.qtdeProdutoEstoque + entrada;
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

	public int getQtdeProdutoEstoque() {
		return qtdeProdutoEstoque;
	}

	public void setQtdeProdutoEstoque(int qtdeProdutoEstoque) {
		this.qtdeProdutoEstoque = qtdeProdutoEstoque;
	}
	
}
