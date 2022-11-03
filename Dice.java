package recursion;

public class Dice {
    public static void main(String[] args) {
        int target=4;
        String p="";
        add(p,target);
    }
    static void add(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=6&&i<=target ; i++) {
            add(p+i,target-i);

        }
    }
}
