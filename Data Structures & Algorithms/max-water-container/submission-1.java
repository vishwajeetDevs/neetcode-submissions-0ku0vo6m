class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int result = Integer.MIN_VALUE;
        while(left < right) {
            int minHeight = Math.min(height[left], height[right]);
            int product = minHeight * (right-left);
            if(product > result) {
                result = product;
            }
            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
}