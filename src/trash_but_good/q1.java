package trash_but_good;

import java.util.Arrays;

public class q1 {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5, 6};  // First array
        int[] a2 = {4, 5, 6, 7, 8, 9};  // Second array

        // Step 1: Sort both arrays
        Arrays.sort(a1);
        Arrays.sort(a2);

        // Step 2: Find and print common elements using a single loop for one array
        int i = 0, j = 0;
        System.out.print("Common elements: ");
        while (i < a1.length && j < a2.length) {
            if (a1[i] < a2[j]) {
                i++;
            } else if (a1[i] > a2[j]) {
                j++;
            } else {
                // Elements are equal
                System.out.print(a1[i] + " ");
                i++;
                j++;
            }
        }
    }
}
