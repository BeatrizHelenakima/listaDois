import java.util.Scanner;
  
public class Main {
  public static void main(String[] args) {
    Scanner ref = new Scanner (System.in);
    

    System.out.println("insira um número "); 
    int n = ref.nextInt();
    int fat = 1;

    for (int i = 1; i <= n; i++){

      fat = fat * i;
    }
    System.out.println("a fatorial de " + n + " é " + fat);

      
  }

}
