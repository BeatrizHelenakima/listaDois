import java.util.Scanner;
  
public class Main {
  public static void main(String[] args) {
    Scanner ref = new Scanner (System.in);
    

    System.out.println("insira um número "); 
    int n = ref.nextInt();

    if (n % 2 == 0) {
      System.out.println(n + "é um número par");
    }
    if (n % 2 == 1) {
      System.out.println(n + "é um número impar");
        }
  }


}
