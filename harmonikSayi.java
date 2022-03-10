import java.util.Scanner;
/**
 * harmonikSayi
 */
public class harmonikSayi {

  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.println("Girilen Sayının Harmonik Sonucunu Bulan Programa Hoşgeldiniz:");

    System.out.print("Bir Sayı Giriniz: ");

    double n = input.nextDouble();

    double result = 0;

    double i = 1;

    while (i <= n){

      result += (1 / i);

      i++;
    }

      System.out.println(result);

      input.close();
  }
}