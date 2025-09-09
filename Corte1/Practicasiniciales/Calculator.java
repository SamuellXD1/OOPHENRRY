package calculator;
        
import java.util.Scanner;

public class Calculator {
  public Calculator(){  
      
  }
  public int add(int a, int b) {
    return a + b;
  }
  public int substract(int a, int b) {
    return a - b;
  } 
  public int multiply(int a, int b) {
    return a*b;
  }
  public double divide(int a, int b) {
    return (double) a / b;
  }
  public int modulo(int a, int b) {
    return a % b;
  }
  public static void main(String[] args) {
    Calculator myCalculator = new Calculator();

    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingresa el primer numero: ");
    int num1 = scanner.nextInt();

    System.out.print("Ingresa el segundo numero: ");
    int num2 = scanner.nextInt();

    System.out.println(myCalculator.add(num1, num2));
    System.out.println(myCalculator.substract(num1, num2));
    System.out.println(myCalculator.multiply(num1, num2));
    System.out.println(myCalculator.modulo(num1, num2));
    
    scanner.close();
  }
}
