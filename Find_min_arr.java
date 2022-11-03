public class Find_min_arr {
    static int min(int []a){
        int min=a[0];
        for (int i = 0; i < a.length; i++) {
            if(min>a[i]){
              min=a[i];

            }

        }
        return min;
    }

    public static void main(String[] args) {
        int []b={12,1,31,5,7,6};
        ;
        System.out.println(min(b));
    }
}
