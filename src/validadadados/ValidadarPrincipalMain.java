package validadadados;

import javax.swing.JOptionPane;

public class ValidadarPrincipalMain {

	public static void main(String[] args) {
		try{
			PessoaFisica pf = new PessoaFisica();
			pf.setNome(JOptionPane.showInputDialog("Digite o nome: "));
			pf.setEndere�o(JOptionPane.showInputDialog("Digite o endere�o de " + pf.getNome()));
		    pf.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade de " + pf.getNome())));
			pf.setCpf(JOptionPane.showInputDialog("Digite o cpf de "+ pf.getNome()));
			pf.setRg(JOptionPane.showInputDialog("Digite o numero do rg:" + pf.getNome()));
			pf.mostrarlocaliza�ao();
			JOptionPane.showMessageDialog(null, pf);
			pf.toString();
		}catch(Exception e){
		JOptionPane.showMessageDialog(null,e.getMessage());
		}

	}

}
