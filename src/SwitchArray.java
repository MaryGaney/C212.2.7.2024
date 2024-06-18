public class SwitchArray {
    /**
     * prints a 2D array
     * @param values
     */
    public static void print2DArray(int[][] values){
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[0].length; j++) {
                System.out.println(values[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    /**
     * switches the rows and the columns of the received square array
     * @param a
     * @return new array with rows and columns switched
     */
    public static int[][] switchArray(int[][] a){
        //create a new array of the same size
        int[][] b = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                b[i][j] = a[j][i];
            }

        }
        return b;
    }
    public static void main(String[] args) {
        int[][] a = {
            {1,0,1},
            {1,1,0},
            {0,0,1},
        };

        System.out.println("original array");
        print2DArray(a);
        int[][] b = switchArray(a);
        System.out.println("switched array");
        print2DArray(b);
    }
}
