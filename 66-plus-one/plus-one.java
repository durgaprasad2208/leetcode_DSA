class Solution {
    public int[] plusOne(int[] digits) {
        int  n = digits.length;
        ArrayList<Integer> arr = new ArrayList<>();
        int carry = 1;

        for(int i = n-1;i>=0;i--){
            if(digits[i]+carry >9){
                arr.add(0);
                carry = 1;
            }
            else{
                arr.add(digits[i]+carry);
                carry = 0;
            }

        }
        if(carry == 1) arr.add(1);

        Collections.reverse(arr);

        int[] array = new int[arr.size()];
        for(int i =0;i<arr.size();i++){
            array[i]=arr.get(i);
        }

        return array;
        
    }
}