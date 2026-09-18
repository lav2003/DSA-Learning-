class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> st = new Stack<>();
        Stack<Integer> count = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!st.empty() && st.peek() == c) {
                count.push(count.pop() + 1);
                if (count.peek() == k) {
                    st.pop();
                    count.pop();
                }
            } else {
                st.push(c);
                count.push(1);
            }
        }
        StringBuilder ans = new StringBuilder();
        while (!st.empty()) {
            char c = st.pop();
            int n = count.pop();
            for (int i = 0; i < n; i++) {
                ans.append(c);
            }
        }
        return ans.reverse().toString();
    }
}