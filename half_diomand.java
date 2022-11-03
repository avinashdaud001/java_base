package pattern;
//        *
//        * *
//        * * *
//        * * * *
//        * * * *
//        * * *
//        * *
//        *

public class half_diomand {



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
            for (int i = n; i >=1 ; i--) {
                for (int j = 1; j <=i ; j++) {
                    System.out.print("* ");

                }
                System.out.println();

            }
        }
    }


