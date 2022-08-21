class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> seen = new HashSet<Integer> ();
        ArrayList<Integer> num = new ArrayList<Integer>();
        List<List<Integer>> answer = new ArrayList();
        for (int i : nums) {
            num.add(i);
        }
        int index1 = 0;
        while (index1 < num.size()) {
            int index2 = index1 + 1;
            while (index2 < num.size()) {
                int opposite = -1 * (num.get(index1) + num.get(index2));
                if (seen.contains(opposite)) {
                    int possible_index = num.indexOf(opposite);
                    ArrayList<Integer> temp = new ArrayList<Integer>();
                    temp.add(num.get(possible_index));
                    temp.add(num.get(index1));
                    temp.add(num.get(index2));
                    if (!answer.contains(temp)) {
                        answer.add(temp);
                    }
                }
                index2 += 1;
            }
            seen.add(nums[index1]);
            index1 +=1;
        }
        return answer;
    }
}