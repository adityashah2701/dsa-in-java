package Arrays.Easy.RemoveDuplicates;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void print(int[] arr, String console) {
        System.out.print(console);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] remove_duplicates(int arr[], int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }

        int[] newArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            newArr[i] = list.get(i);
        }

        return newArr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4 };
        int n = arr.length;

        print(arr, "Before :- ");
        arr = remove_duplicates(arr, n);  // reassign to new array
        print(arr, "After  :- ");
    }
}
