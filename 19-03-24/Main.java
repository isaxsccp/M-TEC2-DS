import java.util.Scanner;
public class Main {
	public static void main (String[]args) {
		Calcular primCalc = new Calcular(); 
	Scanner in = new Scanner(System.in);
	
	System.out.println("Digite sua idade");
	primCalc.idade = in.nextInt();
	System.out.println("Digite seu peso");
	primCalc.peso = in.nextDouble();
	System.out.println("Digite sua altura");
	primCalc.altura= in.nextDouble();
	
	primCalc.CalcImc();
	
		}
	}
