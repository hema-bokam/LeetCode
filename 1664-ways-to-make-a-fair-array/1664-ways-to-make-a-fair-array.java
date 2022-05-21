class Solution {
    public int waysToMakeFair(int[] A) {
        int rightEven=0,rightOdd=0,leftEven=0,leftOdd=0,count=0;
        for(int i=0;i<A.length;i++){
            if( (i&1)==0) rightEven+=A[i];
            else rightOdd+=A[i];
        }
        for(int i=0;i<A.length;i++){
            if( (i&1)==0 ){
                 rightEven-=A[i];
                 if(leftEven+rightOdd==leftOdd+rightEven) count++;
                 leftEven+=A[i];
            }
            else {
                rightOdd-=A[i];
                if(leftEven+rightOdd==leftOdd+rightEven) count++;
                leftOdd+=A[i];
            }
        }
        return count;
    }
}