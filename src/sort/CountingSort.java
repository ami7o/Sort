package sort;

import java.util.ArrayList;
import java.util.List;

public class CountingSort {
    public static void sort(List<Integer> list) {
        // find max to make an counts array
        int max = 0;
        for (int i : list) max = Math.max(max, i);
        int[] counts = new int[max + 1];
        for (int i : list) counts[i]++;
        // get accumulate sum -> position after sorting
        for (int i = 1; i < counts.length; i++) counts[i] += counts[i-1];
        List<Integer> copy = new ArrayList<>(list);
        for (int i : copy) list.set(--counts[i], i);
    }
}
