class Solution {
    public int lengthOfLastWord(String s) {
        String m = s.trim();
        int n = m.length();
        int count = 0;
        for(int i = n-1 ; i>=0 ;i--){
            if(m.charAt(i) != ' '){
                count++;

            }
            else{
                break;
            }
        }
        return count;


        
    }
}