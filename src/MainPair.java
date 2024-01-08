import java.io.BufferedInputStream;
import java.io.*;

public class MainPair {
    public static void main(String[] args) {
        OrderedPair<String, Integer> p1 = new OrderedPair<>("Hello", 1);
        OrderedPair<String, Integer> p2 = new OrderedPair<>("Bye", 2);
        OrderedPair<Integer, InputStream> p3 = new OrderedPair<>(3, System.in);
        System.out.println(MainPair.isEqual(p1, p2));
    }

    public static <K,V> boolean isEqual(Pair <K,V> p1, Pair<K,V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
                p2.getValue().equals(p2.getValue());
    }
}
