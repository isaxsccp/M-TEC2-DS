import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        JogoEletronico je1 = new JogoEletronico();
        
        System.out.println("Digite o nome do jogo eletrônico:");
        je1.setNome(in.next());
        System.out.println("Digite o preço do jogo eletrônico:");
        je1.setPreco(in.nextDouble());
        System.out.println("Digite a distribuidora do jogo eletrônico:");
        je1.setDistribuidora(in.next());
        System.out.println("Digite a plataforma do jogo eletrônico:");
        je1.setPlataforma(in.next());
        System.out.println("Digite o gênero do jogo eletrônico:");
        je1.setGenero(in.next());

        JogoFisico jf1 = new JogoFisico();
        
        System.out.println("Digite o nome do jogo físico:");
        jf1.setNome(in.next());
        System.out.println("Digite o preço do jogo físico:");
        jf1.setPreco(in.nextDouble());
        System.out.println("Digite a distribuidora do jogo físico:");
        jf1.setDistribuidora(in.next());
        System.out.println("Digite a quantidade de jogadores do jogo físico:");
        jf1.setQuantidadeJogadores(in.nextInt());
        System.out.println("Digite o tempo de partida do jogo físico:");
        jf1.setTempoPartida(in.nextDouble());
        
        System.out.println("Modo jogar online - Digite a quantidade de jogadores:");
        int quantJogadoresOnline = in.nextInt();
        System.out.println(je1.jogarOnline(quantJogadoresOnline));
        
        System.out.println("Modo jogo físico - Digite a quantidade de partidas:");
        int quantPartidas = in.nextInt();
        System.out.println("Tempo total de jogo físico: " + jf1.calcularTempoTotal(quantPartidas) + " horas");
        
        System.out.println("\nInformações do jogo eletrônico:");
        je1.exibirInfo();
        
        System.out.println("\nInformações do jogo físico:");
        jf1.exibirInfo();
        
        in.close();
    }
}
