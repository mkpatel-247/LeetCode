class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int left = 0;
            int right = arr.length-1;
            int check = arr[i]*2;
            while(left<=right){
                int mid = left+(right-left)/2;
                if(mid != i && arr[mid]==check){
                    return true;
                }
                else if(arr[mid] < check){
                    left = mid+1;
                } else{
                    right = mid-1;
                }
            }
        }
        return false;
    }
}
