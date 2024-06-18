public class Medals {
    public static void main(String[] args) {

        final int COUNTRIES = 7;
        final int MEDALS = 3;

        String[] counties = {"Canada", "China", "Germany", "Korea","Japan","Russia","United States"};

        int[][] counts = {
                {1,0,1},
                {1,1,0},
                {0,0,1},
                {1,0,0},
                {0,1,1},
                {0,1,1},
                {1,1,0}
        };
        int total = 0;
        System.out.printf("%-15s %10s %10s %10s %10s", "Country","Gold","Silver","Bronze","Total");
        System.out.println(" ");
        for (int i = 0; i < COUNTRIES; i++) {
            System.out.printf("%-15s", counties[i] + " ");
            for (int j = 0; j < MEDALS; j++) {
                System.out.printf("%10d", counts[i][j]);
                int total += counts[i][j];
            }
            System.out.printf("%10d", total);
            total = 0;
            System.out.println(" ");
        }

    }
}
