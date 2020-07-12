import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tmp = scanner.nextInt();
        while(tmp != 0){
        if(tmp%2 == 0) System.out.println("even");
            else System.out.println("odd");
        tmp = scanner.nextInt();
        }
    }
}