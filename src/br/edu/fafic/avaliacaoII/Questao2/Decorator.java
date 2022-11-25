package br.edu.fafic.avaliacaoII.Questao2;

public class Decorator extends EquipamentosObrigatorios {
	
	private EquipamentosObrigatorios equipamentosObrigatorios;
	
	

	public Decorator(EquipamentosObrigatorios equipamentosObrigatorios) {
		this.equipamentosObrigatorios = equipamentosObrigatorios;
	}



	@Override
	public void adicionarEquipamentosObrigatorios() {
		this.equipamentosObrigatorios.adicionarEquipamentosObrigatorios();
		
	}

}
