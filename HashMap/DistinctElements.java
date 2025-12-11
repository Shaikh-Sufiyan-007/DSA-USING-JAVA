import java.util.*;

public class DistinctElements {
    public static void main(String[] args) {
        int[] num = {4, 3, 2, 5, 6, 7, 3, 4, 2, 1};
        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0; i<num.length; i++) {
            if(!al.contains(num[i])) {
                al.add(num[i]);
            }
        }

            System.out.println(al.size());
    }
}
