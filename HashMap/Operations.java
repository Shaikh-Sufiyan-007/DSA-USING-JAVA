import java.util.*;

public class Operations {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 1);
        hm.put("America", 2);
        hm.put("Indonesia", 3);

        Set<String> keys = hm.keySet();

        for (String k : keys) {
            System.out.println("key=" + k + ", values=" + hm.get(k));
        }
    }
}