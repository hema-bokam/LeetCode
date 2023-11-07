class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int len = dist.length;
        int[] time = new int[len]; // time to reach city
        int[] count = new int[len];
        for(int i=0; i<len; i++){
            time[i] = (int)Math.ceil((double)dist[i] / speed[i]);
        }
        for(int val : time){
            if(val >= len) continue;
            count[val]++; // it will tell you, the total monsters that will arrive at each minute
        }
        for(int i=1; i<len; i++){
            count[i] += count[i-1];
            if(count[i] > i) return i;
        }
        return len;
    }
}