class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList();
        subsets.add(new ArrayList<Integer>());
        if (nums.length > 0) {
            for (int i : nums){
                int s = subsets.size();
                for (int counter = 0; counter < s; counter++) {
                    List<Integer> temp = new ArrayList<Integer>(subsets.get(counter));
                    temp.add(i);
                    subsets.add(temp);
                }
            }
        }
        return subsets;
    }
}