import java.util.Scanner;
  
public class Main {
  public static void main(String[] args) {
    Scanner ref = new Scanner (System.in);
    

    System.out.println("insira um número "); 
    int n = ref.nextInt();

    System.out.println("insira mais um número "); 
    int b = ref.nextInt();

    System.out.println("os números digitados foram " + n + " e " + b);

    int soma =  n + b;
    System.out.println("a soma dos números é  " + soma);
  }


}
