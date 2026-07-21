class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int n = s.length();
        int prevSum = -1;
        int maxSum = 0;
        int ones = 0;

        int i = 0;
        while(i<n){
            if(s.charAt(i) == '1'){
                ones++;
                i++;
            }
            else{
                int currSum = 0;
                while(i<n && s.charAt(i) == '0'){
                    currSum++;
                    i++;
                }
                if(prevSum >0){
                    maxSum = Math.max(maxSum,currSum + prevSum);
                }
                prevSum = currSum;
            }

        }
        return maxSum + ones;
    }
}
