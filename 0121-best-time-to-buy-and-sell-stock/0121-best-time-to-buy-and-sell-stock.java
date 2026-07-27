class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0;
        int minValue = Integer.MAX_VALUE;
        for(int price: prices){
            if(price<minValue){
                minValue = price;
            }else if(price-minValue > maxP){
                maxP = price - minValue;
            }
        }
        return maxP;
    }
}