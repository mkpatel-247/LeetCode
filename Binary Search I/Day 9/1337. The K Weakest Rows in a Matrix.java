class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int M = mat.length;
        int N = mat[0].length;
        
        int[] result = new int[M];
        
        for (int i = 0; i < M; i++){
            
            int low = 0;
            int high = N - 1;
            if (mat[i][high] == 1){
                result[i] = N * M + i;
                continue;
            }
            while (low < high){
                int mid = low + (high - low) / 2;
                if (mat[i][mid] == 1) low = mid + 1;
                else high = mid;
            }
            result[i] = low * M + i;
        }
        Arrays.sort(result);
        for (int i = 0; i < result.length; i++){
            result[i] %= M;
        }
        
        return Arrays.copyOfRange(result, 0, k);
    }
}
