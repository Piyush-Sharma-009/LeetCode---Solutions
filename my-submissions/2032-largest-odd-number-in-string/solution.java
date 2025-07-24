class Solution {
    public String largestOddNumber(String num) {
        int[] arr = new int[num.length()];
        StringBuilder str = new StringBuilder();
        for(int i = 0;i<num.length();i++){
            arr[i] = num.charAt(i) - '0';
        }
        int start = 0;
        int j = 0;
        int end = 0;
        int odd = 0;
        while(j<num.length()){
            if(arr[j]%2 != 0){
                end = j;
                odd++;
            }
                j++;
        }
            if(odd!= 0){
            for(int i = start;i<=end;i++){
                str.append(arr[i]);
            }
            }
            return str.toString();
    }
}
