package java2;
import java.util.*;
public class java2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o Nome: ");
		String nome = scanner.nextLine();
		System.out.print("Informe o Sobrenome: ");
		String sobrenome = scanner.nextLine();
		
			if (nome.length() <= 6) {
				System.out.print(nome +" "+ sobrenome);
			}else {
				while(nome.length() > 7) {
					System.out.println("Nome Continua com Poucos Caracteris");
					System.out.print("Informe Um Novo Nome: ");
					scanner = new Scanner(System.in);
					nome = scanner.nextLine();
				}
			}
	
			
	
	}

}
