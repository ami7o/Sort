package sort;

import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void sort(List<Integer> list) {
        sort(list, 0, list.size());
    }

    private static void sort(List<Integer> list, int start, int end) {
        if (end - start > 1) {
            int mid = (start + end) / 2;
            sort(list, start, mid);
            sort(list, mid, end);
            // merge
            int[] temp = new int[end - start];
            int j = start, k = mid;
            for (int i = 0; i < temp.length; i++) {
                if (j < mid && (k >= end || list.get(j) <= list.get(k))) {
                    temp[i] = list.get(j++);
                } else {
                    temp[i] = list.get(k++);
                }
            }
            for (int i = 0; i < temp.length; i++) {
                list.set(start + i, temp[i]);
            }
        }
    }
}
