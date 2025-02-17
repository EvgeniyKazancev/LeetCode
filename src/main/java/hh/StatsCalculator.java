package hh;

public class StatsCalculator {
    public String calculateStats(String input) {
       String[] newStr = input.split(" ");
       int plus = 0;
       int minus = 0;
       int n = 0;
       for (int i = 0; i < newStr.length; i++) {
           int x = Integer.parseInt(newStr[i]);
           if (x > 0) {
               plus ++;
           }else if (x < 0) {
               minus ++;
           }else if (x == 0) {
               n++;
           }
       }
        return "выше нуля: " + plus + ", " +  "ниже нуля: " + minus +", " + "равна нулю: " + n;
    }
}
