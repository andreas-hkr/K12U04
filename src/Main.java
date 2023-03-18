public class Main {
    static int[][] copyPart(int[][] arr, int c1, int c2, int r1, int r2) {
        int width = 1 + (c2 - c1);
        int height = 1 + (r2 - r1);

        int[][] res = new int[height][width];

        for (int i=0; i < res.length; i++) {
            for (int j=0; j < res[i].length; j++) {
                res[i][j] = arr[r1+i][c1+j];
            }
        }

        return res;
    }

    public static void main(String[] args) {
        // Skriv, och testa, en metod som returnerar en utvald del av en 2D-array
        //
        //   1 2 3 4 5
        //   2 3 4 5 6  - - - - - - - - - - - >   3 4 5
        //   3 4 5 6 7    kolumn  1 - 3           4 5 6
        //   4 5 6 7 8    rad     1 - 2

        int[][] arr = {
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 6},
                {3, 4, 5, 6, 7},
                {4, 5, 6, 7, 8}
        };

        int[][] arr2 = copyPart(arr,1,3,1,2);

        for(int i=0; i < arr2.length; i++) {
            for (int j=0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}