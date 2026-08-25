class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int n = fruits.length;
        int left = 0;
        int maxlen = 0;
        for(int right = 0;right<n;right++){
            mpp.put(fruits[right],mpp.getOrDefault(fruits[right],0)+1);

            if(mpp.size() <=2){
                maxlen = Math.max(maxlen,right - left + 1);
            }

            while(mpp.size()>2){
                mpp.put(fruits[left],mpp.get(fruits[left]) - 1);
                if(mpp.get(fruits[left]) == 0) mpp.remove(fruits[left]);
                left++;
            }
        }
        return maxlen;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
