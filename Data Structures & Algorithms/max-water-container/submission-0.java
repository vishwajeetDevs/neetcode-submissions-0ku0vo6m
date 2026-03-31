class Solution {
    public int maxArea(int[] height) {
        int result = Integer.MIN_VALUE;
        for (int i= 0; i < height.length; i++) {
            for (int j = i+1; j < height.length; j++) {
                int area = Math.min(height[i], height[j]) * (j - i);
                if(area > result) {
                    result = area;
                }
            }
        }
        return result;
    }
}