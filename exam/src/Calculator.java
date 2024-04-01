import java.util.Scanner;

public class Calculator {
    // Metode untuk mengurangi dua bilangan
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Metode untuk mengalikan dua bilangan
    public static int multiply(int a, int b) {
        return a * b;
    }

    //
public static double divide(int a, int b) {
    if(b == 0) {
        throw new ArithmeticException ("Tidak membagikan dengan bilangan nol");
}

} 

return(double)a/b;

}

public static void main(String [] args) {
    Scanner input1 = new Scanner(System.in);
int num1 = input1.nextInt();
System.out.println("Silahkan masukan angka yang anda inginkan: ");
Scanner input2 = new Scanner(System.in);
int num2 = input2.nextInt();
System.out.println("Silahkan masukan angka yang anda inginkan: ");

    int difference = subtract(num1, num2);
    System.out.println("Difference: " + difference);
}