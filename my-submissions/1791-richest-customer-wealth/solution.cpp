class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        int max = 0;
        for(int i = 0;i<accounts.size();i++){
            int cnt = 0;
            for(int j = 0;j<accounts[i].size();j++){
                cnt+=accounts[i][j];
            }
            if(max<cnt)
            max = cnt;
        }
        return max;
    }
};
