import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espa�os. 
		 * A base e altura da escada devem ser iguais ao valor de n. A �ltima linha n�o deve conter nenhum espa�o.
		 */
		
		//Vari�veis
		List<String> degraus = new ArrayList<>();
		int n; //n � a quantidade de degraus para a base e altura da escada
		
		//Para ler a entrada de dados
		Scanner leia = new Scanner(System.in);
		
		//L�gica
		System.out.println("Digite a altura da escada: ");
		n = leia.nextInt();
		
		//Imprime o loop da escada
		for (int i = 0; i < n; i++) {
			degraus.add(" ".repeat(n - i) + "*".repeat(i + 1));
		}
			 
		for (String d : degraus ) {
				System.out.println(d);
		}
		

	}

}
