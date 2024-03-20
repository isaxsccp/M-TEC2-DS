package revisao_ds;
import java.util.Scanner;
public class ex_if1 {
	  public static void main (String[] args) {
		  
		  Scanner in = new Scanner(System.in);
		  int num;
		  System.out.println("Entre com um número inteiro");
		  num = in.nextInt();
		  if(num <0) {
			  System.out.println("Este número é negativo");
		  }else{
			  System.out.println("Este número não é negativo");
			  
		  }
	  }
}
