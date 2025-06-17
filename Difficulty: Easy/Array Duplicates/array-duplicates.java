class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int num:arr){
            hs.put(num, hs.getOrDefault(num, 0)+1);
        }
        for(int val : hs.keySet()){
            if(hs.get(val)>1){
                res.add(val);
            }
        }
        return res;
    }
}