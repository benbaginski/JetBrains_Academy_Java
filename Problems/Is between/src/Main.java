import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int in1 = scanner.nextInt();
        int in2 = scanner.nextInt();
        int in3 = scanner.nextInt();

        System.out.println((in2<=in1 && in3>=in1) || (in2>=in1 && in3<=in1));
    }
}