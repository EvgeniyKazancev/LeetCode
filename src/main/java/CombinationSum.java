import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> resultList = new ArrayList<>();
        backtrack(resultList, new ArrayList<>(), candidates, target, 0);
        return resultList;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] candidates, int remain, int start) {
        if (remain < 0) {
           return;
        } else if (remain == 0) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int i = start; i < candidates.length; i++) {
                tempList.add(candidates[i]);
                System.out.println(tempList);
                backtrack(result, tempList, candidates, remain - candidates[i], i);
               tempList.remove(tempList.size() - 1 );
            }
        }
    }
    public static void main(String[] args) {
        CombinationSum cs = new CombinationSum();

        int[] candidates1 = {2, 3, 6, 7};
        int target1 = 7;
        System.out.println(cs.combinationSum(candidates1, target1)); // [[2, 2, 3], [7]]

        int[] candidates2 = {2, 3, 5};
        int target2 = 8;
        System.out.println(cs.combinationSum(candidates2, target2)); // [[2, 2, 2, 2], [2, 3, 3], [3, 5]]

        int[] candidates3 = {2};
        int target3 = 1;
        System.out.println(cs.combinationSum(candidates3, target3)); // []
    }
}
