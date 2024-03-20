package revisao_ds;
import java.util.Scanner;
public class ex_if2 {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int senha = 0;
		while(senha !=2002) {
			System.out.println("Digite a senha:");
			senha = in.nextInt();
			
			if (senha == 2002) {
				System.out.println("Acesso liberado");
			}else {
				System.out.println("senha inválida.");
			}
			
		}
	
		
	}
	
}
