class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int pointer1 = numbers.length - 1;
        int pointer2 = 0;
        while (pointer1 != pointer2) {
            int check = numbers[pointer1] + numbers[pointer2];
            if (check == target) {
                int[] answer = new int[2];
                answer[0] = pointer2 + 1;
                answer[1] = pointer1 + 1;
                return answer;
            }
            else if (check < target) {
                pointer2 += 1;
            }
            else {
                pointer1 -= 1;
            }
        }
        return numbers;
    }
}