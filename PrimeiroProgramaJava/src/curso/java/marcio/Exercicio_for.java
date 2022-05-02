package curso.java.marcio;

public class Exercicio_for {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		for(int numero = 0; numero <=10; numero++) {
			if(numero == 3 || numero == 6 || numero == 9 ) {
				System.out.println("Oba encontrei o numero "+ numero);
				continue;
			}
			System.out.println("Processando laço de repetição");
		}
	}
}
