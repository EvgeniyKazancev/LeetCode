public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        boolean result = true;
        if (s.length() == t.length()) {


            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (t.indexOf(c) != -1) {
                    result = true;
                } else {
                    result = false;
                }
            }
        }else {
            result = false;
        }
        return result;
    }
}
