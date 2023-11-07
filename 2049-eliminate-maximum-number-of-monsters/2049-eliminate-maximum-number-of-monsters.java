class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        List<Pair> arr = new ArrayList<>();
        int len = dist.length;
        for(int i=0; i<len; i++){
            Pair p = new Pair(dist[i], speed[i]);
            arr.add(p);
        }
        Collections.sort(arr, new CustomComparator());
        int time = 0, monsters=0;
        for(int i=0; i<len; i++){
            Pair p = arr.get(i);
            int distCov = time * p.speed;
            if(p.dist <= distCov) return monsters;
            monsters++;
            time++;
        }
        return monsters;
    }
}
class Pair{
        int dist;
        int speed;
        public Pair(int dist, int speed){
            this.dist = dist;
            this.speed = speed;
        }
}
class CustomComparator implements Comparator<Pair>{
    @Override
    public int compare(Pair p1, Pair p2){
        double t1 = (double)p1.dist / (double)p1.speed;
        double t2 = (double)p2.dist / (double)p2.speed;
        if(t1 < t2) return -1;
        else return (int)(t1-t2);
    }
}