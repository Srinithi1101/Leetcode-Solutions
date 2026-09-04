class Solution {
    public String minWindow(String s, String t) {
        String ans = "";

        int[] count = new int[128];

        for (char c : t.toCharArray()) {
            count[c]++;
        }

        int left = 0;
        int have = 0;
        int need = t.length();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (count[c] > 0) {
                have++;
            }
            count[c]--;
            while (have == need) {
                String sub = s.substring(left, right + 1);
                if (ans.equals("") || sub.length() < ans.length()) {
                    ans = sub;
                }
                char x = s.charAt(left);
                count[x]++;
                if (count[x] >0) {
                    have--;
                }
                left++;
            }
        }    

        return ans;
    }    
}
        
//         String ans="";
//         for(int i=0;i<s.length();i++){
//             for (int j=i;j<s.length();j++){
//                 String sub=s.substring(i,j+1);
//                 boolean found=true;
//                 for (char c:t.toCharArray()){
//                     int  need=0;
//                     int have =0;
//                     for (char x:t.toCharArray()){
//                         if (x==c){
//                             need++;
//                         }
//                     }
//                     for (char x:sub.toCharArray()){
//                         if (x==c){
//                             have++;
//                         }
//                     }

        
                    
//                     if (have<need){
//                     found=false;
//                     break;
//                     }

//                 }
                
//                 if (found){
//                     if (ans.equals("")||sub.length()< ans.length()){
//                         ans=sub;
//                     }
//                 }
//             }    
//         }
//         return ans;

//     }
// }