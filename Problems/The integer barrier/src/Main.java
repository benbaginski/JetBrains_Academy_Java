import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tmp = scanner.nextInt();
        int sum = 0;

        while(true){
            sum += tmp;
            if(sum >= 1000){
                System.out.println(sum - 1000);
                break;
            }
            if(tmp == 0){
                System.out.println(sum);
                break;
            }
            tmp = scanner.nextInt();
        }
    }
}