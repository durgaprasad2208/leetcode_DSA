class Solution {
    public int findKthPositive(int[] arr, int k) {
        int lo = 0 ; 
        int hi = arr.length-1;
        while(lo<=hi){
            int mid = (hi+lo)/2;
            int correctno = mid+1;
            int missingnos = arr[mid]-correctno;
            if(missingnos>=k) hi = mid-1;
            else lo=mid+1; 
        }
        return hi+1+k;
    }
}