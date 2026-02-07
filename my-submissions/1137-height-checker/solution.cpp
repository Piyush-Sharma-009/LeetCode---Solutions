class Solution {
public:
    int heightChecker(vector<int>& heights) {
        vector<int> dup;
        for(int i = 0;i<heights.size();i++){
            dup.push_back(heights[i]);
        }
        sort(dup.begin(),dup.end());
        int cnt = 0;
        for(int i = 0;i<dup.size();i++){
            if(dup[i] != heights[i]){
                cnt++;
            }
        }
        return cnt;

    }
};
