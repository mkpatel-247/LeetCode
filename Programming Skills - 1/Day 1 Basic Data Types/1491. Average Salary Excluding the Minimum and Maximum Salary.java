class Solution {
    public double average(int[] salary) {
        int size = salary.length;
        double sum = 0, max = 0, min = Integer.MAX_VALUE;
        for(int i = 0; i < size; i++){
            sum += salary[i];
            if(salary[i] > max){
                max = salary[i];
            }
            if(salary[i] < min){
                min = salary[i];
            }
        }
        sum = sum - (max+min);
        int index = size - 2;
        double result = sum/index;
        return result;
    }
}
