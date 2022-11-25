package br.edu.fafic.avaliacaoII.Questao2;

public class Airbag extends Decorator{
	
	public Airbag(EquipamentosObrigatorios equipamentosObrigatorios) {
		super(equipamentosObrigatorios);
	}

	@Override
	public void adicionarEquipamentosObrigatorios() {
		super.adicionarEquipamentosObrigatorios();
		System.out.println("Airbag adicionado ao carro ");
		
	}

}
