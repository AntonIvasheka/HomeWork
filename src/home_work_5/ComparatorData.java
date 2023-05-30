package home_work_5;

import java.util.Comparator;

public class ComparatorData implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return (o2 - o1);
    }
}
