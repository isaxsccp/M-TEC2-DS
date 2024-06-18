
public class JogoFisico extends Jogo {
    
    private int quantJogadores;
    private double tempoPartida;
    
    public int getQuantidadeJogadores() {
        return quantJogadores;
    }
    public void setQuantidadeJogadores(int quantidadeJogadores) {
        this.quantJogadores = quantidadeJogadores;
    }
    public double getTempoPartida() {
        return tempoPartida;
    }
    public void setTempoPartida(double tempoPartida) {
        this.tempoPartida = tempoPartida;
    }

    public double calcularTempoTotal(int quantPartidas) {
        return tempoPartida * quantPartidas;
    }
    
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Quantidade de Jogadores: " + this.quantJogadores);
        System.out.println("Tempo de Partida: " + this.tempoPartida + " horas");
    }
}
