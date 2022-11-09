class Solution {
    public int subtractProductAndSum(int n) {
        int i = n, sum = 0, mul = 1;
        while(i > 0){
            int num = i%10;
            int temp = i/10;
            i = temp;
            sum = sum + num;
            mul = mul * num;
        }
        
        return (mul-sum);
    }
}
