

public class BuddyStrings {
    public static void main(String[] args) {
        BuddyStrings bs = new BuddyStrings();
        String s = "abab";
        String goal = "abab";
        boolean result = bs.buddyStrings(s, goal);
        System.out.println(result);
    }

    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        String res = "";
        StringBuilder sb = new StringBuilder();
        StringBuilder uni = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                uni.append(s.charAt(i));
            } else
                sb.append(s.charAt(i));
        }
        if (uni.isEmpty()) {
            sb.reverse();
        }
        res = sb.toString();
        res += String.valueOf(uni.reverse());
        if (res.equals(goal)) {
            return true;
        } else
            return false;
    }
}
