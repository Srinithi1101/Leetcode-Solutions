class Solution {
    List<String>ans=new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        backtrack(s,0,new ArrayList<>());
        return ans;
    }
    void backtrack(String s,int index,List<String>current){
        if(current.size()==4){
            if(index==s.length()){
                ans.add(String.join(".",current));
            }
            return;
        }
        for (int end=index;end<Math.min(index+3,s.length());end++){
            String part=s.substring(index,end+1);
            if(part.length()>1&& part.charAt(0)=='0'){
                break;
            }
            if(Integer.parseInt(part)>255){
                break;
            }
            current.add(part);
            backtrack(s,end+1,current);
            current.remove(current.size()-1);
        }
    }
}