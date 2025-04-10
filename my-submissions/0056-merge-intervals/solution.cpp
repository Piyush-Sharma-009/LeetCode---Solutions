class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        sort(intervals.begin(),intervals.end()); //sort as per the start time intervals
        int k = 0;  //index for merged intervals
        for(int i = 1;i<intervals.size();i++){
            if(intervals[k][1] >= intervals[i][0]){
                intervals[k][1] = max(intervals[k][1],intervals[i] [1]); //store that element end intervals which is greater on that merging elements
            }
            else
            {
                k++; //move to next index
                intervals[k] = intervals[i]; // shifting that k index to that intervals in which the +1 interval may be merge
            }
        }
            intervals.resize(k+1);
            return intervals;
    }
};
