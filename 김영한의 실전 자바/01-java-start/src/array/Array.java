package array;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 101;
        arr[1] = 201;
        arr[2] = 301;
        arr[3] = 401;
        arr[4] = 501;

        int[] arr2 = new int[]{102, 202, 302, 402, 502};
        int[] arr3 = {103, 203, 303, 403, 503};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int j : arr2) {
            System.out.println(j);
        }

        for (int k : arr3) {
            System.out.println(k);
        }
    }
}
