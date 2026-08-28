class Solution {
    int count=0;
    public int uniquePathsIII(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        int startRow =0;
        int startCol=0;
        int empty=0;
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                if(grid[i][j]!=-1){
                    empty++;
                }
                if (grid[i][j]==1){
                    startRow=i;
                    startCol=j;
                }
            }
        }
        backtrack (grid,startRow,startCol,empty);
        return count;
        
        
    }
    void backtrack(int[][] grid,int row,int col,int empty){
        if (row <0|| row>=grid.length||
            col<0||col>=grid[0].length){
            return;    
        }
        if (grid[row][col]== -1){
            return;
        }
        if (grid[row][col]==2){
            if(empty==1){
                count++;
            }
            return;
        }
        int original =grid[row][col];
        grid[row][col]=-1;
        backtrack(grid,row+1,col,empty-1);
        backtrack(grid,row-1,col,empty-1);
        backtrack(grid,row,col+1,empty-1);
        backtrack(grid,row,col-1,empty-1);
        grid[row][col]=original;
    }
}