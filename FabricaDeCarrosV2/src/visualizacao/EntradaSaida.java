package visualizacao;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EntradaSaida {

	public static int solicitaOpcao() {
		
		String[] opcoes = {"Construir carro", "Vender carro", "Ver informações dos carros", "Encerrar programa"};
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a opção desejada: ", JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();
	}
	
	public static void exibeMsgEncerraPrograma() {
		JOptionPane.showMessageDialog(null, "O programa será encerrado! ");
	}
	
	public static  String solicitaModelo() {
		String modelo = JOptionPane.showInputDialog("Digite o modelo do seu veículo: ");
		return modelo;
	}
	
	public static String solicitaCor() {
		String cor = JOptionPane.showInputDialog("Digite a cor do seu veículo: ");
		return cor;
	}
	
	public static String solicitaMarca() {
		String marca = JOptionPane.showInputDialog("Digite a marca do seu veículo: ");
		return marca;
	}
	
	public static int solicitaQuantidade() {
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantos carros você deseja fabricar? "));
		return quantidade;
	}
	
}
