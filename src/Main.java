import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        int m = 0;
        int h = 0;
        s = n % 60;
        m = n / 60;
        h = m / 60;
        m = m % 60;
        System.out.println( h + ":" +  m + ":" + s);
    }
}
