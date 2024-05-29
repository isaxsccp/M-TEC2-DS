public class Livro extends Publicacao {
	    private int numPaginas;
	    private String editora;

	    public Livro(String titulo, String autor, int anoPublicacao, int numPaginas, String editora) {
	        super(titulo, autor, anoPublicacao);
	        this.numPaginas = numPaginas;
	        this.editora = editora;
	    }

	    public int getNumPaginas() {
	        return numPaginas;
	    }

	    public void setNumPaginas(int numPaginas) {
	        this.numPaginas = numPaginas;
	    }

	    public String getEditora() {
	        return editora;
	    }

	    public void setEditora(String editora) {
	        this.editora = editora;
	    }

	    @Override
	    public void exibirDetalhes() {
	        super.exibirDetalhes();
	        System.out.println("A quantidade de páginas é: " + this.numPaginas);
	        System.out.println("A editora é: " + this.editora);
	    }

	    void exibirDetalhes(boolean exibir) {
	        if (exibir == true) {
	            System.out.println("Número de páginas: " + this.numPaginas);
	            System.out.println("Nome da editora: " + this.editora);
	        } else if (exibir == false){
	            System.out.println("Número de páginas: " + this.numPaginas);
	        }
	    }
	}
