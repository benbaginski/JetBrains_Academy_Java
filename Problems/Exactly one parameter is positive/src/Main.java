import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int in1 = scanner.nextInt();
        int in2 = scanner.nextInt();
        int in3 = scanner.nextInt();

        boolean result = false;

        if(in1 > 0 && in2 <= 0 && in3 <= 0) result = true;
        if(in1 <= 0 && in2 > 0 && in3 <= 0) result = true;
        if(in1 <= 0 && in2 <= 0 && in3 > 0) result = true;

        System.out.println(result);
    }
}