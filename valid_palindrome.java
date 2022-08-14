import java.lang.*;
class Solution {
    public boolean isPalindrome(String s) {
        LinkedList<Character> front = new LinkedList<Character>();
        LinkedList<Character> back = new LinkedList<Character>();

        int start = 0;
        int end = s.length() - 1;

        for (int i = 0; i <= end; i++) {
            char f = s.charAt(start + i);
            if (Character.isLetterOrDigit(f)) {
                front.add(Character.toLowerCase(f));
            }
            char b = s.charAt(end - i);
            if (Character.isLetterOrDigit(b)) {
                back.add(Character.toLowerCase(b));
            }
        }
        if (front.equals(back)) {
            return true;
        }
        else {
            return false;
        }
    }
}