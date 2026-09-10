class Solution {
    public boolean isAnagram(String s, String t) {
        // nothing much in this question
        // create a frequency array add character of first string anf remove the same for second string, if after all operations the array still empty(equals to 0) already then the strings are said to be anagram.
        if (s.length() != t.length()) {
            return false;
        }
        int[] arr = new int[26];
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        for(int i : arr){
            if(i!=0) return false;
        }
        return true;
    }
}