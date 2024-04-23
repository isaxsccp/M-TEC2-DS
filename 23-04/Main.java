public class Main {
	public static void main(String[] args) {
	       Calculadora calcula = new Calculadora();
	       calcula.setNome("Calculator 2000");
	       // EXEMPLOS DE SOMA (int - double - array)
	       System.out.println(calcula.soma(34, 26));
	       System.out.println(calcula.soma(6.5, 7.6));
	       System.out.println(calcula.soma(new int[]{4, 7, 3}));
	       System.out.println(calcula.soma(new double[]{5, 8, 7}));
	       // EXEMPLOS DE SUBTRAÇÃO (int - double - array)
	       System.out.println(calcula.subtracao(6, 3));
	       System.out.println(calcula.subtracao(7.9, 1.3));
	       System.out.println(calcula.subtracao(new int[]{67, 22, 8}));
	       System.out.println(calcula.subtracao(new double[]{45.2, 0.3, 8.4}));
	   }
	}
