import java.util.Scanner;
  
public class Main {
  public static void main(String[] args) {
    Scanner ref = new Scanner (System.in);
    
int soma = 0; 
double media = 0;
    
    for (int i = 1; i <= 6; i++){
      System.out.println("insira um número:");
      int num = ref.nextInt();
     soma = soma + num;
    }

    media = soma / 6;
    
    System.out.println("A média é:" + media);


      
  }


}
