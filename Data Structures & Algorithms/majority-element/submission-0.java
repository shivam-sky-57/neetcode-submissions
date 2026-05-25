class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> ans = new HashMap<>();
        int res = 0,maxCount = 0;
        for (int i=0;i<nums.length;i++) {
            ans.put(nums[i], ans.getOrDefault(nums[i],0)+1);

            if(ans.get(nums[i]) > maxCount) {
                res = nums[i];
                maxCount = ans.get(nums[i]);
            }
        }
        return res;
    }
}