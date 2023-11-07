class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        PriorityQueue<Double> pq = new PriorityQueue<>();
        int len = dist.length;
        for(int i=0; i<len; ++i){
            pq.add((double)dist[i]/speed[i]);
        }
        int ans = 0;
        while(!pq.isEmpty()){
            if(pq.remove() <= ans) break;
            ans++;
        }
        return ans;
    }
}