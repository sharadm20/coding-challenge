package arrays;

public class SortRotatedArray {
    public int search(int[] nums, int target)
    {
        int lo =0;
        int hi = nums.length-1;
        int mid;

        while(lo <= hi)
        {
            mid = (lo + hi) / 2;
            if(nums[mid] == target)
            {
                return mid;
            }

            else if(nums[mid] >= nums[lo])
            {
                if(target >= nums[lo] && target < nums[mid])
                {
                    hi = mid -1;
                }
                else
                {
                    lo = mid+1;
                }
            }
            else
            {
                if(target > nums[mid] && target <= nums[hi])
                {
                    lo = mid + 1;
                }
                else
                {
                    hi = mid-1;
                }
            }
        }

        return -1;
    }
}
