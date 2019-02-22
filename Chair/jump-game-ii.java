class Solution {
    public int jump(int[] nums) {
        int target = nums.length - 1;
        int maxCanReach = 0;
        int reach = 0;
        int count = 0;
        
        if (target == 0){
            return 0;
        }
        
        for (int i = 0; i < nums.length; i++) {
            int canReach = nums[i] + i;
            if (canReach >= target) {
                break;
            }
            reach = reach > canReach ? reach : canReach;
            if (i >= maxCanReach) {
                maxCanReach = reach;
                count++;
            }
        }
        return count + 1;
    }
}