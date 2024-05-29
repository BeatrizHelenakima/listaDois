package pacote;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
	      String resp =ref.nextLine();
	    
    	   System.out.println("você escovou os dentes hoje?"); 
    	      resp =ref.nextLine();
    	    
    	    if ((resp == "sim") && (resp == "nao")) {
    	       if (resp == "sim") {
    	    	   System.out.println("1");
    	    	    }else {
    	    		 System.out.println("0");
    	    	    }
    	    } else {
    	    	System.out.println("Essa resposta não consta");
    	    }
    	       
		    }
		 
			}
		    
		    
		  
		
