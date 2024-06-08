public class pattern2 {
    public static void main(String[] args) {
        int count;
        for (int i = 0; i <= 4; i++) {
            if (i % 2 == 0) {
                count = (5 * (i)) + 1;
                for (int j = 0; j <= 4; j++) {
                    System.out.print(count + " ");
                    count++;
                }
            }
            if (i % 2 != 0) {
                count = (5 * (i + 1));
                for (int j = 0; j <= 4; j++) {
                    System.out.print(count + " ");
                    count--;
                }
            }
            System.out.println();

        }
    }
}

