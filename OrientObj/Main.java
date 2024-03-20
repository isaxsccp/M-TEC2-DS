package java_ds;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// TODO Auto-generated method stub
		Funcionario pedro = new Funcionario () ;
		Funcionario primeiroPedro = new Funcionario();
		primeiroPedro.salarioBruto = 1412.00;
		Funcionario segundoVagner = new Funcionario();
		segundoVagner.salarioBruto = 2000.00;
		
		
		
		System.out.println("O sálario líquido de funcionario Pedro é: R$"+primeiroPedro.salarioLiquido()+".");
		System.out.println("O salário bruto de funcionário Pedro com o aumento é: R$"+primeiroPedro.aumentoSalario()+".");
		System.out.println();

		System.out.println("O sálario líquido de funcionario Vagner é: R$"+segundoVagner.salarioLiquido()+".");
		System.out.println("O salário bruto de funcionário Vagner com o aumento é: R$"+segundoVagner.aumentoSalario()+".");


	}

}
