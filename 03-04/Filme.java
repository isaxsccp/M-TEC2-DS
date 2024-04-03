public class Filme {
	private String titulo;
	private int duracaoEmMinutos;
	
	String getTitulo() {
		return this.titulo;
		}
	void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	int getDuracaoEmMinutos() {
		return this.duracaoEmMinutos;
		}
	void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}
 
 
	void  exibirDuracaoEmHoras() {
 
	int durac = this.duracaoEmMinutos/60;
	System.out.println("A duração desse filme em horas é: "+durac+"h");
		
	}
}
