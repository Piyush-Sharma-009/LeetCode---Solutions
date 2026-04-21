class Solution {
public:
    int maxArea(vector<int>& height) {
        int maxarea = 0;
        int left = 0;
        int right = height.size() - 1;

        while(left < right){
            int width = right - left;
            int high = min(height[left],height[right]);
            if(maxarea < width*high){
                maxarea = width*high;
            }
            if(height[left] < height[right]){
                left++;
            }
            else
            right --;
                
        }

        return maxarea;
    }
};
