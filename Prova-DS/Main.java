public class Main {

    public static void main(String[] args) {
        // INSTANCIANDO LIVRO
    	
    	System.out.println("Informações adicionais inseridas:"); 
    	System.out.println("");
    	
        Livro l1 = new Livro("Harry Potter e a câmara secreta", "J. K. Rowling", 2017, 224, "Rocco Ltda.");
        l1.exibirDetalhes(false);

        // INSTANCIANDO REVISTA
        Revista r1 = new Revista("Veja", "Mauricio Lima", 2004, 241, "Editora Abril");
        r1.exibirDetalhes(false);

        System.out.println("");
        System.out.println("Informações do livro:");
        System.out.println("");
        l1.exibirDetalhes();
        System.out.println();
        System.out.println("Informações da revista:");
        System.out.println("");
        r1.exibirDetalhes();
    }

}
