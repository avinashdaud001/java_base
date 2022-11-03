package pattern;

public class half_right {
    public static void main(String[] args) {
        int n=4;
        patern(n);
    }

    private static void patern(int n) {
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}
