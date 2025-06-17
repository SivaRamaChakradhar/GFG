class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        int maxRight = arr[n-1];
        for(int i=n-1;i>=0;i--){
            if(arr[i] >= maxRight){
                res.add(arr[i]);
                maxRight = arr[i];
            }
        }
        Collections.reverse(res);
        return res;
    }
}
