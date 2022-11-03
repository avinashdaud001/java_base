public class count_vovels {
    public static void main(String[] args) {
        int count = 0;
        String b = "do Select";
        char a[] = new char[b.length()];
        for (int i = 0; i < a.length; i++) {
            a[i] = b.charAt(i);



            if ((a[i]==('a')) || a[i]==('e') || a[i]==('i') || a[i]==('o') || a[i]==('u') ) {
                count++;
            }
        }
        System.out.println(count);
    }
}
