public class Moto extends Veiculo {
	private double cilindradas;
	 
	public double getCilindradas() {
		return cilindradas;
	}
	public void setCilindradas(double cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	@Override 
	void exibirDados() {
		super.exibirDados();
		System.out.println("A quantidade dos cilindradas é: "+this.cilindradas);
	}
	

}
