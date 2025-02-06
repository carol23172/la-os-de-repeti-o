package lacosderepeticaoDoWhile;

import java.util.Scanner;

public class lacosDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		int soma, count;
		soma = 0;
		count= 0;
		  
		
		do {
			System.out.println("digeite um numero:");
			count = leia.nextInt();
			
			if (count > 0) {
				soma = count + soma;
			}
		
		}while (count != 0);
		
		System.out.println(" Ä soma dos numeros positivos e " + soma);
		
		
		
	}

}
