class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        int k = 0;

        while (i <= j) {
            if (nums[i] != val) {
                i++;
                k++;
            } else {
                if (nums[j] != val) {
                    nums[i] = nums[j];
                    nums[j] = val;
                    k++;
                } else {
                    j--;
                }
            }
        }
        return i;
    }
}