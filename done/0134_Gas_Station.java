class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int len = gas.length;
        int tt = 0;
        int from = 0;
        for (int i = 0; i < len*2; i++) {
            tt+=(gas[i%len] - cost[i%len]);
            if ((i%len == from-1||(from == 0&&i%len==len-1))&&tt>=0) {
                return from;
            }
            if (tt<0) {
                tt = 0;
                from = i%len+1;
            }
        }
        return -1;
    }
}
