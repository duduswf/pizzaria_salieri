// Aluno: Eduardo Luiz Pontes de Souza - UC19100270
public class Executora {
	public static void main(String[] args) {

		new Imagem(); // Insere o plano de fundo atrav�s do m�todo Imagem.java

		try {
			MenuPizza c = Util.subMenuPizza(0); // Chama o m�todo MenuPizza que dar� come�o ao programa
			View.exibirMensagem("NOTA DO PEDIDO: \n\n" + c.toString());// Imprime a nota a ser impressa do
																		// atendente/cliente
		} catch (Exception e) {
			View.exibirERRO(e.getMessage(), "ERRO");
		}
	}
}
