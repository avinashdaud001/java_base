package pattern;

public class half_right_rotated_down {



        public static void main(String[] args) {
            int n=4;
            patern(n);
        }

        private static void patern(int n) {
            for (int i = n; i >=1 ; i--) {
                for (int j = 1; j <=i ; j++) {
                    System.out.print("* ");

                }
                System.out.println();

            }
        }
    }



