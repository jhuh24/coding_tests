class Solution {
    public boolean isValid(String s) {
        Stack<Character> storage = new Stack<Character> ();
        int len = s.length();
        if (len % 2 != 0) {
            return false;
        }
        int counter = 0;

        while (counter < len) {
            char curr = s.charAt(counter);
            if (curr == ')' || curr == ']' || curr == '}') {
                if (storage.empty()) {
                    return false;
                }
                if (curr == ')') {
                    if ('(' == storage.pop()) {
                        counter += 1;
                        continue;
                    }
                    else {
                        return false;
                    }
                }
                else if (curr == ']') {
                    if ('[' == storage.pop()) {
                        counter += 1;
                        continue;
                    }
                    else {
                        return false;
                    }
                }
                else if (curr == '}') {
                    if ('{' == storage.pop()) {
                        counter += 1;
                        continue;
                    }
                    else {
                        return false;
                    }
                }
            }
            else {
                storage.push(curr);
                counter += 1;
            }
        }
        if (storage.empty()) {
            return true;
        }
        else {
            return false;
        }
    }
}




