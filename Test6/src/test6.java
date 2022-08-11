public class test6 {
    public static void main(String[] args) {
        int num = 5;
        for (int m = 0; m < 5; m++) {
            for (int a = 0; a < 11; a++) {
                if (a <= num + m && a >= num - m) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }

                System.out.println();

        }
    }
}

