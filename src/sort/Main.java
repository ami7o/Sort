package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static final double RATIO = 0.9;

    public static void main(String[] args) {
        // test sorting algorithms
        for (int i = 0; i < 100; i++) {
            List<Integer> before = getRandomList();
            List<Integer> after = new ArrayList<>(before);;
            CountingSort.sort(after);
            List<Integer> sorted = new ArrayList<>(before);
            Collections.sort(sorted);
            if (!after.equals(sorted)) {
                System.out.println("error: before=" + before + ", after=" + after);
                System.exit(1);
            }
        }
        System.out.println("Successful!");
    }

    private static List<Integer> getRandomList() {
        List<Integer> result = new ArrayList<>();
        int size = getRandom();
        for (int i = 0; i < size; i++) {
            result.add(getRandom());
        }
        return result;
    }

    private static int getRandom() {
        if (Math.random() < RATIO) {
            return 1 + getRandom();
        } else {
            return 0;
        }
    }
}
