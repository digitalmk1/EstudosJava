package curso.java.marcio;

import javax.swing.JOptionPane;

public class Exercicio_Entrada_de_dados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros");
		String pessoa = JOptionPane.showInputDialog("Informe a quantidade de pessoas");
		
		double carroNumero = Double.parseDouble(carros);
		double PessoaPessoa = Double.parseDouble(pessoa);
		int divisao = (int) (carroNumero / PessoaPessoa);
		double resto = carroNumero % PessoaPessoa;
		
		int resposta = JOptionPane.showConfirmDialog(null,"Deseja ver o Resultado da divisão?");
		
		if(resposta == 0) {
			//System.out.println("Resto da divisão:" + resto);
			JOptionPane.showMessageDialog(null, " Resultado " + resto );
			
		
		//JOptionPane.showMessageDialog(null,"Divisão de pessoas deu : "
		//+ divisao + "O numero de pessoas deu: " + PessoaPessoa + " Resto da divisão: " + resto);
		
		//if(resto == 1) {
			
			//JOptionPane.showMessageDialog(null, "Parabéns você esta evoluindo no java");
		}
		
		//System.out.println("Quantidade de carros " +carros);
		//System.out.println("Quantidade de pessoas " +pessoa);
		//System.out.println("Resto da divisão " + resto);
		//System.out.println("Divisão " + divisao);
	}

}
