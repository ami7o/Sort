package sort;

import java.util.List;

public class QuickSort {
    public static void sort(List<Integer> list) {
        sort(list, 0, list.size());
    }

    private static void sort(List<Integer> list, int start, int end) {
        if (end - start > 2) { // more than three elements
            int pivot = partition(list, start, end);
            sort(list, start, pivot);
            sort(list, pivot + 1, end);
        } else if (end - start == 2) {
            if (list.get(start) > list.get(start + 1)) {
                swap(list, start, start + 1);
            }
        }
    }

    private static int partition(List<Integer> list, int start, int end) {
        // select pivot by taking the median of first 3 elements
        if (list.get(start) > list.get(start + 1)) swap(list, start, start + 1);
        if (list.get(start + 1) > list.get(start + 2)) swap(list, start + 1, start + 2);
        if (list.get(start) > list.get(start + 1)) swap(list, start, start + 1);
        swap(list, start, start + 1);
        // pivot is the first element
        int border = start;
        for (int i = start + 1; i < end; i++) {
            if (list.get(i) < list.get(start)) {
                border++;
                if (border != i) swap(list, border, i);
            }
        }
        swap(list, start, border);
        return border;
    }

    private static void swap(List<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
