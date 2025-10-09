

import java.util.*;

public class combinations {
    public static void findCombinations( int ind , int[] arr,int target , List<List<Integer>>ans , List<Integer>ds){
        if(ind == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds)) ;

            }
            return ;

        }
        if(arr[ind] <= target){
            ds.add(arr[ind]) ;
            findCombinations(ind + 1, arr, target -arr[ind] , ans, ds);
            ds.remove(ds.size()-1);
        }
        findCombinations(ind + 1, arr, target, ans, ds);
    }
      public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

public static void main(String[] args) {
    combinations obj = new combinations();
    int[] candidates = {10,1,2,7,6,1,5} ;
    int target = 8;

    List<List<Integer>> result = obj.combinationSum(candidates, target);
    System.out.println(result);
}
}