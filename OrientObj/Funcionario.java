package java_ds;
import java.util.Scanner;
public class Funcionario {
	String nome;
	double salarioBruto;
	double imposto; 
		double salarioLiquido () {
	return salarioBruto - imposto;
	} 
		Double aumentoSalario() {
			Scanner in = new Scanner(System.in);
			System.out.println("Informe o aumento desejado no salário do funcionário: ");
			Double b = in.nextDouble();
			Double aumentoSalario = salarioBruto + b;
			return aumentoSalario;
		}
}
