class Solution {
    public int missingNumber(int[] arr) {
        int n=1;
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        while(!set.isEmpty()){
            if(!set.contains(n)){
                return n;
            }
            n++;
        }
        return -1;
    }
}
