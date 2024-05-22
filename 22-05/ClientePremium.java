public class ClientePremium extends Cliente {
   
	@Override
   public double calcula_Desconto() {
       double valorPedido = getValor_pedido();
       double desconto = valorPedido * 0.15;
       double valorPromocional = valorPedido - desconto;
setValor_promocional(valorPromocional);
       return valorPromocional;
   }
}
