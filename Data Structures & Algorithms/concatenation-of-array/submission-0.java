class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] brr = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            brr[i] = nums[i];
        }
        // System.arraycopy(nums, 0, brr, 0, nums.length);
        int j = 0;
        for (int i = nums.length; i < nums.length * 2; i++) {

            brr[i] = nums[j];
            j = j + 1;
        }
        return (brr);
    }
}
