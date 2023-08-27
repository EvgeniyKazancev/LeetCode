import java.util.List;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        char ch = 0;
        char r = 0;
        String ch1 = null;
        int lengthS = s.length();
        String[] str = new String[lengthS];
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
        }
        for (int i = 0; i < wordDict.size(); i++) {
            ch1 = wordDict.get(i);
        }
        for (int i = 0; i < ch1.length(); i++) {
            r = ch1.charAt(i);
        }
       if (ch == r){
           return true;
       }
       return false;
    }

}
