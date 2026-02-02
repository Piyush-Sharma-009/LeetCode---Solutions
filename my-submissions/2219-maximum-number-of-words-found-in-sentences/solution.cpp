class Solution {
public:
    int mostWordsFound(vector<string>& sentences) {
            int max = 0;
        for(int i = 0;i<sentences.size();i++){
            string str = sentences[i];
            int cnt = 1;
            for(int j= 0;j<str.length();j++ ){
                if(str[j] == ' ')
                    cnt++;
            }
            if(max < cnt)
                max = cnt;
        }
        return max;
    }
};
