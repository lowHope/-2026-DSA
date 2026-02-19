class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> checker = new HashSet<>();

        for (Integer i : nums) {
            if (checker.contains(i)) return true;
            checker.add(i);
        }

        return false;
    }
}