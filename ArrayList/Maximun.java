package ArrayList;
import java.util.ArrayList;

public class Maximun {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int maxVal = Integer.MIN_VALUE;
        for(int i=0; i < list.size(); i++) {
            if(maxVal < list.get(i)) {
                maxVal = list.get(i);
            }
        }

        System.out.println("Max element is :" + maxVal);
    }
}
