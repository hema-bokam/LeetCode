class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (x, y) -> {
            return x[0] == y[0] ? x[1] - y[1] : x[0] - y[0];
        });
        LinkedList<int[]> mergedIntervals = new LinkedList<>();
        for(int[] interval : intervals){
            if(mergedIntervals.isEmpty() || mergedIntervals.getLast()[1] < interval[0]) mergedIntervals.add(interval);
            else mergedIntervals.getLast()[1] = Math.max(mergedIntervals.getLast()[1], interval[1]);
        }
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}