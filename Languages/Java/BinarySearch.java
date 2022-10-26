import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        
    }

    int binarySearch(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length, start=0, end=n-1;
        while(start<end) {
            int mid = start+(end-start)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target) start = mid+1;
            else end = mid-1;
        }
        
        return -1;
    }
}