public class Code4 {
    public static void main(String[] args) {
        int i;
        int array[] = { 1, 2, 3, 4, 5, 6, 7 };
        int target = 6;
        for (i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.println("Index of Number " + target + " is " + i);
            }
        }
    }
}