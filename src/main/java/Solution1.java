import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution1 {
    public List<String> generateParenthesis(int n) {

        LinkedList<String> list = new LinkedList<String>();
        if ( n <= 0 )
          return list;
          dfs( n, 0,"",list);
          return list;

    }
    public void dfs(int open, int close, String res, List<String> list){
        if(open == 0 && close == 0 ){
            list.add(res);
            return;
        }
        if (open > 0 )
            dfs(open -1, close + 1, res + "(",list );
        if (close > 0)
            dfs(open,close - 1, res + ")", list);
    }
}
