class Solution {
    public int maxProduct(int n) {
    int len =0;
    int temp = n;
    while(temp >0){
        temp = temp/10;
    }
    List<Integer> digArr = new ArrayList<>();
    int i = n;
    int dig = 0;
    while(i>0){
        dig = i%10;
        digArr.add(dig);
        i = i/10;
    }
    int maxPro  = 0;
        for( i = 0; i < digArr.size() - 1;i++){
            for(int j = i +1;j<digArr.size();j++){  
                maxPro = Math.max(maxPro,digArr.get(i)*digArr.get(j));
            }
        }
        return maxPro;
    }
}
