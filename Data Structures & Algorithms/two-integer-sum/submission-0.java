class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> ans = new HashMap<>();
        for (int i=0 ;i<nums.length;i++) {
            int val = nums[i];
            int diff = target - val;

            if(ans.containsKey(diff)) {
                return new int[] {ans.get(diff),i};
            }

            ans.put(val,i);
        }
        return new int[] {};
    }
}
