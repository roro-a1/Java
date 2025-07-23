// Taking inputs using Scanner class
import java.util.*; // Importing package

public class Code_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.next(); // next only takes a single token as input.
        String job = sc.nextLine();
        System.out.println(job);
        // System.out.println(name);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);

    }
}
