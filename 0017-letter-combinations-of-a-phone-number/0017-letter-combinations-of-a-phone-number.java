class Solution {
    List<String>ans=new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if (digits.length()==0) {
            return ans;
        }
        String[] phone={
            "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
        };
        backtrack (digits,0,"",phone);
        return ans;


        
    }
    void backtrack(String digits,int index,String current,String[] phone){
        if(index==digits.length()){
            ans.add(current);
            return;
        }
        String letters=phone[digits.charAt(index)-'0'];
        for (int i=0;i<letters.length();i++){
            current +=letters.charAt(i);
            backtrack(digits,index+1,current,phone);
            current=current.substring(0,current.length()-1);
        }
    }
}