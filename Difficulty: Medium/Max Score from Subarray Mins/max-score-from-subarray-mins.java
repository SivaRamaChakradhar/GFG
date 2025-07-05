class Solution {
    public int maxSum(int arr[]) {
        // code here
        int n = arr.length;

        int best = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            int cur = arr[i] + arr[i + 1]; // sum of the pair itself
            if (cur > best) best = cur;
        }
        return best;  
    }
}