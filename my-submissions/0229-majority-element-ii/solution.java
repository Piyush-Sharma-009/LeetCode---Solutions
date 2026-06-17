class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        if(n == 0) return ans;
        
        int cand1 = 0;
        int cand2 = 0;

        int cnt1 = 0;
        int cnt2 = 0;

        for(int i : nums){
            if(cand1 == i) cnt1++;
            else if(cand2 == i) cnt2++;
            else if(cnt1 == 0){
                cand1 = i;
                cnt1 = 1;
            }
            else if(cnt2 == 0){
                cand2 = i;
                cnt2 = 1;
            }
            else{
                cnt1--;
                cnt2--;
                
            }
        }
        cnt1 = 0;
        cnt2 = 0;
        for(int i : nums){
            if(cand1 == i) cnt1++;
            else if(cand2 == i) cnt2++;
        }
       
            if(cnt1 > n/3) ans.add(cand1);
            if(cnt2 > n/3) ans.add(cand2);
        

        return ans;
    }
} 
