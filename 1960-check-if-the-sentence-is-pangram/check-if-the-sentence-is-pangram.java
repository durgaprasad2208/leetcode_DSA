class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
        boolean[] arr = new boolean[26];
        for(int i = 0;i<sentence.length();i++){
            int index = sentence.charAt(i) - 'a';
            arr[index] = true;
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==false) return false;
        }
        return true;
    }
}