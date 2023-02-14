class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int i=0;i<grid.length;i++){
            int low = 0;
            int high = grid[0].length-1;
            int freq = -1;
            while(low <= high){
                int mid = (low+high)/2;
                if(grid[i][mid] < 0){
                    freq = mid;
                    high = mid-1;                    
                }else{
                    low = mid+1;
                }
            }
            if(freq != -1){
                count += grid[0].length-freq;
            }
        }
        return count;
    }
}
