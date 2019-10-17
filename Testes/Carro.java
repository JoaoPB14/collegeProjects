
public class Carro {

	private String modelo;
	private String marca;
	private int anoFab;
	private float valor;
	
	Carro(){
		this.modelo = "";
		this.marca = "";
		this.anoFab = 0;
		this.valor = 0;
	}
	public void setModelo (String modelo) {
		this.modelo = modelo;
	}
	public void setMarca (String marca) {
		this.marca = marca;
	}
	public void setAnoFab (int anoFab) {
		if (anoFab > 1800)
		this.anoFab = anoFab;
	}
	public void setValor (float valor) {
		this.valor = valor;
	}
	public float getValor () {
		return this.valor;
	}
	public float calcValor (float valor) {
		if (anoFab > 2000 && anoFab <= 2020) {
			this.valor = this.valor - (float)(this.valor * 0.07);
			return this.valor;
		} else {
			this.valor = this.valor - (float)(this.valor * 0.12);
			return this.valor;
		}		
	}
	public String show () {
		return "\nModelo do carro: " + this.modelo +
			   "\nMarca do carro: " + this.marca +
			   "\nAno de fabricação: " + this.anoFab +
			   "\nValor final: R$ " + this.valor + "\n";
	}
}
