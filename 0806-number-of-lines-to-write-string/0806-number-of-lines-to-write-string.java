class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int lines=1;
        int currwidth=0;
        for (int i=0;i<s.length();i++){
            int width=widths[s.charAt(i)-'a'];
            if(currwidth+width>100){
                lines++;
                currwidth=width;

            }else{
                currwidth+=width;
            }
        }
        return new int[]{lines,currwidth};
        
        
    }
}