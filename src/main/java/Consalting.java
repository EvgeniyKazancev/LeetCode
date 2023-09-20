
import java.util.*;

public class Consalting {
    public static void main(String[] args) {


        Consalting consalting = new Consalting();
        String str = "weirfweifjdsffffffdssdfsde933948i";
        String re = consalting.counter(str);
        System.out.println(re);
    }


    public String counter(String str) {

        Map<Character, Integer> count = new HashMap<>();

        for (int i = 0; i < str.length() - 1; i++) {
            char c = str.charAt(i);

            if (!count.containsKey(c)) {
                count.put(c, 1);
            } else {
                int number = count.get(c);
                count.put(c, number + 1);
            }
        }
        List<Map.Entry<Character, Integer>> result = count.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .toList();

       StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : result) {
           sb.append(entry.getKey()).append(":").append(entry.getValue()).append(" ");

        }
        return sb.toString();
    }
}
