

public class Solution10 {
    public static void main(String[] args) {
        Solution10 sss = new Solution10();
        String s = "ADUTE";
        sss.minLength(s);
        System.out.println(sss);
    }
    public int minLength(String s) {
    StringBuilder sb = new StringBuilder();
        if(s == null || s.isEmpty()){
            return 0;
        }

        for (int i = 0; i < s.length() - 1; i++) {
           char current = s.charAt(i);
           char nextChar = s.charAt(i+1);

           if (nextChar - current == 1 ){
               char res = s.charAt(nextChar + 1);
               sb.append(res) ;

           }else
              sb.append(s.charAt(i));
        }

        int length = sb.length();

         return length;
    }
}
