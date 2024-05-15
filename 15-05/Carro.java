public class Carro extends Veiculo {
	private int quantidadePortas;
	public int getQuantidadePortas() {
		return quantidadePortas;
	}
	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}

	@Override 
	void exibirDados() {
		super.exibirDados();
		System.out.println("A quantidade de portas é: "+this.quantidadePortas);
	}
	
}
