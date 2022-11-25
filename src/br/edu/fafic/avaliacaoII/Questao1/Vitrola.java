package br.edu.fafic.avaliacaoII.Questao1;

public class Vitrola implements AdaptadorLeitorDeCDs {

	public void reproduzirDisco() {
		System.out.println("Disco de vinil inserido na vitrola...");
		System.out.println("Reproduzindo Disco de vinil na vitrola... ");
	}

	@Override
	public void reproduzirCD() {
		System.out.println("Não é possivel conectar CDs na vitrola, tente outro formado de disco");
		
	}
}
