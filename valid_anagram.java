class Solution {
    public boolean isAnagram(String s, String t) {
        ArrayList first = new ArrayList ();
        ArrayList second = new ArrayList ();
        for (int i = 0; i < s.length(); i++) {
            first.add(s.charAt(i));
        }
        for (int j = 0; j < t.length(); j++) {
            second.add(t.charAt(j));
        }
        Collections.sort(first);
        Collections.sort(second);
        if (first.equals(second)) {
            return true;
        }
        return false;
    }
}