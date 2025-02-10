class Solution {
    public boolean isPalindrome(int x) {
        long revVal = 0;
        int temp = x;
        if(x < 0)
        return false;
        else {
           while(temp != 0) {
            int rem = temp % 10;
            revVal = revVal * 10;
            revVal += rem;
            temp = temp/10;
           }
           if(x == revVal) {
            return true;
           }
           else return false;
        }
    }
}