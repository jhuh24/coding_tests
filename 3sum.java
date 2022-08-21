class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> seen = new HashSet<Integer> ();
        List<List<Integer>> answer = new ArrayList();
        Set<List<Integer>> sets = new HashSet<>();
        int index1 = 0;
        while (index1 < nums.length) {
            int index2 = index1 + 1;
            while (index2 < nums.length) {
                int opposite = -1 * (nums[index1] + nums[index2]);
                if (seen.contains(opposite)) {
                    List<Integer> temp = Arrays.asList(opposite, nums[index1], nums[index2]);
                    if (!sets.contains(temp)) {
                        sets.add(temp);
                    }
                }
                index2 += 1;
            }
            seen.add(nums[index1]);
            index1 +=1;
        }
        for(List<Integer> l : sets){
            answer.add(l);
        }
        return answer;
    }
}