package controller;
import br.edu.fateczl.hugobispo.pilhaint.Pilha;

public class NPRController {
	
	public void insereValor(Pilha p, int dado) {
		p.push(dado);
	}
	
	public String npr(Pilha p, String dado) {
		int resultado1 = 0;
		String resultado = "";
		int valor1 = 0;
		int valor2 = 0;
				
		try {
			valor1 = p.pop();
			valor2 = p.pop();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		switch (dado) {
		case "+":
			System.out.print(dado);
			resultado1 = valor1 + valor2;
			p.push(resultado1);
			break;
		case "-":
			System.out.print(dado);
			resultado1 = valor1 - valor2;
			p.push(resultado1);
			break;
		case "/":
			System.out.print(dado);
			resultado1 = valor1 / valor2;
			p.push(resultado1);
			break;
		case "*":
			System.out.print(dado);
			resultado1 = valor1 * valor2;
			p.push(resultado1);
		}
		
		while((p.isEmpty()==false)){ // Encontrar uma solucao para somente remover 2
			try {
				int valor = p.pop();
				resultado += "\n" + Integer.toString(valor);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Valor 1" + valor1 + "Valor 2" + valor2 + "Resultado =" +resultado1);
		return resultado;
	}

}
