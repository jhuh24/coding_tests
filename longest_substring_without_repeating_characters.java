class Solution {
    public int lengthOfLongestSubstring(String s) {
        //Need to find max length
        //Set initial max equal to 0
        int maximum = 0;
        int count = 0;
        //Go through the string starting at the beginning
        HashSet seenLetters = new HashSet();
        char[] letters = s.toCharArray();
        int arrayIndex = 0;
        while (arrayIndex < s.length()){
            for (int x = arrayIndex; x < s.length(); x++){
                if (seenLetters.contains(letters[x])) {
                    maximum = Math.max(maximum, count);
                    count = 0;
                    arrayIndex += 1;
                    seenLetters.clear();
                    break;
                }
                else {
                    seenLetters.add(letters[x]);
                    count += 1;
                }
                maximum = Math.max(maximum, count);
            }
        }
        return maximum;
        //Stop count when you hit a repeat letter
        //Change the max when you find a new max
        //Return max number
    }
}