import java.util.ArrayList;

public class find_all_duplicate_target {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 4, 5};
        int target = 4;
        System.out.println(find(arr, target, 0));
    }

    static ArrayList<Integer> list = new ArrayList<>();


    private static ArrayList<Integer> find(int[] arr, int target, int i) {
        if (i == arr.length) {


            return null;
        }

        if (target == arr[i]) {
            list.add(i);
        }
             find(arr, target, i + 1);

        return list;
    }
}
