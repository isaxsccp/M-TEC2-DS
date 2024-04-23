public class Calculadora {
	private String nome;
	   private double resultadoDouble;
	   private int resultadoInteiro;
	   // GET E SET
	   public String getNome() {
	       return this.nome;
	   }
	   public void setNome(String nome) {
	       this.nome = nome;
	   }
	   public double getResultadoDouble() {
	       return this.resultadoDouble;
	   }
	   public void setResultadoDouble(double resultadoDouble) {
	       this.resultadoDouble = resultadoDouble;
	   }
	   public int getResultadoInteiro() {
	       return this.resultadoInteiro;
	   }
	   public void setResultadoInteiro(int resultadoInteiro) {
	       this.resultadoInteiro = resultadoInteiro;
	   }
	   // SOMAS
	   // SOMA DOUBLE
	   double soma(double v1, double v2) {
	       this.setResultadoDouble(v1 + v2);
	       return this.getResultadoDouble();
	   }
	   // SOMA INT
	   int soma(int v1, int v2) {
	       this.setResultadoInteiro(v1 + v2);
	       return this.getResultadoInteiro();
	   }
	   // SOMA ARRAY DOUBLE
	   double soma(double[] arrayD) {
	       double sum = 0;
	       for (double num : arrayD) {
	           sum += num;
	       }
	       this.setResultadoDouble(sum);
	       return this.getResultadoDouble();
	   }
	   // SOMA ARRAY INT
	   int soma(int[] arrayI) {
	       int sum = 0;
	       for (int num : arrayI) {
	           sum += num;
	       }
	       this.setResultadoInteiro(sum);
	       return this.getResultadoInteiro();
	   }
	   // SUBTRAÇÕES
	   // SUBTRAÇÃO DOUBLE
	   double subtracao(double v1, double v2) {
	       this.setResultadoDouble(v1 - v2);
	       return this.getResultadoDouble();
	   }
	   // SUBTRAÇÃO INT
	   int subtracao(int v1, int v2) {
	       this.setResultadoInteiro(v1 - v2);
	       return this.getResultadoInteiro();
	   }
	   // SUBTRAÇÃO ARRAY INT
	   int subtracao(int[] array) {
	       this.setResultadoInteiro(array[0]);
	       for (int i = 1; i < array.length; i++) {
	           this.setResultadoInteiro(this.getResultadoInteiro() - array[i]);
	       }
	       return this.getResultadoInteiro();
	   }
	   // SUBTRAÇÃO ARRAY DOUBLE
	   double subtracao(double[] array) {
	       this.setResultadoDouble(array[0]);
	       for (int i = 1; i < array.length; i++) {
	           this.setResultadoDouble(this.getResultadoDouble() - array[i]);
	       }
	       return this.getResultadoDouble();
	   }
	}
