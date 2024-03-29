class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int val : nums){
            pq.add(val);
        }
        for(int i=1; i<=k-1; i++){
            pq.poll();
        }
        return pq.poll();
    }
}