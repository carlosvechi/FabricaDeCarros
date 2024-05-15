package controle;


import javax.swing.JOptionPane;

import modelo.*;
import visualizacao.EntradaSaida;

public class Controladora {
	
	public void exibeMenu() {
		
		int opcao;
		
		Fabrica fabrica = new Fabrica();
		Carro carro = new Carro();
		

		
		do {
			opcao = EntradaSaida.solicitaOpcao(); 
			
			switch(opcao) {
			case 0:
				/*
				 * em vez de fazer uma linha de 'EntradaSaida.solicitaCor' (e demais)
				 *  podemos facilitar isso
				 * jogando como atributo direto no objeto do 'carro'
				 * 
				 */
				int quantidade = EntradaSaida.solicitaQuantidade();
				
				for(int i=0; i<quantidade; i++) {
				carro.setCor(EntradaSaida.solicitaCor()); 
				carro.setModelo(EntradaSaida.solicitaModelo());
				carro.setMarca(EntradaSaida.solicitaMarca());
				fabrica.fabricarCarro(carro.getCor(), carro.getModelo(), carro.getMarca());
				
				/*armazenando os atributos que formarão o carro para a classe 'Carro' e
				 * adicionando na classe Controladora, iremos repassar todos esses atributos
				 * para a classe 'Fabrica', onde receberá estes atributos necessários para a
				 * fabricacão do veículo. Usando como parâmetro o objeto 'carro' que está 
				 * instanciado nossa classe 'Carro' . e o nome do método que formará o carro,
				 * ou seja, 'getCor()', 'getModelo()' e 'getMarca()'. Lembrando que o GET será
				 * o que retornará os atributos.
				 * 
				 */
				}
				
				break;
			case 1:
				fabrica.venderCarro();
				break;
			case 2:
				fabrica.exibeEstoque();
				
				break;
			}
			
		}
		while(opcao !=3);
		EntradaSaida.exibeMsgEncerraPrograma();
		
		System.exit(0);
	}
	
}
