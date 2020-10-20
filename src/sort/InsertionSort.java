package sort;

import java.sql.SQLOutput;
import java.util.List;

public class InsertionSort {
    public static void sort(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (temp >= list.get(j)) break;
                list.set(j + 1, list.get(j));
            }
            list.set(j + 1, temp);
        }
    }
}
