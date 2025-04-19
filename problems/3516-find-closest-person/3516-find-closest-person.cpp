class Solution {
public:
    int findClosest(int x, int y, int z) {
        int ttlx  = 0;
        int ttly = 0;
        if(x<=z)
            ttlx = z-x;
        else
            ttlx = x-z;
        if(y<=z) ttly = z-y;
        else ttly = y-z;
        if(ttlx < ttly) return 1;
        else if(ttlx>ttly) return 2;
        else return 0;
    }
};