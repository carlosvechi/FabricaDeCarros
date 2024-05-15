package modelo;
public class Carro {

	private String cor;
	private String modelo;
	private String marca;
	
	/*o método 'get' retorna um valor, então, ele deverá ser um método declarado (int, String, boolean, etc)
	 * o método set, vai atribuir o valor que contém na variavél, no nosso atributo, então,
	 * ele deverá ser um método VOID, sendo usado como parâmetro a variavél. 
	 * 
	 */
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
}
