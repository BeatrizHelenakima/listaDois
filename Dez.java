package pacote;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		

	  System.out.println("insira um número");
	    int lU = ref.nextInt();
	    

	   System.out.println("insira um número");
	    int lD = ref.nextInt();
	    
	    System.out.println("insira um número");
	    int lT = ref.nextInt();
	       
	    if ( lU > (lD-lT) && (lU < (lD + lT) )) {
	       if (((lU = lD) != lT)  || ((lU = lT) != lD) || ((lD = lT) != lU)) { 
		    System.out.println("o triangulo é isoceles." );
	               }
	       if ((lU != lD) && (lU != lT) && (lD != lT)) {
	    	 System.out.println("o triangulo é escaleno");
	    	       }
	        if ((lU == lD) && (lU == lT ) && (lD == lT)) {
	    	 System.out.println("o triangulo é equilatero");	 
	               }
	    } else {
	    	System.out.println(" não é um triangulo");
	    }
		       
		   }
		 }

		
