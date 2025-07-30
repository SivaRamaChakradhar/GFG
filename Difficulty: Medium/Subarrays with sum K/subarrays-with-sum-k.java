// User function Template for Java
class Solution {
    public int cntSubarrays(int arr[], int k) {
        int prefixSum = 0, count = 0;
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i : arr){
            prefixSum += i;
            if(prefixSum == k){
                count++;
            }
            if(h.containsKey(prefixSum-k)){
               count+=h.get(prefixSum-k); 
            }
            if(h.containsKey(prefixSum)){
                h.put(prefixSum, h.get(prefixSum)+1);
            }
            else{
                h.put(prefixSum, 1);
            }
        }
        return count;
    }
}