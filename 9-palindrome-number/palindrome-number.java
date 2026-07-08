class Solution {
    public boolean isPalindrome(int x) {
        int y = reverse(x);

        if(x==y) return true;
        else return false;
        
    }
    public int reverse(int x){
        int r=0;
        while(x>0){
            int z=x%10;
            r=r+z;
            x=x/10;
            if(x!=0) r*=10;
        }
        return r;

    }
}