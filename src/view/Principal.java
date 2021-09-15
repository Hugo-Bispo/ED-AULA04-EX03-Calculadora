package view;
import javax.swing.JOptionPane;
import controller.NPRController;
import br.edu.fateczl.hugobispo.pilhaint.Pilha;

public class Principal {
	public static void main(String[] args) {
		Pilha p = new Pilha();
		NPRController Cont = new NPRController();
		
		String dado = "";
		String resultado = "";
		int numero = 0;

		boolean validador = true; 
		while(validador==true) {
			dado = (JOptionPane.showInputDialog("Digite um numero ou operação, \nPara cancelar não Digite nada"));
			if (dado.isEmpty()){
				break;
			}
			try {
				numero = Integer.parseInt(dado);
				Cont.insereValor(p,numero);
			}
			catch(Exception NumberFormatException){
				resultado=Cont.npr(p, dado);
			}
			
			JOptionPane.showMessageDialog(null," Resultado da operação " + resultado);
		}
	}	
}