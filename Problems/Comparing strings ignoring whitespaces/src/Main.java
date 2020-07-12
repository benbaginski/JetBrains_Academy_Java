import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        int result = input1.replaceAll(" ", "").compareTo(input2.replaceAll(" ", ""));

        if(result == 0) System.out.println("true");
        else System.out.println("false");
    }
}