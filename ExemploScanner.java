import java.util.Scanner; //importação necessária

	public class ExemploScanner {
		public static void main(String[] args) {
			
			//2. Criação do objeto 
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Digite seu nome: ");
			String nome = sc.nextLine(); //lê uma linha de texto
			
			System.out.print("Digite sua idade: ");
			int idade = sc.nextInt(); //lê um número inteiro
			
			System.out.println("Olá, " + nome + "! Você tem " + idade + " anos");
			
			//fechamento do recurso
			sc.close();
			
		}
		
	}


