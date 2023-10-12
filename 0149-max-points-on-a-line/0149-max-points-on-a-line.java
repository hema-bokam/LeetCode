class Solution {
    // points that lie on same line will have same slope, slope = (y2-y1)/(x2-x1)
    // slope can have float values, to avoid precision errors we should take denominator and numerator seperately
    // slope <(y2-y1)/gcd , (x2-x1)/gcd> where gcd = gcd(y2-y1, x2-x1)
    public int maxPoints(int[][] points) {
        HashMap<String, Integer> map = new HashMap<>();
        int finalMax = 0;
        int len = points.length;
        for(int i=0; i<len; i++){
            // we find slope with point[i] to every other point and find maxPoints possible
            int samePoints = 0, maxPoints = 0;
            for(int j=i+1; j<len; j++){
                int x1 = points[i][0], y1 = points[i][1], x2 = points[j][0], y2 = points[j][1];
                // to handle 0/0 case, which means point1 and point2 are same
                if(x1 == x2 && y1 == y2){
                    samePoints++; 
                    continue;
                }else{
                    int gcd = findGcd(y2-y1, x2-x1);
                    int numerator = (y2-y1)/gcd, denominator = (x2-x1)/gcd;
                    String slope = numerator + "*" + denominator;
                    map.put(slope, map.getOrDefault(slope, 0)+1);
                    maxPoints = Math.max(maxPoints, map.get(slope)); 
                }
            }
            finalMax = Math.max(finalMax, 1+samePoints+maxPoints); // 1 for point[i]
            map.clear();
        }
        return finalMax;
    }
    public int findGcd(int a, int b){
        if(a == 0) return b;
        return findGcd(b % a, a);
    }
}