package pacote;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		
		 System.out.println(" coloque um ano "); 
		    int p = ref.nextInt();

		    if (p % 2 == 0) {
		      System.out.println( p + " não é um número primo");
		    }
		    if (p % 2 == 1) {
		      System.out.println(p + " é um número primo");
		    }
	
	
		   }
		 }

		
