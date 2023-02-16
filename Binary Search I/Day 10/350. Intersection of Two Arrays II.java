class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
      Arrays.sort(nums1);
	    Arrays.sort(nums2);
	    int left = 0;
	    int right = 0;
	    List<Integer> h = new ArrayList<>();

	    while (true){
		    if (left >= nums1.length || right >= nums2.length){
		    	break;
		    }
		    if (nums1[left] == nums2[right]){
		    	h.add(nums1[left]);
		    	left++;
		    	right++;
		    }
		    else if (nums1[left] < nums2[right]){
		    	left++;
		    }
		    else if (nums1[left] > nums2[right]){
		    	right++;
		    }
	    }

	    int[] g = new int[h.size()];
	    for (int i = 0; i < h.size(); i++) {
	    	g[i] = h.get(i);
	    }
	    return g;
    }
}
