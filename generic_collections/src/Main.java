
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set <T> new_set = new HashSet(set1);
        new_set.addAll(set2);

        new_set.removeIf(item -> set1.contains(item) && set2.contains(item));
        return new_set;
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[] {1, 2, 3};
        Set <Integer> s1 = new HashSet(Arrays.asList(a));

        Integer[] b = new Integer[] {0, 1, 2};
        Set <Integer> s2 = new HashSet(Arrays.asList(b));

        Set <Integer> val = symmetricDifference(s1, s2);
        val.forEach(
                x->{System.out.println(String.valueOf(x));
                }
                );
    }
}