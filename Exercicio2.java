import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Débora se inscreveu em uma rede social para se manter em contato com seus amigos. 
		 * A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. 
		 * O site considera uma senha forte quando ela satisfaz os seguintes critérios:
		 *		Possui no mínimo 6 caracteres.
		 *		Contém no mínimo 1 digito.
		 *		Contém no mínimo 1 letra em minúsculo.
		 *		Contém no mínimo 1 letra em maiúsculo.
		 *		Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
		 *	Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte. 
		 *	Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados 
		 *	para uma string qualquer ser considerada segura.
		 */
		
		//Variáveis
		String senha;
		int qtC;
				
		//Para ler a entrada de dados
		Scanner leia = new Scanner(System.in);
				
		//Lógica
		System.out.println("Digite sua senha: ");
		senha = leia.next();
		
		String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[!@#$%^&*()-+])"
                + "(?=\\S+$).{6}$";
		
		//Combinar a senha fornecida com o regex
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(senha);
		
		
		//Verifica a quantidade de caracteres da senha
		if(senha.length()<6) {
			   qtC = 6 - senha.length();
			   System.out.println("Deve ser adicionados " + qtC + " caracters para a senha ser segura");
		   }
		
	}

}
