class Solution {
    public static int maximumElement(ArrayList<Integer> arr) {
        // Your code here
        Collections.sort(arr);
        return arr.get(arr.size()-1);
    }

    public static int minimumElement(ArrayList<Integer> arr) {
        
        // Your code here
        Collections.sort(arr);
        return arr.get(0);
        
    }
}
