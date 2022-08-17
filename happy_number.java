import java.lang.*;
class Solution {
    public boolean isHappy(int n) {
        ArrayList<Integer> dict = new ArrayList<Integer>();
        int curr = n;
        while (true) {
            Stack<Integer> digits = new Stack<Integer>();
            while (curr > 0) {
                digits.push(curr % 10);
                curr = curr / 10;
            }
            int sum = 0;
            while (!digits.empty()) {
                sum += Math.pow(digits.pop(), 2);
            }
            System.out.println(sum);
            if (sum == 1) {
                return true;
            }
            if (dict.contains(sum)) {
                return false;
            }
            dict.add(sum);
            curr = sum;
        }
    }
}