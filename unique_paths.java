class Solution {
    public int uniquePaths(int m, int n) {
        HashMap<Pair<Integer, Integer>, Integer> memory = new HashMap<Pair<Integer, Integer>, Integer> ();

        int paths = checkPaths(memory, m - 1, n - 1);
        return paths;
    }

    public int checkPaths(HashMap<Pair<Integer, Integer>, Integer> memory, int m, int n) {
        if (m < 0 || n < 0) {
            return 0;
        }
        if (m == 0 && n == 0) {
            return 1;
        }
        Pair<Integer, Integer> curr = new Pair<Integer, Integer> (m, n);
        if (memory.containsKey(curr)) {
            return memory.get(curr);
        }
        else {
            int paths = checkPaths(memory, m - 1, n) + checkPaths(memory, m, n - 1);
            memory.put(curr, paths);
            return paths;
        }
    }
}