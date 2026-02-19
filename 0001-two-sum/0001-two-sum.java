class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<n; i++) {
            int res = target - nums[i];
            if (map.containsKey(res)) {
                ans[0] = i;
                ans[1] = map.get(res);
            } else {
                map.put(nums[i], i);
            }
        }
        return ans;
    }
}