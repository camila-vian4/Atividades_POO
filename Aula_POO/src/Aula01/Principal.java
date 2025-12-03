package Aula01;

public class Principal {

	public static void main(String[] args) {

		Carro carro = new Carro();
		
		carro.modelo = "Celta";
		carro.marca = "Chevrolet";
		carro.cor = "Preto";
		carro.anoFabricacao = "2005";
		carro.status();
		carro.parado();
		carro.abrirPorta();
		carro.movimento();
		

	}
}
