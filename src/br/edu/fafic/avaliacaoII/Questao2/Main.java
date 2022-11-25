package br.edu.fafic.avaliacaoII.Questao2;

public class Main {

	public static void main(String[] args) {

		EquipamentosObrigatorios carro1 = new Carro();
		EquipamentosObrigatorios carro2 = new Carro();
		EquipamentosObrigatorios carro3 = new Carro();

		carro1 = new Airbag(carro1);
		carro1 = new ArCondicionado(carro1);

		carro2 = new Gps(carro2);
		carro2 = new Airbag(carro2);

		System.out.println("Carro 1: ");
		carro1.adicionarEquipamentosObrigatorios();

		System.out.println("\n************************************************\n");

		System.out.println("Carro 2: ");
		carro2.adicionarEquipamentosObrigatorios();
		
		System.out.println("\n************************************************\n");

		System.out.println("Carro 3: ");
		carro3.adicionarEquipamentosObrigatorios();

	}

}
