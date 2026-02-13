class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
        vector<int> temp;
        vector<bool> res;
        for(int i = 0;i<candies.size();i++){
            temp.push_back(candies[i]);
        }
        sort(temp.begin(),temp.end());

        for(int i = 0;i<candies.size();i++){
            int var = candies[i];
            var += extraCandies;
            if(var >= temp[temp.size()- 1])
            res.push_back(true);
            else
            res.push_back(false);
        }
        return res;
        
    }
};
