class Solution {
    public int maxArea(int[] h) {
        int marea = 0;
        int i = 0;
        int j = h.length-1;

        while(i<j){
            int area = (j-i) * Math.min(h[i],h[j]);
            if(area>marea) marea = area; 
            if(h[i]<h[j]) i++;
            else j--;
        }
        return marea;
    }
}