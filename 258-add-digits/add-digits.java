class Solution {
    public int addDigits(int num) {
        int currsum = 0;
        while(num>9){
            int r = num%10;
             num = num/10;
            currsum =currsum + r+num;
            num = currsum;
            currsum = 0;
        }
        return num;
        
    }
}