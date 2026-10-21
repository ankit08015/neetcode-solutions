class Solution {
    public void sortColors(int[] nums) {
                int [] count = new int [3];

        for (int num : nums) {
            count[num]++;
        }
        int i = 0, j = 0;
        for (int num : count) {
            while (count[i]-- > 0) {
                nums[j++] = i;
                
            }
            i++;
        }
    }
}