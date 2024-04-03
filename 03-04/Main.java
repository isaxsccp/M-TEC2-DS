public class Main {
	public static void main(String[] args) {
		//Filme1
		Filme filme1 = new Filme();
		
		filme1.setTitulo("Os Vingadores");
		filme1.setDuracaoEmMinutos(142);
 
		Filme filme2 = new Filme();
		
		filme2.setTitulo("Hotel Transilvania");
		filme2.setDuracaoEmMinutos(93);
		
		Filme filme3 = new Filme();
		
		filme3.setTitulo("O Mágico de Oz");
		filme3.setDuracaoEmMinutos(102);
		
		Filme filme4 = new Filme();
		
		filme4.setTitulo("O Rei Leão");
		filme4.setDuracaoEmMinutos(88);
		
		Filme filme5 = new Filme();
		
		filme5.setTitulo("Avatar");
		filme5.setDuracaoEmMinutos(162);
		
		Filme filme6 = new Filme();
		
		filme6.setTitulo("Titanic");
		filme6.setDuracaoEmMinutos(194);
		
		System.out.println("Os filmes em cartaz são:");
		System.out.println(" ");
		
		System.out.println(filme1.getTitulo());
		filme1.exibirDuracaoEmHoras();
		System.out.println(" ");

		System.out.println(filme2.getTitulo());
		filme2.exibirDuracaoEmHoras();
		System.out.println(" ");
		
		System.out.println(filme3.getTitulo());
		filme3.exibirDuracaoEmHoras();
		System.out.println(" ");
		
		System.out.println(filme4.getTitulo());
		filme4.exibirDuracaoEmHoras();
		System.out.println(" ");
		
		System.out.println(filme5.getTitulo());
		filme5.exibirDuracaoEmHoras();
		System.out.println(" ");
		
		System.out.println(filme6.getTitulo());
		filme6.exibirDuracaoEmHoras();
		System.out.println(" ");
			
	}

}
