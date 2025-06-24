class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();
        if (len1 > len2) return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for (char c : s1.toCharArray()) {
            freq1[c - 'a']++;
        }

        for (int i = 0; i < len2; i++) {
            freq2[s2.charAt(i) - 'a']++; 
            if (i >= len1) {
                freq2[s2.charAt(i - len1) - 'a']--;
            }
            if (Arrays.equals(freq1, freq2)) {
                return true;
            }
        }

        return false;
    }
}