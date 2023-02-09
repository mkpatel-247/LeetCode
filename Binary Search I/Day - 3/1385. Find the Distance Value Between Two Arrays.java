class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int ans = 0;
        for(int i=0;i<arr1.length;i++){
            int start = 0;
            int end = arr2.length-1;
            int a = 1;
            while(start <= end){
                int m = start + (end - start)/2;
                if(Math.abs(arr2[m]-arr1[i])<=d){
                    a=0;
                    break;
                }
                else if(arr2[m]>arr1[i]) end = m - 1;
                else start = m + 1;
            }
            ans += a;
        }
        return ans;
    }
}
