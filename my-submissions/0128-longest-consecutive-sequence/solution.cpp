class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        unordered_set<int> numset(nums.begin(),nums.end());

        int maxlen = 0;

        for(int num :numset){

            if(numset.find(num-1) == numset.end()){
                int len = 1;
                int currnum = num;
                while(numset.count(currnum+1)){
                    len++;
                    currnum++;
                }
                maxlen = max(maxlen,len);
            }
        }
        return maxlen;
    }
};
