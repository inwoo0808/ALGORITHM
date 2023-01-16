import java.util.Scanner;

public class LAB2_ALGO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()) {
            int n = sc.nextInt();
            int num = 0;
            for(int i = 1; ; i++) {
                num = (num * 10) + 1;
                num = num % n;
                if(num == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}