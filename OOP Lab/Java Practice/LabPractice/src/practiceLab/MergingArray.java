package practiceLab;
import java.util.Arrays;
import java.util.HashSet;

public class MergingArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        int[] mergedArray = mergeArrays(array1, array2);

        for (int element : mergedArray) {
            System.out.print(element + " ");
        }
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        HashSet<Integer> set = new HashSet<>();

        for (int element : array1) {
            set.add(element);
        }

        for (int element : array2) {
            set.add(element);
        }

        int[] mergedArray = new int[set.size()];
        int index = 0;

        for (int element : set) {
            mergedArray[index] = element;
            index++;
        }

        return mergedArray;
    }
}


