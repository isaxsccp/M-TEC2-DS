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

// Getters e Setters
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
