package naveen;

public class Solution {
    public static void main(String[] args) {
        String input="abcabcde";
        System.out.println(lengthOfLongestSubstring(input));
    }
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[115];
        
        // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            
            i = Math.max(index[s.charAt(j)],i);
            System.out.println(i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
            
            System.out.println(s.charAt(j));
            //System.out.println(index[j]);
            
            //System.out.println(index[s.charAt(j)]);
        }
        for(int a:index){
          //System.out.print(a +" ");
        }
        return ans;
    }    
}
