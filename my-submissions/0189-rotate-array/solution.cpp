class Solution {
public:
    void rotate(vector<int>& arr, int k) {
        int n = arr.size();
        k = k%n;
       reverse(arr.begin(), arr.end());
        
        // Reverse the first k elements
        reverse(arr.begin(), arr.begin() + k);
        
        // Reverse the remaining n - k elements
        reverse(arr.begin() + k, arr.end());
}
};
