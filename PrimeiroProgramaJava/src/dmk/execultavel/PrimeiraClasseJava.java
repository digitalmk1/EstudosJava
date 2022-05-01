package dmk.execultavel;

import curso.java.marcio.Pessoa;

public class PrimeiraClasseJava 
{ 
	public static void main(String[] args) {
		
	Pessoa pessoa = new Pessoa();
	pessoa.setEmail("pessoa@gmail.com");
	pessoa.setNome("Marcio");
	pessoa.setSobrenome("Silva de Oliveira");
	
	System.out.println("Nome:" + pessoa.getNome());
	System.out.println( pessoa.getSobrenome());
	System.out.println("Email"+ pessoa.getEmail());
	
	System.out.println("====================================");
	Pessoa p = new Pessoa();
	p.setEmail("pessoa2@gmail.com");
	p.setNome("Marcio2");
	p.setSobrenome("Oliveira");
	
	System.out.println("Nome:" + p.getNome());
	System.out.println(p.getSobrenome());
	System.out.println("Email: "+ p.getEmail());
	}
	
	
  

}
