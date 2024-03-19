public class Calcular {
	String nome;
	int idade;
	double peso;
	double altura;
	
	void CalcImc () {
	double cimc = peso/(altura*altura);
		if (cimc<18.5) {
			System.out.println("Voce esta abaixo do peso");
		}else if (cimc>=18.5 & cimc<=24.9) {
			System.out.println(("Peso normal mano"));
		}else if (cimc>=25 & cimc<=29.9) {
			System.out.println("Sobrepeso");			
		}else if (cimc>=30 & cimc<=34.9) {
			System.out.println("Obesidade grau 1");
		}else if (cimc>=35 & cimc<=39.9) {
			System.out.println("Obesidade grau 2");
		}else{
			System.out.println("Obesidade grau 3");
		}
		System.out.println("Seu IMC é "+cimc);
	}
}
