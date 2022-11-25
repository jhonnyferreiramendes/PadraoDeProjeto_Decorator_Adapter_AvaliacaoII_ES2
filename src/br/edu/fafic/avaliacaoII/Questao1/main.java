package br.edu.fafic.avaliacaoII.Questao1;

public class main {

	public static void main(String[] args) {
		
		
		Vitrola vitrola = new Vitrola();
		
	
		vitrola.reproduzirDisco();
		System.out.println("...");
		vitrola.reproduzirCD();
		System.out.println("...");
		
		AdaptadorVitrola adaptadorVitrola = new AdaptadorVitrola(new LeitorDeDiscos());
		
		adaptadorVitrola.reproduzirCD();;

	}

}
