class Solution {
    public int longestValidParentheses(String s) {
        // iska brute force bhi ho sakta hai using two for loops.
        int len=0; //agar string hi empty ho.
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(') st.push(i);
            else {
                st.pop();
                // agar stack khali hua to ???? after popping
                if(st.isEmpty()) st.push(i);
                else{
                    int length = i-st.peek(); //.peek() is to get the topmost element.
                    len = Math.max(length,len);
                }
            }
        }
        return len;
    }
}