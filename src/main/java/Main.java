/* 5.- El recíproco de un número se calcula como 1 dividido por el número n. Desarrolle un programa que calcule el 
recíproco de un número n verificando que n!=0 
Sacchetti Maria Giselle C2*/

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int num;
    double recipNum;

    System.out.print("Ingrese un número: ");
    num = scanner.nextInt();

    while (num == 0) {
      System.out.print("El numero no puede ser cero, ingrese nuevamente: ");
      num = scanner.nextInt();
    }

    
    recipNum = (1.0 / num); // Convierto 1 a double para que la división sea decimal
    System.out.println("El recíproco del número es: 1/" + num);
    

    scanner.close();
  }
}