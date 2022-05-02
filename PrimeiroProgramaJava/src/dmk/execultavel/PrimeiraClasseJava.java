package dmk.execultavel;

import curso.java.marcio.Pessoa;

public class PrimeiraClasseJava 
{ 
	public static void main(String[] args) {
		
	double nota1 = 10;	
	double nota2 = 10;
	double nota3 = 10;
	double nota4 = 8;
	
	
	double media = (nota1+nota2+nota3+nota4)/4;
	/*
	if (media >= 70) {
		
		System.out.println("Aluno aprovado: " + media);
	}
	 if(media >= 40 && media <= 69)
	 {
		 System.out.println("Aluno em Recuperacao com media "+ media);
	 }
	 else if(media < 40){
		 
		 System.out.println("Aluno Reprovado com media " + media);
	 }
	 */
	
	//Operadores ternarios
	  String SaidaResultador;
	  SaidaResultador = media>= 70? "Aluno Aprovado" :(media >= 40 && media <= 69)? "Aluno em Recuperacao" : "Aluno Reprovado";
	  
	  System.out.println(SaidaResultador);
	}
	
	
}
