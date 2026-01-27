class Solution {
public:
    int largestAltitude(vector<int>& gain) {
        vector<int> alt;
        alt.push_back(0);
        int n = gain.size();
        int max = alt[0];
        for(int i = 0;i<n;i++){
            alt.push_back(alt[i] + gain[i]);
        }

        for(int i =0;i<alt.size();i++){
            if(max < alt[i])
            max = alt[i];
        }
        return max;
    }
};
