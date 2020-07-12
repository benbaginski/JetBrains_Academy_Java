import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int tmp = scanner.nextInt();
//        int sum = 0;
//        while(tmp != 0){
//            sum += tmp;
//            tmp = scanner.nextInt();
//        }
//        System.out.println(sum);
        int tmp;
        int sum = 0;
        do{
            tmp = scanner.nextInt();
            sum += tmp;

        } while (tmp != 0);
        System.out.println(sum);
    }
}