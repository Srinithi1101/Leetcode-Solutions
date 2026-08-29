class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(candidates,target,0,new ArrayList<>());
        return ans;
        
    }
    void backtrack(int[]candidates,int target,int start,List<Integer>current){
        if(target==0){
            ans.add(new ArrayList<>(current));
            return;
        }
        for (int i=start;i<candidates.length;i++){
            if(candidates[i]>target){
                continue;
            }
            current.add(candidates[i]);
            backtrack(candidates,target-candidates[i],i,current);
            current.remove(current.size()-1);
        }
    }
}