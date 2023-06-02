public class Code1 {

    public static void main(String[] args) {
        System.out.println("Hello world");
        int i = 0;
        int j = 0;
        for (i = 0; i < 10; i++) {
            for (j = 0; j <= i; j++) {

                if (i == j) {
                    System.out.print(j);
                } else {
                    System.out.print(i);
                }

            }
            System.out.println("");
        }

    }
}
