
public class JogoEletronico extends Jogo {
    private String plataforma;
    private String genero;
    
    public String getPlataforma() {
        return plataforma;
    }
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Plataforma: " + this.plataforma);
        System.out.println("Gênero: " + this.genero);
    }
    
    public String jogarOnline(int quantJogadores) {
        return "Jogando online com " + quantJogadores + " jogadores";
    }
}
