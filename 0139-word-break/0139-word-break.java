class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean[] dp = new Boolean[s.length()+1];
        return solve(0,s,wordDict,dp);
    }
    public boolean solve(int index, String s, List<String> wordDict, Boolean[] dp){
        if(index==s.length()) return true;
        if(dp[index]!=null) return dp[index];
        for(int i=index+1; i<=s.length(); i++){
            String ab = s.substring(index,i);
            if(wordDict.contains(ab)){
                if(solve(i,s,wordDict,dp)) return dp[index]=true;
            }
        }
        return dp[index]=false;
    }
}