package Aula01;

public class Carro {

	String modelo;
	String marca;
	String cor;
	String anoFabricacao;
		
	public boolean emMovimento = false;
	public boolean portaAberta = false;
	
	void status() {
		
		System.out.println("• Modelo: " + this.modelo);
		System.out.println("• Marca: " + this.marca);
		System.out.println("• Cor: " + this.cor);
		System.out.println("• Ano fabricação: " + this.anoFabricacao);
	}
		
	public boolean movimento() {
			
		if(!portaAberta) {
			emMovimento = true;
			System.out.println("\n– O carro está em movimento! 🚗");
			return true;
				
		} else {
			System.out.println("\n– ERRO! Não é possível o carro entrar em movimento com a porta aberta. 🚗");
			return false;
			
		}
			
	}
		public boolean parado() {
			emMovimento = false;
			System.out.println("\n– O carro está parado! 🚗");
			return true;
			
		}

		public boolean abrirPorta() {
	        if (!emMovimento) {
			portaAberta = true;
			System.out.println("\n– Porta aberta! 🚗");
			return true;
				
		} else {
			System.out.println("\n– ERRO! Não é possível abrir a porta com o carro em movimento.");
			return false;
		}	
	}

		public boolean fecharPorta() {
			portaAberta = false;
			System.out.println("\n– Porta fechada! 🚗");
			return true;
		}
			
}