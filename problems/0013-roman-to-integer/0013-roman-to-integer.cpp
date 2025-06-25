class Solution {
public:
    int symbol(char s){
            if(s == 'I')
            return 1;
            else if(s == 'V')
            return 5;
            else if(s == 'X')
            return 10;
            else if(s == 'L')
            return 50;
            else if(s == 'C')
            return 100;
            else if(s == 'D')
            return 500;
            else if(s == 'M')
            return 1000;
            return -1;
    }

    int romanToInt(string s) {
        int prev = symbol(s[0]);
        int x = prev;
        int i = 1;
        while(i<s.size()){
            if(prev>=symbol(s[i])){
            x+=symbol(s[i]);
            prev = symbol(s[i++]);
            }
            else{
                x = x +(symbol(s[i]) -2*prev);
                prev = symbol(s[i++]);
            }
        }   
        return x;
    }
};