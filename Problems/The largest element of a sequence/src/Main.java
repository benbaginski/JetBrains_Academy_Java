import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int tmp = scanner.nextInt();
        int max = tmp;

        while(tmp != 0){
            if(tmp > max) max = tmp;
            tmp = scanner.nextInt();
        }

        System.out.println(max);
    }
}