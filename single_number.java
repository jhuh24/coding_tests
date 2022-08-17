import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
            if (i + 3 >= nums.length) {
                return nums[nums.length - 1];
            }
        }
        return -1;
    }
}