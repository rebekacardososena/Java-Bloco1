package atividadelista1;

import java.util.*;

public class Lista1Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite sua idade:");
		idade = leia.nextInt();
		
		if (idade>=10 && idade<=14) {
			System.out.println("\nSua categoria � Infantil,sua idade � "+idade+" anos.");
		}
		else if(idade>=15 && idade<=17) {
			System.out.println("\nSua categoria � Juvenil,sua idade � "+idade +" anos");
		}
		else if (idade>=18 && idade<=25) { 
			System.out.println("\nSua categoria � Adulto,sua idade � "+idade+" anos");
		}
		else {
			System.out.println("\nSua categoria � invalida.");
		}

	}

}
