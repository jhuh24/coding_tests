class Solution {
    public int search(int[] nums, int target) {
        int counter = 0;
        for (int i : nums) {
            if (i == target) {
                return counter;
            }
            else {
                counter += 1;
            }
        }
        return -1;
    }
}