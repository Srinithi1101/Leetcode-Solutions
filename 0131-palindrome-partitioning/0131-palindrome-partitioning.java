class Solution {
    List<List<String>>ans=new ArrayList<>();
    public List<List<String>> partition(String s) {
        backtrack(s,0,new ArrayList<>());
        return ans;
    }
    void backtrack(String s,int Start,List<String>current){
        if (Start==s.length()){
            ans.add(new ArrayList<>(current));
            return;
        }
        for (int end=Start;end<s.length();end++){
            if (isPalindrome(s,Start,end)){
                current.add(s.substring(Start,end+1));
                backtrack(s,end+1,current);
                current.remove(current.size()-1);
            }
        }
    }
    boolean isPalindrome(String s,int left,int right){
        while(left<right){
            if (s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}