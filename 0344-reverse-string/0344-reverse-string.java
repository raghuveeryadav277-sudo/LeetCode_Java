class Solution {
    public void reverseString(char[] s) {
       int n = s.length;
       String rev = "";
       for(int i = n-1  ; i>=0 ; i--){
            rev = rev + s[i];
       } 
       for(int i = 0 ; i<n ; i++){
        s[i] = rev.charAt(i);
       }
    }
}