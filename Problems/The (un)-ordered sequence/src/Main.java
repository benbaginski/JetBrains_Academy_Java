import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean desc = true;
        boolean asc = true;

        int prev = scanner.nextInt();
        int tmp = scanner.nextInt();

        while(tmp != 0){
            if(tmp > prev) desc = false;
            if(tmp < prev) asc = false;
            prev = tmp;
            tmp = scanner.nextInt();
        }

        System.out.println(asc || desc);
    }
}