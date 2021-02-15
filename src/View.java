// Aluno: Eduardo Luiz Pontes de Souza - UC19100270
import javax.swing.JOptionPane;

public class View { // Classe padr�o para uso do JOptionPane
	// Exibir mensagem
	static void exibirMensagem(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}

	// Inserir string
	static String inserir_string(String msg) {
		return JOptionPane.showInputDialog(msg);
	}

	// Inserir inteiro
	static int inserir_int(String msg) {
		String retorno = JOptionPane.showInputDialog(msg);
		return Integer.parseInt(retorno);
	}

	// Exibir erro
	static void exibirERRO(String msg, String titulo) {
		JOptionPane.showMessageDialog(null, msg, titulo, JOptionPane.ERROR_MESSAGE);
	}
}