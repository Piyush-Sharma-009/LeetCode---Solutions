class Solution {
public:
    int finalValueAfterOperations(vector<string>& operations) {
        int count = 0;
        for(int i = 0;i<operations.size();i++){
            if(operations[i] == "++X" || operations[i] == "X++")
                count += 1;
            if(operations[i] == "--X" || operations[i] == "X--")
                count-= 1;
        }
        return count;
    }
};
