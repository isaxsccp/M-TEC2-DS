public class Veiculo {
	private String marca;
	private String modelo;
	private String cor;
	private int ano;
 
//GET E SET
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
 
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	void exibirDados() {
		System.out.println("A marca é: "+this.marca);
		System.out.println("O modelo é: "+this.modelo);
		System.out.println("A cor é: "+this.cor);
		System.out.println("O ano é: "+this.ano);
	}


}
