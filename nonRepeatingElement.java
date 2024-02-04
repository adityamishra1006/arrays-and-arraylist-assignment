// Later understand this code

import java.util.ArrayList;
public class nonRepeatingElement {



    static int findFirstNonRepeating(int[] arr) {
        int[] frequency = new int[256]; // Assuming ASCII characters
        int[] firstOccurrenceIndex = new int[256];
        ArrayList<Integer> nonRepeatingList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];

            // Update frequency array
            frequency[element]++;

            // Update first occurrence index array
            if (frequency[element] == 1) {
                firstOccurrenceIndex[element] = i;
            }

            // Update non-repeating list
            if (frequency[element] == 1) {
                nonRepeatingList.add(element);
            } else {
                nonRepeatingList.remove(Integer.valueOf(element));
            }
        }

        // Find the first non-repeating element from the non-repeating list
        return nonRepeatingList.isEmpty() ? -1 : nonRepeatingList.get(0);
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 6, 2, 5, 4};
        int result = findFirstNonRepeating(arr);

        if (result != -1) {
            System.out.println("First non-repeating element: " + result);
        } else {
            System.out.println("No non-repeating element found.");
        }
    }
}

