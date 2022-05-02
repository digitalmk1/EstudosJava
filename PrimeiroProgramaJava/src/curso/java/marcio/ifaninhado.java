package curso.java.marcio;

public class ifaninhado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double nota1 = 10;	
		double nota2 = 90;
		double nota3 = 90;
		double nota4 = 90;
		
		
		double media = (nota1+nota2+nota3+nota4)/4;
		
		if(media >=50) {
			
			if(media>=70) {
				System.out.println("Aluno Aprovado Direto " + media);
			} 
			else 
			{
				System.out.println("Aluno em recuperacao " + media);
			}
			}
		     else
			
			{
				System.out.println("Aluno em Reprovado direto com media " + media);
			
			
		}

	}

}
