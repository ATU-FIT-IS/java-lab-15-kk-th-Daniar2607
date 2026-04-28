import java.util.Scanner;

public class MainTest {

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(max(a, b));
    }
}
