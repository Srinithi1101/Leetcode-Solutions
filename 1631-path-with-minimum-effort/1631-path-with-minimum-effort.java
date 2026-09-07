class Solution {
    public int minimumEffortPath(int[][] heights) {
        int n=heights.length;
        int m=heights[0].length;
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        int[][] effort=new int[n][m];
        for (int[] row:effort)
            Arrays.fill(row,Integer.MAX_VALUE);
        effort[0][0]=0;
        //{effort,row,col}
        pq.offer(new int[]{0,0,0});
        int[][] dir={
            {1,0},{-1,0},{0,1},{0,-1}
        };
        while(!pq.isEmpty()){
            int[] cur=pq.poll();
            int e=cur[0];
            int r=cur[1];
            int c=cur[2];
            if (r==n-1 && c==m-1)
                return e;
            for (int[]d:dir){
                int nr = r+d[0];
                int nc = c+d[1];
                if (nr >=0 && nr < n &&nc >= 0 && nc < m){
                    int diff=Math.abs(heights[r][c]-heights[nr][nc]);
                    int newEffort=Math.max(e,diff);
                    if (newEffort< effort[nr][nc]){
                        effort[nr][nc]=newEffort;
                        pq.offer(new int[]{newEffort,nr,nc});

                    }
                    
                }
            }
        }
        return 0;
        
    }
}