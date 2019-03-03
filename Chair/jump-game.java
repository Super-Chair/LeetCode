public class Solution {
    public boolean canJump(int[] nums) {
        int reach = 0;  
        int i = 0;  
        for ( ; i < nums.length && i <= reach; i++) {  
            reach = reach > nums[i]+i ? reach:nums[i]+i;
        }  
        return i == nums.length;
    }
}