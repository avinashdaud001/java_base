package pattern;

public class up_down_full_pyramid {









        public static void main(String[] args) {
            int n=6;
            patern(n);
        }

        private static void patern(int n) {
            for (int i = 1; i <=n ; i++) {
                for (int j = n-1; j >=i ; j--) {
                    System.out.print(" ");

                }
                for (int k = 1; k <=i; k++) {
                    System.out.print("* ");

                }
                System.out.println();

            }
            for (int i = n; i >=1 ; i--) {
                for (int j = n-1; j >=i ; j--) {
                    System.out.print(" ");

                }
                for (int k = 1; k <=i; k++) {
                    System.out.print("* ");

                }
                System.out.println();

            }
        }
    }






