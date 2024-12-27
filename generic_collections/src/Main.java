
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Main {

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set <T> new_set = new HashSet(set1);
        new_set.addAll(set2);

        new_set.removeIf(item -> set1.contains(item) && set2.contains(item));
        return new_set;
    }

    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {

        return item -> condition.test(item) ? ifTrue.apply(item) : ifFalse.apply(item); // your implementation here
    }

    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, n -> ((n * n) / 10) % 1000); // your implementation here
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

        IntStream stream = pseudoRandomStream(12);
        stream.forEach(System.out::println);
    }
}