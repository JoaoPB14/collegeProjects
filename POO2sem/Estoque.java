
public class Estoque {
	
	private String nome;
	private int qtdAtual;
	private int qtdMinima;
	
	Estoque(){
		this.nome = "";
		this.qtdAtual = 0;
		this.qtdMinima = 0;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	public String getNome () {
		return nome;
	}
	public void setQtdAtual (int qtdAtual) {
			this.qtdAtual = qtdAtual;
	}
	public int getQtdAtual () {
		return this.qtdAtual;
	}
	public void setQtdMinima (int qtdMinima) {
		if (qtdMinima >= 0)
			this.qtdMinima = qtdMinima;
	}
	public int getQtdMinima () {
		return qtdMinima;
	}
	public void repor (int qtd) {
		this.qtdAtual += qtd;
	}
	public void darBaixa (int qtd) {
		this.qtdAtual -= qtd;
	}
	public String mostra () {
		return  "Nome do Produto: " + this.nome +
				"\nQuantidade Minima: " + this.qtdMinima +
				"\nQuantidade Atual: " + this.qtdAtual + "\n";
	}
	boolean precisaRepor () {
		if (this.qtdAtual < this.qtdMinima)
			return true;
		else
			return false;
	}
	public String getPrecisaRepor () {
		if (precisaRepor() == true)
			return("Sim");
		else
			return("Não");
	}
	}

