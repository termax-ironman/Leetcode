class Solution {
    public int reverse(int x) {
        long res = 0;
        while(x != 0) {
            int r = x % 10;
            res = r + res;
            res = res * 10;
            x = x/10;
        }
        res = res / 10;
        if(res>Integer.MAX_VALUE || res<Integer.MIN_VALUE) {
            return 0;
        } 
        if(x < 0) {
            return (int) (-1 * res);
        }
        return (int)res;
    }
}