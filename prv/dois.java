import java.util.Scanner;

// Classe Base: Publicacao
class Publicacao {
private String titulo;
private String autor;
private int anoPublicacao;

// Construtor
public Publicacao(String titulo, String autor, int anoPublicacao) {
    this.titulo = titulo;
    this.autor = autor;
    this.anoPublicacao = anoPublicacao;
}

// Get e Set
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

// Método para exibir detalhes da publicação
public void exibirDetalhes() {
    System.out.println("Título: " + titulo);
    System.out.println("Autor: " + autor);
    System.out.println("Ano de Publicação: " + anoPublicacao);
}
}

// Classe Derivada: Livro
class Livro extends Publicacao {
private int numeroPaginas;
private String editora;

// Construtor
public Livro(String titulo, String autor, int anoPublicacao, int numeroPaginas, String editora) {
    super(titulo, autor, anoPublicacao);
    this.numeroPaginas = numeroPaginas;
    this.editora = editora;
}

// Get e Set
public int getNumeroPaginas() {
    return numeroPaginas;
}

public void setNumeroPaginas(int numeroPaginas) {
    this.numeroPaginas = numeroPaginas;
}

public String getEditora() {
    return editora;
}

public void setEditora(String editora) {
    this.editora = editora;
}

// Sobrescrita do método exibirDetalhes() para incluir número de páginas e editora
@Override
public void exibirDetalhes() {
    super.exibirDetalhes();
    System.out.println("Número de Páginas: " + numeroPaginas);
    System.out.println("Editora: " + editora);
}
}

// Classe Derivada: Revista
class Revista extends Publicacao {
private int numeroEdicao;
private String mesPublicacao;

// Construtor
public Revista(String titulo, String autor, int anoPublicacao, int numeroEdicao, String mesPublicacao) {
    super(titulo, autor, anoPublicacao);
    this.numeroEdicao = numeroEdicao;
    this.mesPublicacao = mesPublicacao;
}

// Getters e Setters
public int getNumeroEdicao() {
    return numeroEdicao;
}

public void setNumeroEdicao(int numeroEdicao) {
    this.numeroEdicao = numeroEdicao;
}

public String getMesPublicacao() {
    return mesPublicacao;
}

public void setMesPublicacao(String mesPublicacao) {
    this.mesPublicacao = mesPublicacao;
}

// Sobrescrita do método exibirDetalhes() para incluir número da edição e mês de publicação
@Override
public void exibirDetalhes() {
    super.exibirDetalhes();
    System.out.println("Número da Edição: " + numeroEdicao);
    System.out.println("Mês de Publicação: " + mesPublicacao);
}
}

// Classe principal
public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

    System.out.print("Cadastro de Livro:\nTítulo: ");
    String tituloLivro = scanner.nextLine();
    System.out.print("Autor: ");
    String autorLivro = scanner.nextLine();
    System.out.print("Ano de Publicação: ");
    int anoLivro = scanner.nextInt();
    scanner.nextLine(); // Limpar o buffer do scanner
    System.out.print("Número de Páginas: ");
    int paginasLivro = scanner.nextInt();
    scanner.nextLine(); // Limpar o buffer do scanner
    System.out.print("Editora: ");
    String editoraLivro = scanner.nextLine();

    Livro livro = new Livro(tituloLivro, autorLivro, anoLivro, paginasLivro, editoraLivro);
    System.out.println("\nDetalhes do Livro:");
    livro.exibirDetalhes();

    System.out.print("\nCadastro de Revista:\nTítulo: ");
    String tituloRevista = scanner.nextLine();
    System.out.print("Autor: ");
    String autorRevista = scanner.nextLine();
    System.out.print("Ano de Publicação: ");
    int anoRevista = scanner.nextInt();
    scanner.nextLine(); // Limpar o buffer do scanner
    System.out.print("Número da Edição: ");
    int edicaoRevista = scanner.nextInt();
    scanner.nextLine(); // Limpar o buffer do scanner
    System.out.print("Mês de Publicação: ");
    String mesRevista = scanner.nextLine();

    Revista revista = new Revista(tituloRevista, autorRevista, anoRevista, edicaoRevista, mesRevista);
    System.out.println("\nDetalhes da Revista:");
    revista.exibirDetalhes();

    scanner.close();
}
}

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar duas instâncias de Carro
        System.out.println("Insira os dados do primeiro carro:");
        Carro carro1 = criarCarro(scanner);
        System.out.println("Insira os dados do segundo carro:");
        Carro carro2 = criarCarro(scanner);

        // Criar duas instâncias de Moto
        System.out.println("Insira os dados da primeira moto:");
        Moto moto1 = criarMoto(scanner);
        System.out.println("Insira os dados da segunda moto:");
        Moto moto2 = criarMoto(scanner);

        // Calcular IPVA e imprimir ficha técnica
        carro1.calcularIpva();
        carro2.calcularIpva();
        moto1.calcularIpva();
        moto2.calcularIpva();

        System.out.println("\nFicha Técnica do primeiro carro:");
        carro1.imprimirFicha();
        System.out.println("\nFicha Técnica do segundo carro:");
        carro2.imprimirFicha();
        System.out.println("\nFicha Técnica da primeira moto:");
        moto1.imprimirFicha();
        System.out.println("\nFicha Técnica da segunda moto:");
        moto2.imprimirFicha();

        scanner.close();
    }

    // Método auxiliar para criar um carro
    private static Carro criarCarro(Scanner scanner) {
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Valor da Tabela: ");
        double valorTabela = scanner.nextDouble();
        scanner.nextLine(); // 
