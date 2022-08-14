class Solution {
    public int maxProfit(int[] prices) {
        HashMap<Integer, Integer> profit = new HashMap<Integer, Integer> ();
        int min = 1000000;
        int max = 0;
        for (int i : prices) {
            if (i < min) {
                min = i;
            }
            else if (i - min > max) {
                max = i - min;
            }
        }
        return max;
    }
}