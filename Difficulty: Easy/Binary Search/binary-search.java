class Solution {
    public int binarysearch(int[] arr, int k) {
        int n = arr.length;
        int low = 0, high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == k){
                while(mid-1 > -1 && arr[mid-1] == k){
                    mid = mid-1;
                }
                return mid;
            }
            else if(arr[mid] < k){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
}