import java.util.Scanner;

public class Calculator {
    public static int subtract(int a, int b) {
        return a - b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }
    
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }
 
    public static double divide(int a, int b) {
        if(b == 0) {
            throw new ArithmeticException("Tidak dapat membagi bilangan dengan nol");
        }
        return (double) a/b;
    }

    public static double divide(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("Tidak dapat melakukan pembagian dengan nol.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan bilangan yang anda ingin di kurangi: ");
        int num1Int = input.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Masukkan bilangan yang anda ingin di kurangi: ");
        int num2Int = input2.nextInt();
        Scanner input3 = new Scanner(System.in);
        System.out.println("Masukkan bilangan yang anda inginkan: ");
        double num1Double = input3.nextDouble();
        Scanner input4 = new Scanner(System.in);
        System.out.println("Masukkan bilangan yang anda inginkan: ");
        double num2Double = input4.nextDouble();
        System.out.println("Masukkan bilangan yang anda inginkan: ");
        int differenceInt = subtract(num1Int, num2Int);
        System.out.println("Difference (int): " + differenceInt);


        double differenceDouble = subtract(num1Double, num2Double);
        System.out.println("Difference (double): " + differenceDouble);

        int productInt = multiply(num1Int, num2Int);
        System.out.println("Product (Int): " + productInt);

        double productdDouble = multiply(num1Double, num2Double);
        System.out.println("Product (Double): " + productdDouble);

        try{
            double quotientInt = divide(num1Int, num2Int);
            System.out.println("Quotient (Int): " + quotientInt);
           } catch (ArithmeticException e) {
            System.out.println("Error (int): " + e.getMessage());
           }
           try {
            double quotientDouble = divide(num1Double, num2Double);
            System.out.println("Quotient (double): " + quotientDouble);
        } catch (ArithmeticException e) {
            System.out.println("Error (double): " + e.getMessage());
        }
        }
}

    