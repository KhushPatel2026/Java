public class Code3 {
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 6 };
        int i;
        int sum = 0;
        for (i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
    }

}