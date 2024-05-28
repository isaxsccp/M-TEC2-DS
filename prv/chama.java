public class Main {

    public static void main(String[] args) {
        // INSTANCIANDO O OBJETO LIVRO
        Livro l1 = new Livro("Harry Potter e a câmara secreta", "J. K. Rowling", 2017, 224, "Rocco Ltda.");
        l1.exibirDetalhes(false);

        // INSTANCIANDO O OBJETO REVISTA
        Revista r1 = new Revista("Veja", "Mauricio Lima", 2004, 241, "Editora Abril");
        r1.exibirDetalhes(true);

        System.out.println("Informações do livro:");
        l1.exibirDetalhes();
        System.out.println();
        System.out.println("Informações da revista:");
        r1.exibirDetalhes();
    }
}

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
        if (exibir) {
            System.out.println("Número de páginas: " + this.numPaginas);
            System.out.println("Nome da editora: " + this.editora);
        } else {
            System.out.println("Número de páginas: " + this.numPaginas);
        }
    }
}

public class Revista extends Publicacao {
    private int numPaginas;
    private String editora;

    public Revista(String titulo, String autor, int anoPublicacao, int numPaginas, String editora) {
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
        if (exibir) {
            System.out.println("Número de páginas: " + this.numPaginas);
            System.out.println("Nome da editora: " + this.editora);
        } else {
            System.out.println("Número de páginas: " + this.numPaginas);
        }
    }
}
