package pacote;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
	   
		 int maior  = 0; 
		 
		     
		 for (int i = 1; i <= 3; i++){
		  System.out.println("insira um número:");
		   int num = ref.nextInt();
		      if (maior < num) {
		    	 maior = num;
		        } 
		       }
		     
		    System.out.println("O número maior é " + maior);


		       
		   }
		 }

		
