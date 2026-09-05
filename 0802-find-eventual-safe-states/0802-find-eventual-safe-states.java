class Solution {
    int[] state;
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer>ans=new ArrayList<>();
        state=new int[graph.length];
        for (int i=0;i<graph.length;i++){
            if (dfs(i,graph)){
                ans.add(i);
            }
        }
        return ans;
        
    }
    boolean dfs(int node,int[][]graph){
        if(state[node]==1)
          return false;
        if (state[node] ==2) 
          return true;
        state[node]=1;
        for (int next:graph[node]){
            if(!dfs(next,graph))
            return false;
        }
        state[node]=2;
        return true; 

    }
}