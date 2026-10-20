// Last updated: 10/20/2026, 9:35:33 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] >= target){
            return i;
            }
        }
    return nums.length;
    }
}