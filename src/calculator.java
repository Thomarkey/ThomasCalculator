import java.util.Scanner;

public class calculator {

    private static final Scanner scanner = new Scanner(System.in);

    private static String operation = null;
    private static int result = 0;
    private static int newResult = 0;
    private static int a = 0;
    private static int b = 0;

    public static void main(String[] args) {
        System.out.println("whats your name");
        String abc = scanner.nextLine();
        System.out.println("welcome to your calculator " + abc);

        System.out.println("enter your int");
        int a = scanner.nextInt();
        scanner.nextLine();

        System.out.println("give operation");
        String operation = scanner.nextLine();

        System.out.println("give second int");
        int b = scanner.nextInt();
        scanner.nextLine();

        switch (operation) {
            case "*":
                result = (a * b);
                break;
            case "/":
                result = (a / b);
                break;
            case "+":
                result = (a + b);
                break;
            case "-":
                result = (a - b);
                break;
            default:
        }

        System.out.println("give new operation or = for result");
        String newOperation = scanner.nextLine();

        while (!(newOperation.equals("="))) {
            System.out.println("enter your int");
            int c = scanner.nextInt();
            scanner.nextLine();
            switch (newOperation) {
                case "*":
                    newResult = (result * c);
                    break;
                case "/":
                    newResult = (result / c);
                    break;
                case "+":
                    newResult = (result + c);
                    break;
                case "-":
                    newResult = (result - c);
                    break;
                default:
            }
            result = newResult;
            System.out.println("give new operation or = for result");
            newOperation = scanner.nextLine();
        }
        System.out.println("your result:" + result);

    }
}


