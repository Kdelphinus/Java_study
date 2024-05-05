package array;

public class ArrayDi0 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];

        arr[0][0] = 101;
        arr[0][1] = 102;
        arr[0][2] = 103;
        arr[1][0] = 201;
        arr[1][1] = 202;
        arr[1][2] = 203;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int[][] arr2 = new int[][]{{104, 105, 106}, {204, 205, 206}};
        for (int[] i : arr2) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        int[][] arr3 = {
                {107, 108, 109},
                {207, 208, 209}
        };
        for (int[] i : arr3) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
