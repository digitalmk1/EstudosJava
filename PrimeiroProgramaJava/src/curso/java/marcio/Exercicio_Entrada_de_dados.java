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
		
		int resposta = JOptionPane.showConfirmDialog(null,"Deseja ver o Resultado da divis�o?");
		
		if(resposta == 0) {
			//System.out.println("Resto da divis�o:" + resto);
			JOptionPane.showMessageDialog(null, " Resultado " + resto );
			
		
		//JOptionPane.showMessageDialog(null,"Divis�o de pessoas deu : "
		//+ divisao + "O numero de pessoas deu: " + PessoaPessoa + " Resto da divis�o: " + resto);
		
		//if(resto == 1) {
			
			//JOptionPane.showMessageDialog(null, "Parab�ns voc� esta evoluindo no java");
		}
		
		//System.out.println("Quantidade de carros " +carros);
		//System.out.println("Quantidade de pessoas " +pessoa);
		//System.out.println("Resto da divis�o " + resto);
		//System.out.println("Divis�o " + divisao);
	}

}
