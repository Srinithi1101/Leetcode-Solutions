class Solution {
    public String shortestPalindrome(String s) {
        String rev=new StringBuilder(s).reverse().toString();
        String str=s+"#"+rev;
        int[] lps =new int[str.length()];
        for (int i=1;i<str.length();i++){
            int j=lps[i-1];
            while (j>0 && str.charAt(i)!=str.charAt(j)){
                j=lps[j-1];
            }
            if (str.charAt(i)==str.charAt(j)){
                j++;
            }
            lps[i]=j;
        }
        int len=lps[str.length()-1];
        String add=s.substring(len);
        return new StringBuilder(add).reverse().toString()+s;

    }

}
        // int n=s.length();
        // int i=0;
        // for (int j=n-1)
//         if (s.length()==0){
//             return s;
//         }
//         String rev = "";

//         for (int i = s.length() - 1; i >= 0; i--) {
//             rev = rev + s.charAt(i);
//         }

//         String str = s + rev;

//         int[] lps = new int[str.length()];

//         int i = 1;
//         int j = 0;

//         while (i < str.length()) {

//             if (str.charAt(i) == str.charAt(j)) {
//                 lps[i] = j + 1;
//                 i++;
//                 j++;
//             } 
//             else if (j > 0) {
//                 j = lps[j - 1];
//             } 
//             else {
//                 i++;
//             }
//         }

//         int longest = lps[str.length()- 1];

//         String add = "";

//         for (i = s.length() - 1; i >= longest; i--) {
//             add = add + s.charAt(i);
//         }

//         return add + s;
//     }
// }    
 

// //         String rev="";
// //         for (int i=s.length()-1;i>=0;i--){
// //             rev=rev+s.charAt(i);
// //         }
// //         int n=s.length();
// //         int longest=0;
// //         for (int i=n;i>=1;i--){
// //             boolean palindrome=true;
// //             int left=0;
//             int right=i-1;
//             while(left<right){
//                 if (s.charAt(left)!=s.charAt(right)){
//                     palindrome=false;
//                     break;
//                 }
//                 left++;
//                 right--;
//             }
//             if (palindrome){
//                 longest=i;
//                 break;
//             }
//         }
//         String add="";
//         for (int i=s.length()-1;i>=longest;i--){
//             add=add+s.charAt(i);
//         }
//         return add+s;

        
//     }
// }


