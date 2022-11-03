public class counted_digit_is_ven_od {
    static boolean even(int n){ //step 2
      int  num=digit(n);
        if(num%2==0){
            return true;
        }
        return false;
    }
  static int   digit(int n){  // step 1
      int count=0;
      if(n<0){
          n=n*-1;
      }
      if(n==0){
          return 1;
      }
      while(n>0){
          count++;
          n=n/10;
      }
      return count;
  }
  static int total(int arr[]){ //SteP 3
        int count=0;
      for (int i = 0; i <arr.length ; i++) {
          if(even(arr[i])){
              count++;
          }

      }
      return count;
  }
    public static void main(String[] args) {
        int[] n={1,22,3,6,7,8546,9,1245};

        System.out.println( total(n));

    }
}
