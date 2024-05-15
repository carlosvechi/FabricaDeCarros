package modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Fabrica extends Carro {

	private ArrayList<Carro> construirCarro = new ArrayList<Carro>();
	
	public void fabricarCarro(String cor, String modelo, String marca) {
		/*precisamos criar um objeto 'Carro' novamente, para relacionar os atributos que formarão
		 * o próprio carro.
		 * 
		 */
		Carro carro = new Carro();
		carro.setCor(cor);
		carro.setModelo(modelo);
		carro.setMarca(marca);
		construirCarro.add(carro); //esse comando serve para adicionar esses objetos na ArrayList.
	}
	
	public void exibeEstoque() {
		if(construirCarro.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Não há carros fabricados! ");
		}else {
		for(int i=0; i<construirCarro.size(); i++) {
			Carro c = construirCarro.get(i);
			JOptionPane.showMessageDialog(null, " Carro: " + (i) + "\n" + " Cor: " + c.getCor() + "\n" + " Modelo: " + c.getModelo() + "\n" + " Marca: " + c.getMarca());
			
			/* Precisamos fazer um for para percorrer ArrayList. O comando de parada será 
			 * o tamanho
			 * da nossa própria ArrayList. A linha 24 começa chamando a classe Carro e criando um 
			 * novo objeto chamado 'c'. Ele servirá para armazenar os objetos de x posição do ArrayList
			 * e usamos o nome da nossa ArrayList 'construirCarro' e adicionamos o comando .get(i).
			 * Após isso, usamos o MessageDialog para nos mostrar essas informações, usando o objeto c
			 * e o nome dos atributos que compoem nossa classe 'Carro', neste caso: getCor; getModelo e
			 * getMarca.
			 * 
			 */
		}
		}
	}
	
	public void venderCarro() {
		if(construirCarro.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Não há carros fabricados!");
		}else {

		exibeEstoque();
		
		String vendaCarro = JOptionPane.showInputDialog(null, "Digite o número do carro que deseja remover: " );
		int numeroEscolhido = Integer.parseInt(vendaCarro);
		
		if(numeroEscolhido >= 0 & numeroEscolhido < construirCarro.size()) {
			Carro removeCarro = construirCarro.remove(numeroEscolhido);
			JOptionPane.showMessageDialog(null, "Carro removido: ");
			
			/*  Na linha 43 usamos uma String para coletar o número do carro que queremos vender
			 *  Na linha 44, transformamos está String em uma variavél do tipo INT
			 *  Na 46 temos um if em que criamos uma relação entre o número digitado pelo usuário
			 *e a posição do carro na nossa ArrayList. 
			 *  Na 47 chamamos o objeto Carro novamente, criamos a variavél removeCarro, citamos
			 *novamente nossa ArrayList que contém os carros fabricados . 'remove' e o número da
			 *posição do carro que desejamos vender.   	 
			 */
		}else {
			JOptionPane.showMessageDialog(null, "Digite um número válido! ");
		}
		
	}
	}
	
}
