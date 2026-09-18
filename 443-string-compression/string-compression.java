class Solution {
    public int compress(char[] ch) {
        int i = 0;
        int j = 0;
        StringBuilder sb = new StringBuilder();
        char ch1 ='a';
        int n=0;
        while (i < ch.length) {

    while (j < ch.length && ch[i] == ch[j]) {
        j++;
    }
    n = j - i;
    sb.append(ch[i]);
    if (n > 1) {
        sb.append(n);
    }
    i = j;
}
    for(int k = 0; k < sb.length(); k++){
    ch[k] = sb.charAt(k);
}

return sb.length();
    }
}