class Solution {
    public int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }
        ArrayList<Integer> memory = new ArrayList<Integer>(n + 1);
        for (int i = 0; i < n + 1; i++) {
            memory.add(-1);
        }
        return checkMem(memory, n);
    }

    public int checkMem(ArrayList<Integer> memory, int n) {
        if (memory.get(n) > 0) {
            return memory.get(n);
        }
        if (n <= 1) {
            return 1;
        }
        else {
            int newMem = checkMem(memory, n - 1) + checkMem(memory, n - 2);
            memory.set(n, newMem);
            return newMem;
        }
    }
}