class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> tracker = new HashMap<Integer, Integer>();
            for (int i : nums) {
                if (tracker.containsKey(i)) {
                    return true;
                }
                else {
                    tracker.put(i, 1);
                }
            }
        return false;
    }
}
