package atividadesLacos;
import java.util.Scanner;
public class Q3WHILE {

	public static void main(String[] args) {
	
		Scanner leia= new Scanner(System.in);
		int idade=0,soma=0,S=0;
		
		System.out.println("Escreva a sua idade: ");
		idade = leia.nextInt();
		while(idade!=-99) {
			if (idade<21 && idade!=-99)
				soma++;
			if (idade>50)
				S++;
			System.out.println("\nDigite a sua idade: ");
			idade = leia.nextInt();
		}
		System.out.println("\nA quantidade de pessoas ate 21 anos é "+soma);
		System.out.println("\nA quantidade de pessoas com 50 anos é " +S);
	
	}
	}

