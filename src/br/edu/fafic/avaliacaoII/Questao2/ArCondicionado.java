package br.edu.fafic.avaliacaoII.Questao2;

public class ArCondicionado extends Decorator {
	
	public  ArCondicionado(EquipamentosObrigatorios equipamentosObrigatorios) {
		super(equipamentosObrigatorios);
	}

	@Override
	public void adicionarEquipamentosObrigatorios() {
		super.adicionarEquipamentosObrigatorios();
		System.out.println("Ar condicionado adicionado ao carro");
		
	}

}
