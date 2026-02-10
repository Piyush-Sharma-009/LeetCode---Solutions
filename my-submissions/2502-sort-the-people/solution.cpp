class Solution {
public:
    vector<string> sortPeople(vector<string>& names, vector<int>& heights) {
        vector<pair<int,int>> store;
        for(int i = 0;i<heights.size();i++)
            store.push_back({heights[i],i});
            sort(store.begin(),store.end(),greater<pair<int,int>>());
            vector<string> ans;
            for(auto i : store){
                ans.push_back(names[i.second]);
            }
            return ans;
    }
};
