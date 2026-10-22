class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        
        int count = 0;
        int prefix = 0;
        
        for(int i = 0; i < nums.length; i++){
            prefix = prefix + nums[i];
            int diff = prefix -k;
            count = count + map.getOrDefault(diff, 0);
            map.merge(prefix, 1, Integer::sum);
        }
        
        
        return count;
    }
}