class Solution {
    public void rotate(int[] nums, int k) {
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = nums.length-1; i >= 0; i--) {
            q.add(nums[i]);
        }
        for (int i = 0; i < k; i++) {
            q.add(q.remove());
        }
        for (int i = nums.length-1; i >= 0; i--) {
            nums[i] = q.remove();
        }
    }
}