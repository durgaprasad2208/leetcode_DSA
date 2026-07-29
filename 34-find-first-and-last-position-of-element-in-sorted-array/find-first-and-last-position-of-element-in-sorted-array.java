class Solution {
    public int[] searchRange(int[] nums, int target) {
         int n = nums.length;
         int lo = 0;
         int  hi = n-1;
         int  idx1 = -1 ;
         int idx2 = -1;
         int[] arr=new int[2];
         while(lo<=hi){
            int mid = (lo + hi)/2;
            if(nums[mid]==target){
                idx1 = mid;
                hi=mid-1;
            }
            else if (nums[mid]>target) {
            hi = mid -1;
            }
            else lo = mid+1;
         }
         arr[0]=idx1;
         lo = 0;
         hi = n-1;
         while(lo<=hi){
            int mid = (lo + hi)/2;
            if(nums[mid]==target){
                idx2 = mid;
                lo = mid +1;
            }
            else if (nums[mid]>target) {
            hi = mid -1;
            }
            else lo = mid+1;
         }
         arr[1]=idx2;

         return arr;

        
    }
}