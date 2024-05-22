public class Cliente {
    private String nome;
    private int idade;
    private String endereco;
    private double valor_pedido;
    private double valor_promocional;
   
    //GET E SET
    public String getNome() {
        return nome;
    }
    public void setNome (String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade (int idade) {
        this.idade = idade;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco (String endereco) {
        this.endereco = endereco;  
    }
    public double getValor_promocional() {
        return valor_promocional;
    }
    public void setValor_promocional (double valor_promocional) {
        this.valor_promocional = valor_promocional;
    }
    public double getValor_pedido() {
        return valor_pedido;
    }
    public void setValor_pedido (double valor_pedido) {
        this.valor_pedido = valor_pedido;
    }
 
    
    //MÉTODOS
    
    public double calcula_Desconto() {      
        double desconto = this.valor_pedido - (this.valor_pedido * 0.1);
        this.setValor_promocional(desconto);
        return desconto;
    }
}
