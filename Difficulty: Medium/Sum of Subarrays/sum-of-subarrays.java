class Solution {
    public int subarraySum(int[] arr) {
        int totalSum = 0;
        int n = arr.length;
        for(int i=0;i<arr.length;i++){
            totalSum += arr[i]*(i+1)*(n-i);
        }
        return totalSum;
    }
}
