package pacote;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		
		 System.out.println(" insira um número  "); 
		    int p = ref.nextInt();
		    
		    int fnu = 1;
		    int fnd= 0;
		    int resul = 0;
		    
		    
		    
		    for (int i = 1; i <= p ; i++){
		    	resul = fnu + fnd;
		    	fnd = fnu;
		    	fnu= resul;	 
		    	System.out.println(resul);
		    	
		    }
		    
		   
	
		   }
		 }

		
