import java.util.Arrays;

class Solution {
    public String solution(String rsp) {
        String
        String answer = "";
        int[] a = new int[rsp.length()];
        int[] b = new int[rsp.length()];
        for(int i = 0; i<rsp.length(); i++){
            a[i] = rsp.charAt(i);
            if(a[i]==0) b[i]=5;
            else if(a[i]==2) b[i]=0;
            else if(a[i]==5) b[i]=2;
        }
        answer = Arrays.toString(b);
        return answer;
    }
}