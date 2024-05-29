package pacote;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int p = 1;
		Scanner ref = new Scanner(System.in);
		int cont = 0;
		int soma = 0;
		double med = 0;
		
       while(p > 0) {
    	   System.out.println(" insira um número  "); 
		 p = ref.nextInt();
		    
		    if (p > 0 ) {
		    	soma = p + soma;	
		    } else {
		    	med = soma/p;
		    }
		    	
		    }
		    
		  
			}
}
		    
		    
		  
		
