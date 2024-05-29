public class Publicacao {
	    private String titulo;
	    private String autor;
	    private int anoPublicacao;

	    public Publicacao(String titulo, String autor, int anoPublicacao) {
	        this.titulo = titulo;
	        this.autor = autor;
	        this.anoPublicacao = anoPublicacao;
	    }

	    public String getTitulo() {
	        return titulo;
	    }

	    public void setTitulo(String titulo) {
	        this.titulo = titulo;
	    }

	    public String getAutor() {
	        return autor;
	    }

	    public void setAutor(String autor) {
	        this.autor = autor;
	    }

	    public int getAnoPublicacao() {
	        return anoPublicacao;
	    }

	    public void setAnoPublicacao(int anoPublicacao) {
	        this.anoPublicacao = anoPublicacao;
	    }

	    void exibirDetalhes() {
	        System.out.println("O título é: " + this.titulo);
	        System.out.println("O nome do autor é: " + this.autor);
	        System.out.println("O ano de publicação é: " + this.anoPublicacao);
	    }

}
