public class count_zero {

        public static void main(String[] args) {
            int n=10305;
int count =0;
          int ans=  rev(n,count);
            System.out.println(ans);
        }
        static int rev(int n, int count){

            if(n==0){
                return count;
            }


            if (n % 10 == 0) {
             return    rev(n/10,count+1);
            }
          return   rev(n/10,count);



        }
    }


