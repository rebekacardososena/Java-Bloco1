package atividadesLacos;

import java.util.Scanner;

public class Q5DOWHILE {

	public static void main(String[] args) {
	
		Scanner scanner= new Scanner(System.in);
		int x,soma=0;
		
		do {
			System.out.println("Entre com um numero para realizar a soma (a contagem se encerra quando for digitado o valor 0)");
			x = scanner.nextInt();
			soma = soma+x;
		}while(x>0);	
	System.out.println("\nA soma dos valores foram:"+soma);
	}
}
