import java.util.Scanner;

class Operation {

    void calculate(int number) {
        System.out.println("Generic operation");
    }
}

class Square extends Operation {

    void calculate(int number) {
        System.out.println("Square of " + number + " is: " + (number * number));
    }
}

class Cube extends Operation {

    void calculate(int number) {
        System.out.println("Cube of " + number + " is: " + (number * number * number));
    }
}

public class MethodBinding {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num = scan.nextInt();

        System.out.println("Choose operation:");
        System.out.println("1. Square");
        System.out.println("2. Cube");

        int choice = scan.nextInt();

        Operation op;

        if (choice == 1) {
            op = new Square();
        } else {
            op = new Cube();
        }

        op.calculate(num);

        scan.close();
    }
}