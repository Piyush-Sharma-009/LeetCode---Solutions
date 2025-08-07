class Solution {
public:
    int characterReplacement(string s, int k) {
        unordered_map<char,int>mpp;
        int n=s.length();
        int i=0;
        int j=i;
        int maxi=0;
        int mf=0;
       
        while(j<n){
            mpp[s[j]]++;
            mf=max(mf,mpp[s[j]]);
            int extra=(j-i+1)-mf;
            while(extra>k){
                mpp[s[i]]--;
                i++;
                extra=(j-i+1)-mf;
            }
            maxi=max(maxi,j-i+1);
            j++;
        }
        return maxi;
    }
};
