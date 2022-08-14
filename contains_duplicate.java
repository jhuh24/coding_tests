class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> tracker = new HashMap<Integer, Integer>();
            for (int n : nums) {
                if (tracker.containsKey(n)) {
                    return true;
                }
                else {
                    tracker.put(n, 1);
                }
            }
        return false;
    }
}
