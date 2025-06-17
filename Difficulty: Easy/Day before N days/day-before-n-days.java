// User function Template for Java
class Solution {
    public static int nthDay(int d, int n) {
        // write your code here
        n = n%7;
        return (d-n+7)%7;
    }
}