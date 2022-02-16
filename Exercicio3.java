import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas 
		 * para formar a outra palavra. Dada uma string qualquer, desenvolva um algoritmo que encontre o n�mero de pares 
		 * de substrings que s�o anagramas.
		 * 
		 */
		
		//Vari�veis
		String palavra;
		
		//Para ler a entrada de dados
		Scanner leia = new Scanner(System.in);
						
		//L�gica
		System.out.println("Digite o texto : ");
        palavra = leia.nextLine();
		
        //Vou chamar uma fun��o para ficar melhor a compreens�o
        anagrama(palavra);
	}
	
	
	//Criando uma fun��o
	 static void anagrama( String palavra ){
	        
	        //Armazena o valor dos caracteres colocados
	        HashMap<String, Integer> mapa = new HashMap<>();
	        
	        //L�gica
	        for(int i  = 0; i <= palavra.length(); i++){
	            
	       
	            for( int j = i; j < palavra.length(); j++ ){
	                
	                //Vari�vel para armazer os caracteres
	                char[] caracter = palavra.substring(i, j+1).toCharArray();
	                Arrays.sort(caracter);
	                String subCaract = new String(caracter);
	                
	                //Verifica cada substring
	                if(mapa.containsKey(subCaract)){
	                    mapa.put(subCaract, mapa.get(subCaract) + 1);
	                }                    
	                else{
	                    mapa.put(subCaract,1);
	                }                    
	            }
	        }
	        
	        //Para fazer a verifica��o dos anagramas
	        int contaPares = 0;
	        
	        for(String cont: mapa.keySet()) {
	            
	            int n = mapa.get(cont);
	            contaPares += (n*(n-1))/2;
	        }
	        System.out.print("Quantidade de pares que s�o anagramas � de " + contaPares);
	    }
	    
	}

