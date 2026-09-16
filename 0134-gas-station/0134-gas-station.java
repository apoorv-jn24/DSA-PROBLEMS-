class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // lets try to build the solution.
        // optimise karna pdegaa...
        // Agar gas negative ho??????? gas[i]-cost[i] iska mtlb aage nahi jaa payega wo...
        // 
        int n=gas.length;
        int totalGas=0;
        int currentGas=0;
        int index=0;
        for(int i=0; i<n; i++){
            currentGas+= gas[i] -cost[i];
            totalGas+=  gas[i] -cost[i];
// agar saare par jane par ni hopaya to?- if we take total gas?
            if(currentGas<0) {
                index = i+1;
                currentGas=0;
              
            }
        }
        if(totalGas<0) return -1;
        return index;
    }
}
