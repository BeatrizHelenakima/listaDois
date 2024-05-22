
import java.util.Scanner;
  
public class Main {
  public static void main(String[] args) {
    Scanner ref = new Scanner (System.in);
    

    System.out.println(" coloque um ano "); 
    int ano = ref.nextInt();

    if (ano % 4 == 0) {
      System.out.println( ano + "é um ano bissexto");
    }
    if (ano % 4 == 1) {
      System.out.println(ano + " não é um ano bissexto");
    }
  }


}
