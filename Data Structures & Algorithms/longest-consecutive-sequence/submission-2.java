class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int res = 0;

        for (int num : nums){
            if(!set.contains(num - 1)) {
                int count = 0;
                int start = num;
                while(set.contains(start)){
                    count++;
                    start++;
                }
                res = Math.max(res, count);
            }
        }
        return res;
    }
}
