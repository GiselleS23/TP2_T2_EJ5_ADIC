/* 5.- El recíproco de un número se calcula como 1 dividido por el número n. Desarrolle un programa que calcule el 
recíproco de un número n verificando que n!=0 
Sacchetti Maria Giselle C2*/

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double num;
    double recipNum;

    System.out.print("Ingrese un número: ");
    num = scanner.nextDouble();

    while (num == 0) {
      System.out.print("El numero no puede ser cero, ingrese nuevamente: ");
      num = scanner.nextDouble();
    }
    recipNum = 1 / num;
    System.out.println("El recíproco del número es: " + recipNum);

    scanner.close();
  }
}