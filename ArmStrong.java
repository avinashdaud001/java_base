public class ArmStrong {
    static boolean armstrong(int n) {

        int rem;
        int temp = n;
        int sum = 0;
        while (n > 0) {
            rem = n % 10;
            sum += rem * rem * rem;
            n = n / 10;
        }


        if (sum == temp) {
            return true;
        } else {
            return false;

        }


    }

    public static void main(String[] args) {

//        System.out.println(armstrong(153));

        for (int i = 100; i < 1000; i++) {
            if (armstrong(i)) {
                System.out.print(i+" ");

            }
        }
    }
}


