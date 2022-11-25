package br.edu.fafic.avaliacaoII.Questao2;

public class Gps extends Decorator {
	
	public  Gps(EquipamentosObrigatorios equipamentosObrigatorios) {
		super(equipamentosObrigatorios);
	}

	@Override
	public void adicionarEquipamentosObrigatorios() {
		super.adicionarEquipamentosObrigatorios();
		System.out.println("GPS adicionado ao carro");
		
	}

}
