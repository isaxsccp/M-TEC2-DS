public class Revista extends Publicacao {
		private int numEdicao;
		private String mesPublicacao;

		public Revista(String titulo, String autor, int anoPublicacao, int numEdicao, String mesPublicacao) {
		    super(titulo, autor, anoPublicacao);
		    this.numEdicao = numEdicao;
		    this.mesPublicacao = mesPublicacao;
		}
		
	    public int getNumEdicao() {
	        return numEdicao;
	    }

	    public void setNumEdicao(int numEdicao) {
	        this.numEdicao = numEdicao;
	    }

	    public String getMesPublicacao() {
	        return mesPublicacao;
	    }

	    public void setMesPublicacao(String mesPublicacao) {
	        this.mesPublicacao = mesPublicacao;
	    }

	    @Override
	    public void exibirDetalhes() {
	        super.exibirDetalhes();
	        System.out.println("A quantidade de páginas é: " + this.numEdicao);
	        System.out.println("A editora é: " + this.mesPublicacao);
	    }

	    void exibirDetalhes(boolean exibicao) {
			if (exibicao == false){
				System.out.println("número da edição: "+this.numEdicao);
			}else 
				System.out.println("número da edição: "+this.numEdicao);
				System.out.println("mês da publicação: "+this.mesPublicacao);
		}
		
	}
