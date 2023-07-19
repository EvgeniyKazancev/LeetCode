import static java.lang.String.valueOf;

public class BuddyStrings {
    public static void main(String[] args) {
        BuddyStrings bs = new BuddyStrings();
        String s = "aaaacb";
        String goal = "aaaabc";
        boolean result = bs.buddyStrings(s, goal);
        System.out.println(result);
    }

    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()){
            return false;
        }
        String res = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length() -1; i++) {
              if (s.charAt(i) != goal.charAt(i)){
                 sb.append(goal.charAt(i));
                 sb.append(s.charAt(i));
            }else
                sb.append(s.charAt(i));

        }
        res = sb.toString();

        if (res.equals(goal)) {
            return true;
        } else
            return false;
    }
}
