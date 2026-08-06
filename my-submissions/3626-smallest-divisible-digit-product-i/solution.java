class Solution {
    public int smallestNumber(int n, int t) {
        int res = 0;
        int num = n;
        while(true){
            int digitPro = 1;
            int temp = num;
            while(temp > 0){
                digitPro *= temp%10;
                temp = temp/10;
            }
            if(digitPro%t == 0){
                res = num;
                break;
            }
            num++;
        }
        return res;
    }
}
