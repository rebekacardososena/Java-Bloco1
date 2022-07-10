package atividadelista1;

import java.util.Scanner;

public class Lista1Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n1,n2,n3;
	Scanner leia = new Scanner(System.in);
	
	System.out.println("\nDigite o primeiro valor");
	n1 = leia.nextInt();
	System.out.println("\nDigite o segundo valor");
	n2 = leia.nextInt();
	System.out.println("\nDigite o terceiro valor:");
	n3 = leia.nextInt();
	
	if (n1>n2 && n1>n3){
		
	System.out.println("\nO maior valor foi o primeiro: "+n1);
	}
	else if(n2>n1 && n2>n3) {
		
    System.out.println("\nO maior valor foi o segundo: "+n2);
 
	}
	else {
		
	System.out.println("\nO  maior valor foi o terceiro: "+n3);
	
	}
}
}