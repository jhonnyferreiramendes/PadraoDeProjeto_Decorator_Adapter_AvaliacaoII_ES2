package br.edu.fafic.avaliacaoII.Questao1;

public class AdaptadorVitrola implements AdaptadorLeitorDeCDs {
	
	public LeitorDeDiscos leitorDeDiscos;

	public AdaptadorVitrola(LeitorDeDiscos leitorDeDiscos) {
		this.leitorDeDiscos = leitorDeDiscos;
	}

	@Override
	public void reproduzirCD() {
		this.leitorDeDiscos.reproduzirCDAdaptado();
		
	}

	
	
	

}
